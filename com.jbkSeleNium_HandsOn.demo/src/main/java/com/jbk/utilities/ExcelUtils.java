package com.jbk.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {

	FileInputStream fis;
	XSSFWorkbook wb =null;
	XSSFSheet sheet=null;
	int rowcount=0;
	int colcount=0;
	XSSFRow row=null;
	XSSFCell cell=null;
	String header =null;
	List<String>explist;

	DataFormatter dataformat= new DataFormatter();
	public  List<String>   getExcelColumnData(String sheetname,int sheetNo, int columnNo)
	{
		
		try {
			fis = new FileInputStream(sheetname);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(sheetNo);
			rowcount = sheet.getLastRowNum();  // 5
			colcount = sheet.getRow(0).getLastCellNum(); // 3

			explist = new ArrayList<String>();

			for(int i=1; i<=rowcount; i++)  // <5
			{
				row=sheet.getRow(i);
				cell=row.getCell(columnNo);
				header= dataformat.formatCellValue(cell);

				explist.add(header);
				/*
				 * if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC) { long value =(long)
				 * cell.getNumericCellValue(); header=Long.toString(value); explist.add(header);
				 * } else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
				 * header=cell.getStringCellValue(); explist.add(header); }
				 */
			}	

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return explist;

	}

	public  List<String>   getExcelHeaderData(String sheetname,int sheetNo)
	{

		try {
			fis = new FileInputStream(sheetname);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(sheetNo);
			//int rowcount = sheet.getLastRowNum();  // 5
			int colcount = sheet.getRow(0).getLastCellNum(); // 3

			explist = new ArrayList<String>();
			for(int i=0; i<colcount; i++)  // <5
			{
				row=sheet.getRow(0);
				cell=row.getCell(i); // getrow(1).getcell(i)
				header =cell.getStringCellValue();
				explist.add(header);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return explist;
	}

	@SuppressWarnings("resource")
	public List<String> getExcelRowData(String sheetname, int sheetNo, int rowno)
	{
		try {
			fis = new FileInputStream(sheetname);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(sheetNo);
			rowcount = sheet.getLastRowNum();  
			colcount = sheet.getRow(0).getLastCellNum(); 

			explist = new ArrayList<String>();
			for(int i=1; i<=colcount; i++) 
			{
				row=sheet.getRow(rowno);
				cell=row.getCell(i); // getrow(1).getcell(i)
				header= dataformat.formatCellValue(cell);

				explist.add(header);
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return explist;

	}

}
/*


 */