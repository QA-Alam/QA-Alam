package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtiliti {
	// Constants variable
	final static String excelData = "./ZooplaTestData/TestData.xlsx"; // Excel location

	public static ArrayList<String> readExcelData(int col) throws IOException {

		// FileInputStream class identify the location of excel file (Is is from Java
		// class)
		FileInputStream file = new FileInputStream(excelData);

		// We have to handle the excel location by XSSFWorkbook object (Is is from
		// Apache POI class)
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// We have to handle the sheet name by XSSFSheet object (Is is from Apache POI
		// class)
		XSSFSheet sheet = workbook.getSheet("testData"); // Sheet name

		Iterator<Row> row = sheet.iterator();
		row.hasNext();

		// List is an interface & arreyList is a class
		// List<String> list = new ArrayList<String>();

		ArrayList<String> list = new ArrayList<String>();

		// while Loop can handle end number of data
		while (row.hasNext()) {

			// list object take the control of list of data from (excel, web-element db
			// value,
			list.add(row.next().getCell(col).getStringCellValue());
		}
		// Print out the values
		System.out.println(list);
		return list;

	}

}
