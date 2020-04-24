package com.customer.search.app.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.customer.search.app.IEndPoints;

import io.restassured.http.ContentType;

public class Authenticate {

	@Test
	public void get_all_Authenticate() {

		given().when().post(IEndPoints.POST_REQUEST).then().assertThat().statusCode(400).and()
				.contentType(ContentType.JSON).and().body("error", Matchers.equalTo("Bad Request")).and()
				.time(lessThan(1000l));

	}
}
