package org.testing.man;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class T27_CreateExcelFile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("src/test/resources/Testing.xls");
		FileOutputStream fo = new FileOutputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook();	//Horrible SpreadSheet Format
		wb.createSheet();
		wb.write(fo);
		wb.close();

	}

}

