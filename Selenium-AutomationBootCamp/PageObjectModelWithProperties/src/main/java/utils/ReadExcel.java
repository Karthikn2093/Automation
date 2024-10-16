package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] readExcel(String fileName) throws IOException {
		
		
		//Get into workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+fileName+".xlsx");
		
		//Get into worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//Get Row Count
		int rowCount = ws.getLastRowNum();
		
		//Get Cell Count
		int cellCount = ws.getRow(0).getLastCellNum();
		
		//To get Row count including First row which is Header
		ws.getPhysicalNumberOfRows();
		
		String[][] data = new String[rowCount][cellCount];
		
		for (int i = 1; i <= rowCount; i++) {
			
			for (int j = 0; j < cellCount; j++) {
				
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				
				data[i-1][j] = 	cellValue;		
			}
			
		}
		
		wb.close();
		
		return data;
	}

}
