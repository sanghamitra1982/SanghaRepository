package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesLod;
import org.testng.annotations.Test;

public class TC3_GetParticularRequest {
@Test
	
	public void testcase3() throws IOException {
		
		Properties p = PropertiesLod.handleProperties("../RestAssuredFramework/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		
		http.GetParticular("QA_URI", TC1_PostRequest.returnidValue);
				
	}

}
