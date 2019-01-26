package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
 static FileInputStream f = null;
 
 public FileInputStream getfile()
 {
	 String path =System.getProperty("user.dir")+"/src/test/java/data/Book1.xlsx";
	 File fi = new File(path);
	 
	 try {
		f= new FileInputStream(fi);
	} catch (FileNotFoundException e) {
		
		System.out.println(e.getMessage());
		System.exit(0);
	}
	 
	return f;		 
 }
 public Object[][] getdata() throws IOException
 {
	 f=getfile();
	 XSSFWorkbook wo = new XSSFWorkbook(f);
	 XSSFSheet s = wo.getSheetAt(0);
	 int row = (s.getLastRowNum()+1);
	 int col = 4;
	 String [][] bn = new String[row][col];
	 for (int y = 0; y < row; y++) {
		 for (int i = 0; i < col; i++) {
			 XSSFRow r = s.getRow(y);
			 bn[y][i]=r.getCell(i).toString();
		}
	}
	wo.close();
	return bn;
 }
}
