package com.flex.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File src= new File("D:\\Selenium\\Sample.xlsx");
		
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		sheet.getRow(0).createCell(1).setCellValue("Selenium");
		
		sheet.getRow(0).createCell(2).setCellValue("Pass");
		
		FileOutputStream fout= new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
		
		

	}

}
