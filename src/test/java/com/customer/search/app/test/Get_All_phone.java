package com.customer.search.app.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.customer.search.app.BaseLib;
import com.customer.search.app.IEndPoints;

import io.restassured.http.ContentType;

public class Get_All_phone extends BaseLib{

	@Test
	public void get_all_contacts_phone() {

		given().when().get(IEndPoints.GET_RESOURSE_PHONE).then().assertThat().statusCode(401).and()
				.contentType(ContentType.JSON).and()
				.body("message", Matchers.equalTo("Unauthorized")).and().time(lessThan(1000l));
}
}
