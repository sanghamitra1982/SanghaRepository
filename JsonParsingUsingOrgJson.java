package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJson {
	
	public static void jsonParse(String responseData, String Keyname)
	{
		JSONArray js= new JSONArray(responseData);
		int L= js.length();
		
		for(int i=0;i<L;i++ )
		{
			JSONObject ob= js.getJSONObject(i);
			System.out.println(ob.get(Keyname));
		}
		

	}
}
