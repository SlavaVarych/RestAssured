import Config.EndPoint;
import Config.TestConfig;
import TeamsResponseSerialisation.Example;
import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class DeSerializationJsonToPojo extends TestConfig {
    /**
     * Get to http://api.football-data.org/v2/competitions/2021/teams
     */


    @Test
    public void convertJsonToPojo(){

        Response response =
                given().
                        spec(footballRequestSpec).
                when().get(EndPoint.footballEndPoint);


        Example example = response.getBody().as(Example.class);
        System.out.println(example.toString());

    }
}
