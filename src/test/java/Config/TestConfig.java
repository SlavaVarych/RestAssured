package Config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

public class TestConfig {

    public static RequestSpecification footballRequestSpec;
    public static ResponseSpecification footballResponseSpec;

    @BeforeClass
    public static void setup(){

        RestAssured.proxy("localhost", 8888);

        footballRequestSpec = new RequestSpecBuilder().
                setBaseUri("http://api.football-data.org").
                setBasePath("/v2/").
                addPathParam("id", 2021).
                addHeader("X-Auth-Token", "ac863adf313342bc98c4b7ab6ea0791b").
                addHeader("X-Response-Control", "minified").
                build();
        RestAssured.requestSpecification = footballRequestSpec;

        footballResponseSpec = new ResponseSpecBuilder().
                expectStatusCode(200).build();
        RestAssured.responseSpecification = footballResponseSpec;
    }

}
