package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesHandler;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_Getsinglerecord {
	@Test
	public void testcase3() throws IOException {
		
		Properties pr = PropertiesHandler.readPropertyFile("../dummyAPI/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res =http.GetSingleRequest("Getsingle",TC1_Getallrecords.returnidvalue);
        System.out.println("*********Testcase 3******");
        System.out.println(res.asString());
	}
	
	
}
