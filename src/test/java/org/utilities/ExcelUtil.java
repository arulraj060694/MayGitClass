package org.utilities;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	// ===========================
	//  Excel Utility (Dynamic Path)
	// ===========================
	public String getExcelData(String filePath, String sheetName, int rowNum, int cellNum) {

		try (FileInputStream fis = new FileInputStream(filePath); Workbook book = new XSSFWorkbook(fis)) {

			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);

			if (cell.getCellType() == CellType.STRING) {
				return cell.getStringCellValue();
			}

			if (cell.getCellType() == CellType.NUMERIC) {

				if (DateUtil.isCellDateFormatted(cell)) {
					return new SimpleDateFormat("dd/MM/yyyy").format(cell.getDateCellValue());
				} else {
					return BigDecimal.valueOf(cell.getNumericCellValue()).toString();
				}
			}

		} catch (Exception e) {
			throw new RuntimeException("Excel read failed");
		}

		return null;
	}
}
