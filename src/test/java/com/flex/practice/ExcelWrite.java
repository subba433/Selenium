package com.flex.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//File src=new File("D:\\Selenium\\Sample.xlsx");
		FileInputStream fis= new FileInputStream("D:\\Selenium\\Sample.xlsx"); 
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		sheet.getRow(1).createCell(0).setCellValue("Selenium");
		sheet.getRow(1).createCell(1).setCellValue("Pass");
		
		sheet.getRow(2).createCell(0).setCellValue("QTP");
		sheet.getRow(2).createCell(1).setCellValue("Fail");
		
		sheet.getRow(3).createCell(0).setCellValue("Test Complete");
		sheet.getRow(3).createCell(1).setCellValue("Pass");
		
		sheet.getRow(4).createCell(0).setCellValue("Load Runner");
		sheet.getRow(4).createCell(1).setCellValue("Pass");
		
		FileOutputStream fout= new FileOutputStream("D:\\Selenium\\Sample.xlsx");
		
		wb.write(fout);
		//fout.flush();
		wb.close();
		
		

	}

}
