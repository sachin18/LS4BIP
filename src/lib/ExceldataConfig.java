package lib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataConfig {
	XSSFWorkbook Ex ;
	XSSFSheet sheet1;
	
	public ExceldataConfig(String excel)

	{
		try {
		File f=new File(excel);
		
		FileInputStream Fis = new FileInputStream(f);
		
		Ex = new XSSFWorkbook(Fis);
		
		
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public  String getData(int sheetnum,int row,int column) {
		
	 sheet1 = Ex.getSheetAt(sheetnum);
	
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	public int getRowcount(int sheetnum)
	{
		int Row = Ex.getSheetAt(sheetnum).getLastRowNum();
		Row+=1;
		return Row;
	}
		
	
}

