package com.flex.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File src=new File("C:\\Users\\Subba Reddy\\Desktop\\Sample.pdf");
		
		FileInputStream fis=new FileInputStream(src);
		
		PDDocument objdoc=PDDocument.load(fis);
		
		PDFTextStripper stipper= new PDFTextStripper();
		
		String text=stipper.getText(objdoc);
		
		System.out.println(text);
		

	}

}
