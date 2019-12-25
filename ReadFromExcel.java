package week4.day1testng;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	private static String stringCellValue;

	public static String[][] excelData(int SheetNo) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./Testdata/TestData.xlsx");

		XSSFSheet ws = wb.getSheetAt(SheetNo);
		int rowcount = ws.getLastRowNum();
		short cellcount = ws.getRow(0).getLastCellNum();
		/*
		 * XSSFRow row = ws.getRow(1); XSSFCell cell = row.getCell(0); String cellvalue
		 * = cell.getStringCellValue();
		 */

		String[][] data = new String[rowcount][cellcount];

		for (int i = 1; i <= rowcount; i++) {

			for (int j = 0; j < cellcount; j++) {

				data[i - 1][j] = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data[i - 1][j]);

			}

		}

		wb.close();
		return data;
	}
}
