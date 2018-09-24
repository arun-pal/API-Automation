// Country Code Test for US, DE and GB. (Positive Test)

package testCases;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import read_Property.ReadProperty;

public class CountryCode_GET_PositiveCase 
{
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
    public void country_Code1()
	 {		 
			RequestSpecification httpRequest = RestAssured.given();
			Response response = httpRequest.request(Method.GET, ReadProperty.getProperty("POSITIVE_COUNTRY_ISO2CODE1") );
			
			int statusCode = response.getStatusCode();
			String statusLine = response.getStatusLine();
			long timeInMs = response.time();
			String responseBody = response.getBody().asString();
			System.out.println("****************************** Start ***********************************");
			System.out.println("Response Body is =>  " + responseBody);
			System.out.println("The status code recieved: " + statusCode);
			System.out.println("The status Line recieved: " + statusLine);
			System.out.println("Response Time Is:" + timeInMs);
			
			Headers allHeaders = response.headers();
			for(Header header : allHeaders)
			{
				System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
			}
			System.out.println("****************************** End ***********************************");
    }

	 @Test
     public void country_Code2()
	 {		 
			RequestSpecification httpRequest = RestAssured.given();
			Response response = httpRequest.request(Method.GET, ReadProperty.getProperty("POSITIVE_COUNTRY_ISO2CODE2") );
			
			int statusCode = response.getStatusCode();
			String statusLine = response.getStatusLine();
			long timeInMs = response.time();
			String responseBody = response.getBody().asString();
			System.out.println("****************************** Start ***********************************");
			System.out.println("Response Body is =>  " + responseBody);
			System.out.println("The status code recieved: " + statusCode);
			System.out.println("The status Line recieved: " + statusLine);
			System.out.println("Response Time Is:" + timeInMs);
			
			Headers allHeaders = response.headers();
			for(Header header : allHeaders)
			{
				System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
			}
			System.out.println("****************************** End ***********************************");
     }

	 @Test
     public void country_Code3()
	 {		 
			RequestSpecification httpRequest = RestAssured.given();
			Response response = httpRequest.request(Method.GET, ReadProperty.getProperty("POSITIVE_COUNTRY_ISO2CODE3") );
			
			int statusCode = response.getStatusCode();
			String statusLine = response.getStatusLine();
			long timeInMs = response.time();
			String responseBody = response.getBody().asString();
			System.out.println("****************************** Start ***********************************");
			System.out.println("Response Body is =>  " + responseBody);
			System.out.println("The status code recieved: " + statusCode);
			System.out.println("The status Line recieved: " + statusLine);
			System.out.println("Response Time Is:" + timeInMs);
			
			Headers allHeaders = response.headers();
			for(Header header : allHeaders)
			{
				System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
			}
			System.out.println("****************************** End ***********************************");
     }
}

