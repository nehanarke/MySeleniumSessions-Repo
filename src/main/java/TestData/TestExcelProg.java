package TestData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.testng.annotations.DataProvider;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcelProg 
{
	public static String[][]getExcelData(String filePath,String Sheetname) throws IOException
		{
		FileInputStream file=new FileInputStream(filePath);
		Workbook workbook=new XSSFWorkbook(file);		
		Sheet sheet=workbook.getSheet(Sheetname);
		
		 int rows = sheet.getPhysicalNumberOfRows();
	        int cols = sheet.getRow(0).getLastCellNum();
	        
	        String[][] data = new String[rows - 1][cols];

	        for (int i = 1; i < rows; i++) {
	            Row row = sheet.getRow(i);
	            for (int j = 0; j < cols; j++) {
	                Cell cell = row.getCell(j);
	                data[i - 1][j] = cell.getStringCellValue();
	            }
	        }

	        workbook.close();
	        file.close();
	        return data;
	    }
		}	