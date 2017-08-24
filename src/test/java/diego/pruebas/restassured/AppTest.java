package diego.pruebas.restassured;

import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void probarApp() {
		given().
		when().
			get("http://api.zippopotam.us/us/{id}", 90210).
		then().
			assertThat().
			body("country", equalTo("Unitedh States"));
	}
}
