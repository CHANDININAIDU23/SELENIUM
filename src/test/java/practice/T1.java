package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class T1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file =	new FileInputStream(System.getProperty("user dir")+"\\testdata\\testdata.1.xlsx");
		 XSSFWorkbook workbook=new XSSFWorkbook (file); //open the workbook from excelfile
	      
	      XSSFSheet sheet=workbook.getSheet("sheet1"); // get the sheet form workbook
	      
	      // XSSFSheet sheet=workbook.getSheetAt(0);   //another method to get sheet form workbook
	      
        int totalrows =sheet.getLastRowNum(); //to get the number of rows
                        
            int totalcells = sheet.getRow(1).getLastCellNum(); //to get the number of cells 
            
            System.out.println("number of rows"+totalrows);
            System.out.println("number of columns"+totalcells);
            
            for(int r=0;r<totalrows;r++)     // r=0  0<6t    r=1  1<6t  r=2 2<6t
            {
                XSSFRow currentrow = sheet.getRow(r);// get the entire row,  extract particular row
                
                for(int c=0;c<totalcells;c++) // c=0 0<4 t  1<4t  2<4 3<4t  3<4t   4<4f
                {                             // c=0 0<4 t  1<4t  2<4 3<4t  3<4t   4<4f
                    XSSFCell cell =currentrow.getCell(c);    // 0 1  2  3 
                    System.out.print(cell.toString()+"\t");
                }
                
                System.out.println();
            }  

	}

	

}
