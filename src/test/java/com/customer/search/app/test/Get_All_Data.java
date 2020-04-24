package com.customer.search.app.test;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.customer.search.app.BaseLib;
import com.customer.search.app.IEndPoints;

import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;

public class Get_All_Data extends BaseLib {

	@Test
	public void get_all_contacts() {

		given().when().get(IEndPoints.GET_RESOURSE).then().assertThat().statusCode(401).and()
				.contentType(ContentType.JSON).and().body("error", Matchers.equalTo("Unauthorized")).and()
				.body("message", Matchers.equalTo("Unauthorized")).and().time(lessThan(3000l));

	}
	
}

