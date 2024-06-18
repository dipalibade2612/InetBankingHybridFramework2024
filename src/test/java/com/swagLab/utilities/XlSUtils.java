package com.swagLab.utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class XlSUtils 
{
	
		public static String[][] getExcelData(String fileName, String sheetName)
		{
	    	
	    	String[][] data = null;   	
		  	try
		  	{
		   	FileInputStream file = new FileInputStream(fileName);
		      XSSFWorkbook workBook = new XSSFWorkbook(file); 
				XSSFSheet sheet = workBook.getSheet(sheetName);
				XSSFRow row = sheet.getRow(0);
				int noOfRows = sheet.getPhysicalNumberOfRows();
				int noOfCols = row.getLastCellNum();
				Cell cell;
				data = new String[noOfRows-1][noOfCols];
				for(int i =1; i<noOfRows;i++){
				   row = sheet.getRow(i); 
					for(int j=0;j<noOfCols;j++){
				    	
				    	   cell= row.getCell(j);
				    	   data[i-1][j] = cell.getStringCellValue();
				 	   }
				}
			
		  	}
		  	catch (Exception e) 
		  	{
		   
		     	           	}
	    	return data;
		}	

	}


