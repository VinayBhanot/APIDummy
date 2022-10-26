package org.testing.utilities;

import java.util.Random;

import org.json.JSONArray;
import org.json.JSONObject;

public class ExtractingDataFromResponse {

	public static Integer Responsejson(String responsedata, String keyname)
	{
		JSONObject obj = new JSONObject(responsedata);
		JSONArray array = obj.getJSONArray("data");
		int length = array.length();
		System.out.println(length);
		for (int i =0;i<length;i++)
		{
			JSONObject obinner = array.getJSONObject(i);
			System.out.println(obinner.toString());
			System.out.println("ID value is : " +obinner.get(keyname));
		}
		
		Random random = new Random();
		int rnd = random.nextInt(length-1)+1;
		JSONObject obinner = array.getJSONObject(rnd);
		Integer id = obinner.getInt(keyname);
		return id;
		
	}
}
