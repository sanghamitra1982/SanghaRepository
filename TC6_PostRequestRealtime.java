package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.Helper.JsonParsingUsingJsonPath;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesLod;
import org.testing.utilities.RandomData;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_PostRequestRealtime {
	

	static String returnidValue;
@Test
	public void testcase6() throws IOException {
		
		
		Properties p = PropertiesLod.handleProperties("../RestAssuredFramework/URI.properties");
		String body = HandleJsonFile.readJson("../RestAssuredFramework/src/main/java/org/testing/resources/InputPayload.json");
	
		String replacedbody= JsonReplacement.replaceJsonData(body, "id", RandomData.generateRandomData());
		
		
		HTTPMethods http = new HTTPMethods(p);
		Response res=http.postRequest(replacedbody, "QA_URI2");
		
		returnidValue=JsonParsingUsingJsonPath.jsonextract(res, "id");
		
		
		
		
		
		
	}
}

