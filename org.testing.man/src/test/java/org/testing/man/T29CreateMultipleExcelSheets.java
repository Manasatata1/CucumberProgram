//Create multiple excel sheets

package org.testing.man;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class T29CreateMultipleExcelSheets {

	public static void main(String[] args) throws IOException {
		
		for(int i=1;i<=4;i++) 
		{
			
		File f = new File("src/test/resources/File"+i+ ".xls");
		FileOutputStream fo = new FileOutputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook();
		wb.createSheet();
		wb.write(fo);
		wb.close();
		}

	}

}
