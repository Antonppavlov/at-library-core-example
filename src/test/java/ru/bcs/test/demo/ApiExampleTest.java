//package ru.bcs.test.demo;
//
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import net.minidev.json.JSONObject;
//import org.junit.Test;
//
//import static io.restassured.RestAssured.given;
//import static io.restassured.RestAssured.when;
//import static org.hamcrest.CoreMatchers.equalTo;
//
//public class ApiExampleTest {
//
//
//    @Test
//    public void testExamplePost() {
//        RestAssured.baseURI = "http://localhost:8080/calories/calculation";
//        JSONObject requestParams = new JSONObject();
//        requestParams.put("activity", "1");
//        requestParams.put("age", "28");
//        requestParams.put("gender", "true");
//        requestParams.put("height", "188");
//        requestParams.put("target", "1");
//        requestParams.put("weight", "70");
//
//        given()
//                .body(requestParams.toJSONString())
//                .contentType(ContentType.JSON)
//                .post()
//                .then()
//                .statusCode(200)
//                .body(
//                        "calories", equalTo(2447),
//                        "proteins", equalTo(162),
//                        "fats", equalTo(61),
//                        "carbohydrates", equalTo(300)
//                );
//    }
//
//    @Test
//    public void testExampleGet() {
//        when().
//                get("?activity=1&age=28&gender=true&height=188&target=1&weight=70").
//                then().
//                statusCode(200).
//                body(
//                        "calories", equalTo(2447),
//                        "proteins", equalTo(162),
//                        "fats", equalTo(61),
//                        "carbohydrates", equalTo(300)
//                );
//    }
//}
//
//
