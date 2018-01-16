package oldLaunchpad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	


public static void main (String [] args) throws Exception
{
	File f=new File("C:\\PNR\\JAVA\\Data Excel\\testdata.xlsx");
	
	FileInputStream Fis = new FileInputStream(f);
	
	XSSFWorkbook Ex = new XSSFWorkbook(Fis);
	
	XSSFSheet sheet1 = Ex.getSheetAt(0);
	
	int countrow=sheet1.getLastRowNum();
	System.out.println(countrow);
	
	for(int i=0;i<=countrow;i++) {
		
					
	String data1= sheet1.getRow(i).getCell(0).getStringCellValue();
	String data2= sheet1.getRow(1).getCell(1).getStringCellValue();
	
	System.out.println("Data ID  is "+data1+" "+"Pass"+" "+data2);
	
	
	}
	Ex.close();
	
	
	
	
}
}
