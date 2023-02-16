package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class HandleJsonFile {
	
	public static String readJson(String path) throws FileNotFoundException
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject j= new JSONObject(js);
		
		return j.toString();
		
		
		
		
		
		
	}

}
