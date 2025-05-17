 package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelredding {//C:\Users\Admin\eclipse-workspace\SELENIUM\testdata\Book 21.xlsx

	public static void main(String[] args) throws IOException {
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Book 21.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(fs);
		
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		int totrows= sheet.getLastRowNum();
		int totcell= sheet.getRow(1).getLastCellNum();
		
		System.out.println(totrows);
		System.out.println(totcell);
		
		for(int r=0;r<=totrows;r++) {
			XSSFRow currentrow=sheet.getRow(r);
			
			for(int c=0 ;c<totcell;c++) {
				
				XSSFCell cell=currentrow.getCell(c);
				
				System.out.println(cell.toString());
	}
		
		}
	         System.out.println();
	
	}

}
