package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static String projectPath;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName) {
		try {

			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);

		} catch (Exception exp) {
			exp.printStackTrace();
		}

	}

	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);

	}
	public static int getRowCount() {
		int rowCount = 0;

		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count:" +rowCount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;

	}

	public static int getColCount() {
		int ColCount = 0; 

		try {

			ColCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Column Count:" +ColCount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

		return ColCount;
	}

	public static String getCellDataString(int rowNum, int colNum) {

		String cellData = null;
		try {
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;

	}

	public static void getCellDataNumber(int rowNum, int colNum) {

		try {
			double cellDataNumber = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}
