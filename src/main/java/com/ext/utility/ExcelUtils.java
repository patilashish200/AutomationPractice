package com.ext.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ext.baseTest.BaseTestCase;

public class ExcelUtils {
	
	static Workbook wb;
	
	 static Sheet sh;
	 
   public static Sheet setExcel(String sFilepath, String sFilename, String sSheetname) throws IOException
   {

	 FileInputStream fis = new FileInputStream(sFilepath+"//"+sFilename);
	
	 String sFileExtension = sFilename.substring(sFilename.indexOf("."));
	 
	 if (sFileExtension.equals(".xls"))
	 {
	
		wb = new HSSFWorkbook(fis);
	 }
	
	 else if (sFileExtension.equals(".xlsx"))
	 {
			wb = new XSSFWorkbook(fis);
	 }

	sh =wb.getSheet(sSheetname);
	return sh;
	 
}

   
   
 public static String getCellContent(int iRowNum, int iColNum)
 {
	String cellValue = sh.getRow(iRowNum).getCell(iColNum).getStringCellValue();
	 
	return cellValue;
	 
 }
   

   
 
 public static int getRowNum (String sTestCaseName, int col)
 {
	  int rowCount = sh.getLastRowNum()- sh.getFirstRowNum();  
	  
	  System.out.println("FirstRow Num "+ sh.getFirstRowNum());
	  
	  System.out.println("Last Row Num "+ sh.getLastRowNum());
	  
	  System.out.println("RowCount" +rowCount);
	  
	 
	 int i=0;
	 
	 for (i=0; i< rowCount+1 ; i++)
	 
	 {
		 if (getCellContent(i,col).equals(sTestCaseName))
		 {
				 break;
		 }	 
	 }
	return i;
	 
 }
 
 
 public static void main(String args[]) throws IOException
 {
	 System.out.println("Inside main mentod");
	 
	 ExcelUtils.setExcel("C:\\Users\\USER\\Desktop","TestData1.xlsx","data");
	 
	int rowNo=  ExcelUtils.getRowNum("TC_6", 0);
	
	System.out.println(rowNo);
	 
	 
	 
	 
 }
 
 
}
