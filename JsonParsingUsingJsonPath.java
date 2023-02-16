package org.testing.Helper;

import io.restassured.response.Response;

public class JsonParsingUsingJsonPath {
	
	public static String jsonextract(Response res, String jsonpath)
	
	{
		
	String extractedValue=res.jsonPath().get(jsonpath).toString();
		
		return extractedValue;
		
	}

}
