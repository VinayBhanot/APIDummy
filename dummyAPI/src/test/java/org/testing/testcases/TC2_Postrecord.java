package org.testing.testcases;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.ExtractingDataFromResponse;
import org.testing.utilities.JsonHandler;
import org.testing.utilities.PropertiesHandler;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_Postrecord {
	
	//public static Integer returnIDvalue;
	@Test
	public  void Testcase2() throws IOException
	{
		Properties pr = PropertiesHandler.readPropertyFile("..//dummyAPI/URI.properties");
		String bodyData = JsonHandler.readjson("..//dummyAPI/src/test/java/org/testing/resources/input.json");
		HTTPMethods http = new HTTPMethods(pr);
		Response response = http.PostRequest("CreateNew",bodyData);
		System.out.println(response.asString());
		System.out.println("***********TestCase 2nd***********");
		
	}

}
