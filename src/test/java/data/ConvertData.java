package data;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConvertData 
{
	//load data from Data.properties file
	public static Properties Data = ConvertData(System.getProperty("user.dir")+"\\src\\main\\java\\Properties\\Data.Properties");



	private static Properties ConvertData(String path)
	{
		Properties p = new Properties();
		try {
			FileInputStream f = new FileInputStream(path);
			try {
				p.load(f);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	 catch (NullPointerException e) {
		System.out.println(e.getMessage());
	}
		return p;

	}


}
