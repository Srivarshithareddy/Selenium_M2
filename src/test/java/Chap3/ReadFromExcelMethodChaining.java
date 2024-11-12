package Chap3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelMethodChaining {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		FileInputStream fis= new FileInputStream("./src/test/resources/TestData.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);//workbookfactory implementing class
		
		double data = wb. getSheet ("Sheet1").getRow(2).getCell(1).getNumericCellValue();//row, c
		
		System.out.println(data);
		}
		

	}


