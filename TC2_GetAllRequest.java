package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesLod;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_GetAllRequest {
	
@Test
	public void testcase2() throws IOException
	{
		Properties p = PropertiesLod.handleProperties("../RestAssuredFramework/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response re=http.GetAllRequest("QA_URI");
		
		JsonParsingUsingOrgJson.jsonParse(re.asString(), "id");
	
		
	}

}
