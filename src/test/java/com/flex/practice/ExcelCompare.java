package com.flex.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelCompare {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("D:\\Selenium\\Sample.xlsx"); 
		XSSFWorkbook wb1= new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb1.getSheetAt(0);
		int rcount1=sheet1.getPhysicalNumberOfRows();
		//System.out.println("Row count in sheet1 is:  "+rcount1);
		
		FileInputStream fis1= new FileInputStream("D:\\Selenium\\Sample.xlsx"); 
		XSSFWorkbook wb2= new XSSFWorkbook(fis1);
		XSSFSheet sheet2=wb2.getSheetAt(1);
		int rcount2=sheet2.getPhysicalNumberOfRows();
		//System.out.println("Row count in sheet1 is:  "+rcount2);
		int count=0;
		for (int i=0; i <rcount1;i++)  {
			String sheet1data="";
			String sheet2data="";
			
			int cols=sheet1.getRow(i).getPhysicalNumberOfCells();
			//System.out.println("Cols count is: "+cols);
			for (int j=0;j<cols;j++) {
				Cell cell1=sheet1.getRow(i).getCell(j);
				Cell cell2=sheet2.getRow(i).getCell(j);
				if (cell1 !=null) {
				cell1.setCellType(Cell.CELL_TYPE_STRING);
				String data1=cell1.getStringCellValue();
				sheet1data+=data1+","; }
				
				if (cell2 !=null) {
				cell2.setCellType(Cell.CELL_TYPE_STRING);
				String data2=cell2.getStringCellValue();
				sheet2data+=data2+","; }
				
			}
			
		   
			if (!sheet1data.equalsIgnoreCase(sheet2data))
			{   
				count++;
				System.out.println("Data is not matching for row: "+i);
				System.out.println("Sheet1 data is: "+sheet1data);
				System.out.println("Sheet2 data is: "+sheet2data);
			} 
				
			
		}
		if (count==0) {
			System.out.println("Data is exactly matching");
		}
		
		}
	
}

	


