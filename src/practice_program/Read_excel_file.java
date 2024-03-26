package practice_program;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_excel_file {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
	
		// Print swami
		System.out.println("SHREE SWAMI SAMARTH");
		//open excel file
		// use File class of java, it belongs to java.io package
		
		File objfile = new  File("E:\\Radical_akolkar_class_2\\TestData.xlsx");
		// Read the file which is open
		// use again FileInputStream class from java, it also belongs to java.io
		
		FileInputStream fis = new FileInputStream (objfile);
		// Appche POI Jar: having the set of some interfaces and classes
		
		// Now read cell 
		// workbook is Interface it belongs to org.apache.poi.xssf.usermodel package
		// excelbook is an object 
		//XSSFWorkbook : name of class
	    XSSFWorkbook  excelbook = new XSSFWorkbook(fis);
	    String cellvalue= excelbook.getSheet("Sheet1").getRow(3).getCell(2).toString();
	    
	    System.out.println(cellvalue);
	    
		
		
		

	}

}
