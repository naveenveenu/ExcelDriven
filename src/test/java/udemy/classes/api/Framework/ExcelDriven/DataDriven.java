package udemy.classes.api.Framework.ExcelDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	
	// Identify testcases column by scanning entire row
	//once column is identified scan entire testcases column to identify purchase tests
	// after you grab purchase test case row pull all the data and grab from the rows
	public ArrayList<String> getData(String name) throws IOException {
		
		ArrayList<String> ary = new ArrayList<String>();
		
		FileInputStream fis = new FileInputStream("D:\\personal\\STUDY\\TestAutomation\\ExcelDrivenFramework.xlsx");
		//accepts as fileinputsteream orgument
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//sheets....
		
		int sheetCount = workbook.getNumberOfSheets();
		
		for (int i = 0; i < sheetCount; i++) { // sheet level 
			String sheetName = workbook.getSheetName(i);
			
			if (sheetName.equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows =  sheet.iterator(); //sheet is a collection of rows...
				Row firstRow = rows.next();
				Iterator<Cell> ce =  firstRow.cellIterator(); // row is collection of cells...
				int k=0;
				int columnIndex = 0;
				int rowIndex =0;
				while (ce.hasNext()) {
					String value = ce.next().getStringCellValue();
					if (value.equalsIgnoreCase("TestCases")) {
						columnIndex = k;
						break;
					}
					
					k++;
				}
				System.out.println(columnIndex);
				
				while (rows.hasNext()) {
					Row r = rows.next();
					String rowValue = r.getCell(columnIndex).getStringCellValue();
					
					if (rowValue.equalsIgnoreCase(name)) {
						Iterator<Cell> cellData = r.cellIterator();
						
						while (cellData.hasNext()) {
							Cell cv = cellData.next();
							if (cv.getCellTypeEnum() == CellType.STRING) {
								ary.add(cv.getStringCellValue());
							}else {
								ary.add(NumberToTextConverter.toText(cv.getNumericCellValue()));
							}
						}
					}
				}
				break;
			}
		}
		return ary;
	}
	
}