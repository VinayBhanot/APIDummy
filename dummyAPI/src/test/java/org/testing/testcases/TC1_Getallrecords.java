package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.ExtractingDataFromResponse;
import org.testing.utilities.PropertiesHandler;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_Getallrecords {
	
	public static Integer returnidvalue;

	@Test
	public void testcase1() throws IOException {
		
		Properties pr = PropertiesHandler.readPropertyFile("../dummyAPI/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response response = http.GetAllRequest("GetALL");
		System.out.println("***********TestCase 1st***********" );
		returnidvalue = ExtractingDataFromResponse.Responsejson(response.asString(), "id");
		System.out.println("id value " +returnidvalue);
	}

}
