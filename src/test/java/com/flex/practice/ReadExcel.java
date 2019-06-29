package com.flex.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
File src= new File("D:\\Selenium\\Sample.xlsx");
		
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(2);
		
		int rows=sheet.getLastRowNum();
		
		System.out.println("Number of rows are: "+rows);
		
		int cols=sheet.getRow(0).getLastCellNum();
		
		System.out.println("Number of columns are : "+cols);
		
		String username=sheet.getRow(1).getCell(0).getStringCellValue();
		
		String password=sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println("User name is: "+username);
		
		System.out.println("User name is: "+password);
		
		
		wb.close();
		

	}

}
