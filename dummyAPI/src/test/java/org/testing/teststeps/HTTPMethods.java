package org.testing.teststeps;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.Properties;

    public class HTTPMethods {
	
		Properties pr ;
		public HTTPMethods(Properties pr)
		{
			this.pr = pr;
		}
		
	public Response GetAllRequest(String urikey)
	{
		Response res =
				given()
			    .contentType(ContentType.JSON)
			    .when()
			    .get(pr.getProperty(urikey));
		System.out.println("Status code is " +res.statusCode());
		System.out.println("Response data " +res.asString());
		return res;
			    
			   
	}
	
	public  Response PostRequest(String urikey, String bodydata)
	{
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.post(pr.getProperty(urikey));
		System.out.println("Status code is " +res.statusCode());
		return res;
		
	}
	public Response GetSingleRequest(String urikey, Integer returnidvalue)
	{
		String completeuri = pr.getProperty(urikey)+"/"+returnidvalue;
		System.out.println(completeuri);
		Response res =
				given()
			    .contentType(ContentType.JSON)
			    .when()
			    .get(completeuri);
		System.out.println("Status code is " +res.statusCode());
		//System.out.println("Response data " +res.asString());
	    return res;    
			   
	}
	
	public  Response PutRequest(String urikey, String bodydata, Integer returnidvalue)
	{
		String completeuri = pr.getProperty(urikey)+"/"+returnidvalue;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.put(completeuri);
		System.out.println("Status code is " +res.statusCode());
		return res;
		
	}
	
	public  Response DeleteRequest(String urikey,Integer returnidvalue)
	{
		String completeuri = pr.getProperty(urikey)+"/"+returnidvalue;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(completeuri);
		System.out.println("Status code is " +res.statusCode());
		return res;
		
	}

}
