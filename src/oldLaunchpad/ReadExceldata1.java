package oldLaunchpad;

import org.testng.annotations.DataProvider;

import lib.ExceldataConfig;

public class ReadExceldata1 {
	
	public static void main(String[] args)
	{
		
		ExceldataConfig excel=new ExceldataConfig("C:\\Sachin\\Sachin\\Selenium\\testdata.xlsx");
		
		System.out.println(excel.getData(1, 7, 1));
	}

}
