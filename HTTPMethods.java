package org.testing.teststeps;

import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethods {
	
	Properties pr;
	
	public HTTPMethods(Properties pr) 
	
	{
		this.pr=pr;
		
	}
	
	public Response postRequest(String bodyData, String uriKey)

	{
	        String uriValue= pr.getProperty(uriKey);
	        
	     Response res=
	    		 
	        RestAssured.given()
	        .contentType(ContentType.JSON)
	        .body(bodyData)
	        .when()
	        .post(uriValue);
	        
	        System.out.println("Status code is ");
	        System.out.println(res.statusCode());        
	        return res;
		
		
	}
	
	public Response GetAllRequest(String uriKey)
	{
		Response res=
				
		RestAssured.given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(uriKey));
		
		System.out.println("Status code is ");
        System.out.println(res.statusCode());
        
        System.out.println("Response data is ");
        System.out.println(res.asString());
         return res;
 		
	}
	public Response updateRequest(String bodyData,String uriKey, String idValue)
	{
		
		String uri = pr.getProperty(uriKey)+"/"+idValue;
		Response res=
				
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.put(uri);
		
		System.out.println("Status code is ");
        System.out.println(res.statusCode());
        
        System.out.println("Response data is ");
        System.out.println(res.asString());
         return res;

		
	}
	
	public Response DeleteRequest(String uriKey, String endpoint)
	{
		
		String uri = pr.getProperty(uriKey)+"/"+endpoint;
		Response res=
				
		RestAssured.given()
		.contentType(ContentType.JSON)
		.when()
		.delete(pr.getProperty(uriKey));
		
		System.out.println("Status code is ");
        System.out.println(res.statusCode());
        
        System.out.println("Response data is ");
        System.out.println(res.asString());
         return res;
 		
	}
	
	
	public Response GetParticular(String uriKey, String endpoint)
	{
		
		String uri = pr.getProperty(uriKey)+"/"+endpoint;
		Response res=
				
		RestAssured.given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(uriKey));
		
		System.out.println("Status code is ");
        System.out.println(res.statusCode());
        
        System.out.println("Response data is ");
        System.out.println(res.asString());
         return res;
 		
	}

}
