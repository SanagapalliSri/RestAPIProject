package test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import org.testng.annotations.Test;

public class PostApi {

	@Test
	public void login() {
		
		
		
		given().auth().basic("practice", "SuperSecretPassword!")
        .header("Accept", "text/html")
    .when()
        .get("https://practice.expandtesting.com/login")
    .then()
        .assertThat()
        .body(containsString("<title>Test Login Page for Automation Testing Practice</title>"));


		
	}

}
