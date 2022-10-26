package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonHandler;
import org.testing.utilities.PropertiesHandler;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5_Deletrecord {
	@Test
	public void testcase5() throws IOException {
		{
    		Properties pr = PropertiesHandler.readPropertyFile("..//dummyAPI/URI.properties");
    		HTTPMethods http = new HTTPMethods(pr);
    		Response response = http.DeleteRequest("CreateNew",TC1_Getallrecords.returnidvalue);
    		System.out.println(response.asString());
    		System.out.println("***********TestCase 5th***********");
    		
    	}
	}

}
