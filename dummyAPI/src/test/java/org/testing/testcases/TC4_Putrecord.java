package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonHandler;
import org.testing.utilities.PropertiesHandler;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_Putrecord {
	@Test
    public void Testcase4() throws IOException {
    	{
    		Properties pr = PropertiesHandler.readPropertyFile("..//dummyAPI/URI.properties");
    		String bodyData = JsonHandler.readjson("..//dummyAPI/src/test/java/org/testing/resources/edit.json");
    		HTTPMethods http = new HTTPMethods(pr);
    		Response response = http.PutRequest("CreateNew",bodyData,TC1_Getallrecords.returnidvalue);
    		System.out.println(response.asString());
    		System.out.println("***********TestCase 4th***********");
    		
    	}
    	
    }
}
