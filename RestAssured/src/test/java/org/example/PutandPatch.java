package org.example;

import jdk.nashorn.internal.runtime.JSONFunctions;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class PutandPatch {
    @Test
    public void PutTest(){
        JSONObject request = new JSONObject();
        request.put("name","omer");
        request.put("job","SQA Tester");

        System.out.println(request.toJSONString());
        baseURI = "https://reqres.in/api" ;

        given().
                header("Content-Type","application/json").
                body(request.toJSONString()).
                when().
                put("/users/2").
                then().
                statusCode(200).log().all();


    }


    @Test
    public void PatchTest(){
        JSONObject request = new JSONObject();
        request.put("name","omer shahab");
        request.put("job","SQA Tester");

        System.out.println(request.toJSONString());
        baseURI = "https://reqres.in" ;

        given().
                header("Content-Type","application/json").
                body(request.toJSONString()).
                when().
                patch("/api/users/2").
                then().
                statusCode(200).log().all();


    }
}
