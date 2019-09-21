
package RestAssured;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import responses.StatusResponse;

public class VerifyStatusAPI{

	Response response;
	RequestSpecification requestSpecification;

	@Test
	public void verifyStatusAPI() {
		String baseurl="https://purpletrac.com";
		String endPoint="/api/v1/status";
		String api=baseurl+endPoint;
		System.out.println(api);
		requestSpecification=RestAssured.given().config(RestAssured.config);
		requestSpecification.contentType("application/json");
		
		response=requestSpecification.get(api);  //sending request and capturing response
		String responseCode=""+response.getStatusCode();
		System.out.println("Response Code="+responseCode);
		
		if(responseCode.startsWith("20")) {
			StatusResponse statusResponse;
			Gson gson=new Gson();
			statusResponse=gson.fromJson(response.asString(), StatusResponse.class);
			
			System.out.println("Generated "+statusResponse.getGenerated());
			System.out.println("overall Status "+statusResponse.getOverallStatus());
			if(statusResponse.getOverallStatus().equals("OK")) {
				System.out.println("Overall status is OK. Test case passed");
			}
			
			System.out.println(statusResponse.getServices().get(0).getNotes().getVersion());
		
		for(int i=0;i<statusResponse.getServices().size();i++) {
			System.out.println("Service Types: "+statusResponse.getServices().get(i).getServiceType());
		}
			
		}

	}

}
