package com.customer.json_server.parser;

import java.util.List;

//import com.google.gson.JsonArray;
//import com.google.gson.JsonParser;

import io.restassured.response.Response;

/**
 * 
 * @author Madhusudan
 *
 */

public class JsonUtilities {
	/**
	 * getJsonString returns the json value from the specified jsonPath
	 * 
	 * @param response
	 * @param jsonPath
	 * @return
	 */

	public static String getJsonString(Response response, String jsonPath) {

		return response.getBody().jsonPath().get(jsonPath).toString();
	}

//	public static String ParseJson(String response, String Key) {
//
//		JsonElement json = new JsonParser().parse(response).getAsJsonObject().get(Key);
//
//		if (json != null) {
//			if (!json.isJsonNull()) {
//				return json.toString();
//			}
//		}
//
//		return null;
//
//	}

	/**
	 * getJsonList returns the value of json array from the specified jsonPath
	 * 
	 * @param response
	 * @param json     Path
	 * @param counter
	 * 
	 * 
	 * 
	 */

	public static List<String> getJsonList(Response response, String jsonPath) {
		return response.getBody().jsonPath().getList(jsonPath);

//	public static String parseJsonArray(String response, String Key, int index) {
//
//		JsonArray jsonArray = new JsonParser().parse(response).getAsJsonArray();
//		return jsonArray.get(index).getAsJsonObject().get(Key).getAsString();
	}

}
