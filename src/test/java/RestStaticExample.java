import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestStaticExample {
	
	Response resposeob = null;
	@Test
	void test01() {
		Response resposeob = null;
		resposeob = get("https://reqres.in/api/users/2");
		//		resposeob.asString();
		//		resposeob.getBody();
		//		resposeob.getStatusCode();
		System.out.println(resposeob.asString());
		System.out.println(resposeob.getBody().asString());
		System.out.println(resposeob.getStatusCode());
		System.out.println(resposeob.getStatusLine());
		System.out.println(resposeob.getHeader("content-type"));
		System.out.println(resposeob.getTime());
		int statusCode = resposeob.getStatusCode();
		Assert.assertEquals(statusCode,200);	
	}
	@Test
	void test02() {
		Response resposeob = 
		given()
		.body(PayLoad.getArchiveJasonRequest()).contentType(ContentType.JSON) 
		.accept(ContentType.JSON)
        .header("User-Agent", "PostmanRuntime/7.6.0")
		.get("https://reqres.in/api/users/2");
		System.out.println(resposeob.getStatusCode());
		System.out.println(resposeob.getStatusLine());	
		System.out.println("i am here");
		System.out.println(resposeob.getHeader("content-type"));
//		.then()
//			.statusCode(200);
		
		
		
//		 Response response = httpRequest.given().header("Content-Type", "application/json").given()
//	                .header("x-api-key", "123456").
//	                request(Method.GET, "/hello");
		
		given()
        .log().all()
        .auth().preemptive().basic("user", "pwd")
        .headers(RequestUtils.getDefaultHeaders())
        .when()
        .patch(AUTH + "/" + REFERENCE + "/authorizations")
        .then()
        .log().all()
        .extract().response();
		
		<dependency>
	     <groupId>com.fasterxml.jackson.core</groupId>
	     <artifactId>jackson-databind</artifactId>
	     <version>2.10.3</version>
	</dependency>
		
		
	}
}
