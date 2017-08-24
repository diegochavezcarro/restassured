package diego.pruebas.restassured;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//System.getProperties().put("http.proxyHost", "localhost");
    	//System.getProperties().put("http.proxyPort", 8081);
		given().
		when().
			get("http://api.zippopotam.us/us/{id}", 90210).
		then().
			assertThat().
			body("country", equalTo("United Stagtes"));
    }
}
