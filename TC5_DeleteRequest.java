package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLod;
import org.testng.annotations.Test;

public class TC5_DeleteRequest {
@Test
	
	public void testcase5() throws IOException
	{
		
		Properties p = PropertiesLod.handleProperties("../RestAssuredFramework/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		
		http.DeleteRequest("QA_URI", TC1_PostRequest.returnidValue);
	}

}
