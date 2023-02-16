package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesLod;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC7_GetAllRequestRealtime {
@Test
	
	public void testcase7() throws IOException {
		Properties p = PropertiesLod.handleProperties("../RestAssuredFramework/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response re=http.GetAllRequest("QA_URI2");
		
		JsonParsingUsingOrgJson.jsonParse(re.asString(), "id");
	
		
	}

}
