package org.example;

import jdk.nashorn.internal.runtime.JSONFunctions;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class GetandPost {

    @Test
    public void GetTest(){
baseURI = "https://reqres.in/api" ;
        given()
            .get("/users?page=2")
        .then()
            .statusCode(200)
        .body("data[4].first_name",equalTo("George"))
        .body("data.first_name",hasItems("George","Rachel"));
    }
    @Test
    public void PostTest(){
        JSONObject request = new JSONObject();
        request.put("name","omer");
        request.put("job","SQA Engineer");

        System.out.println(request.toJSONString());
        baseURI = "https://reqres.in/api" ;

        given().
          header("Content-Type","application/json").
          body(request.toJSONString()).
        when().
          post("/users").
        then().
          statusCode(201).log().all();


    }
}
