package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void main(String[] args) {
	}
	public static void test() throws FileNotFoundException //To declare the checked exception
	{		
		FileInputStream file=new FileInputStream("D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
	}
	public static void test2()
	{
		try {
			FileInputStream file=new FileInputStream("D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//public static void test3 throws ArithmeticException
	{
		
	}
	//public static void test4 throws IOException
	{
		
	}
}
