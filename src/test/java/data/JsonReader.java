package data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader  {
	public String f,l,e,p;
	
	public void parsing()throws IOException,ParseException 
	{
		String path = System.getProperty("user.dir")+"/src/test/java/data/user.json";
		File fi = new File(path);
		JSONParser pa = new JSONParser();
		JSONArray ja =(JSONArray)pa.parse(new FileReader(fi));
		for(Object jsonObj : ja) 
		{
			JSONObject person = (JSONObject) jsonObj ; 
			f  = (String) person.get("first"); 
			System.out.println(f);

			l = (String) person.get("last"); 
			System.out.println(l);

			e = (String) person.get("email"); 
			System.out.println(e);

			p = (String) person.get("pass"); 
			System.out.println(p);

		}
		
	}

}
