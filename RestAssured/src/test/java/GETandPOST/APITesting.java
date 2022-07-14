package GETandPOST;


import com.google.errorprone.annotations.Var;
import io.restassured.response.Response;
import jdk.nashorn.internal.runtime.JSONFunctions;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.ValidatableResponse;

public class APITesting {
    @Test
    public void getCategories(){
        String endpoint = "http://localhost:8888/api_testing/category/read.php";
        given().when().get(endpoint).then();
    }

    @Test
    public void getProduct(){
        String endpoint = "http://localhost:8888/api_testing/product/read.php";
           given().
            queryParam("id",6).
          when().
            get(endpoint).
          then().
            log().body();

    }
}
