// Country Code Test for Post Request.

package testCases;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import read_Property.ReadProperty;

import read_Property.ReadProperty;

public class CountryCode_POST_Case 
{
	
	public static Response response;
	public static String jsonAsString;
	static ReadProperty prop=new ReadProperty();
	
	@BeforeClass
    public static void setup() 
	{
       /* String port = System.getProperty("server.port");		
        if (port == null) 
        {
            RestAssured.port = Integer.valueOf(8080);
        }
        else
        {
            RestAssured.port = Integer.valueOf(port);
        }*/
        String basePath = System.getProperty("server.base");
        if(basePath==null)
        {
            basePath = "country/get/iso2code/";            
        }
        RestAssured.basePath = basePath;

        String baseHost = System.getProperty("server.host");
        if(baseHost==null)
        {
            baseHost = "http://services.groupkt.com/";
        }
        RestAssured.baseURI = baseHost;
    }
	
	@Test
     public void post_Country_Code()
	 {		 
		RequestSpecification request = RestAssured.given();
		 
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("Name", "Test Country");
		requestParams.addProperty("alpha2_code", "TC");
		requestParams.addProperty("alpha3_code", "TCY");
		request.body(requestParams.toString());
		Response response = request.get("/create");
		System.out.println("****************************** Start ****************************************");
		int statusCode = response.getStatusCode();
		String statusLine = response.getStatusLine();
		long timeInMs = response.time();
		System.out.println("Response body: " + response.body().asString());
		System.out.println("The status code recieved: " + statusCode);
		System.out.println("The status Line recieved: " + statusLine);
		System.out.println("Response Time Is:" + timeInMs);
		System.out.println("****************************** End ****************************************");
     }
}

