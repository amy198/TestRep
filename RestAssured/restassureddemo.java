package RestAssured;



import io.restassured.http.Header;

import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;

import static org.junit.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class restassureddemo {

	public static void main(String[] args) {
	}
	public static void validateGenderAPI(String name,String expectedGender) {
		// TODO Auto-generated method stub
		//API call
		RestAssured.baseURI="https://api.genderize.io/";
		RequestSpecification req=RestAssured.given();
		
		//Set request details with req object
		req.queryParam("name", "amita");
		Response res= req.get();
		
		//get data from response object
		
		int statusCode=res.getStatusCode();
		System.out.println("Status code is "+ statusCode);
		System.out.println("Status line is "+ res.getStatusLine());
		System.out.println("Content Type is "+ res.getHeader("Content-Type"));
		
		//get all headers from response object
		Headers resHd= res.getHeaders();
		for (Header h :resHd) {
			System.out.print("name:- "+ h.getName());
			System.out.println("  value:- "+ h.getValue());
			
			
		}
		//get response body
		ResponseBody resBody= res.getBody();
		JsonPath path= resBody.jsonPath();
	/*	System.out.println("name:   " + path.getString("name"));
		System.out.println("gender:   "+ path.getString("gender"));
		System.out.println("probabilty:   "+ path.getString("probability"));
		System.out.println("count:   "+ path.getString("count"));*/
		
		assertEquals("amita", path.getString("name"));
		assertEquals("female", path.getString("gender"));
		assertEquals("probability", path.getString("probability"));
		
		
		
		
		
		
		
		
		
		
		
		
		







		
		
		
	}

}
