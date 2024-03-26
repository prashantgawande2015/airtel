package practice_program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_excel_file2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

System.out.println("Shree sWami samarth");
//open the file

File objfile = new  File("E:\\Radical_akolkar_class_2\\TestData.xlsx");

// Read the file
FileInputStream fis = new FileInputStream(objfile);
// read the cellvalue
XSSFWorkbook excelbook = new XSSFWorkbook(fis);
String cellvalue = excelbook.getSheet("sheet1").getRow(2).getCell(2).toString();
System.out.println(cellvalue);



	
		
		
	}

}
