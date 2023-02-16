package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesLod;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC9_UpdateRequest {
@Test
	public void testcase9() throws IOException {
		
		Properties p = PropertiesLod.handleProperties("../RestAssuredFramework/URI.properties");
		String body = HandleJsonFile.readJson("../RestAssuredFramework/src/main/java/org/testing/resources/InputPayloadforUpdate.json");
	
		String replacedbody= JsonReplacement.replaceJsonData(body, "id", TC1_PostRequest.returnidValue);
		
		
		HTTPMethods http = new HTTPMethods(p);
		Response res=http.updateRequest(replacedbody, "QA_URI2", TC1_PostRequest.returnidValue);
	}
}
