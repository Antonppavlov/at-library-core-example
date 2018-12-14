//package ru.bcs.test.demo;
//
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CaloriesCalculateControllerApi;
//import io.swagger.client.model.CPFC;
//import io.swagger.client.model.HumanParam;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//public class NewApiTest {
//
//    private static CaloriesCalculateControllerApi caloriesCalculateControllerApi = new CaloriesCalculateControllerApi();
//
//    @BeforeClass
//    public static void setUp() throws Exception {
//        ApiClient apiClient = new ApiClient();
//        apiClient.setBasePath("http://localhost:8080");
//        caloriesCalculateControllerApi.setApiClient(apiClient);
//    }
//
//    @Test
//    public void name() throws ApiException {
//
//        HumanParam humanParam = new HumanParam();
//        humanParam.setActivity(1);
//        humanParam.setAge(29);
//        humanParam.setGender(true);
//        humanParam.setWeight(189);
//        humanParam.setHeight(78);
//
//        CPFC cpfc = caloriesCalculateControllerApi.calculationUsingPOST(humanParam);
//        System.out.println(cpfc);
//    }
//}
