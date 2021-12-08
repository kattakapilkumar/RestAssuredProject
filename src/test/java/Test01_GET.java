import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {
		
	@Test
	void test01() {
		
		Response resposeob = null;
		resposeob = RestAssured.get("https://reqres.in/api/users/2");
		
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
	
//	@Test
//	void test02() {
//		
//		given().
//		
//		
//	}

}
