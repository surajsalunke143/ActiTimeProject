package Com.ActiTimeGenericLibrary;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/*
 * This class iss generic class which is having nonstatic methods to perform datadriven testing 
 * @author suraj salunke//who is desigining the filelibrary
 * 
 * 
 * */
public class FileLibrary {
	/**
	 * This method is a non static methd which is use to read data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */

	public String readDataFromProperty(String key) throws IOException {
		FileInputStream file = new FileInputStream("./Testdata/commondata.property");
		Properties p = new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}
/**
 *  This method is a non static methd which is use to read data from excel sheet
 * @param sheetname
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */

	public String readDatafromexcelFile(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException 
{
		FileInputStream Files1 = new FileInputStream("./TestData/Actitime1.xlsx");
	   Workbook wb = WorkbookFactory.create(Files1);
	   String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	   return value;
	   
}
}