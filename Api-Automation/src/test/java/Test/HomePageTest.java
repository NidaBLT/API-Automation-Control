package Test;

import ExpectedDataStore.ExpectedDataGetProducts;
import BaseURLStore.URLGetProducts;
import Loglama.Log4j;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class HomePageTest extends URLGetProducts {
    ExpectedDataGetProducts jSonExpectedBody=new ExpectedDataGetProducts();
    JSONObject expBody1=jSonExpectedBody.expectedDataCreate1();
    JSONObject expBody2=jSonExpectedBody.expectedDataCreate2();

    @Test
    public void getProductsControl() {

        getProduct.pathParam("pp1", "hepsiBurada");
        Response response = given().spec(getProduct).when().get("{pp1}");
        JsonPath responseJsonPath = response.jsonPath();

        assertEquals(expBody1.getInt("id"),responseJsonPath.getInt( "getProducts[0].id"));
        assertEquals(expBody2.getInt("id"),responseJsonPath.getInt("getProducts[1].id"));
        Log4j.idControl("");

        assertEquals(expBody1.getString("title"),responseJsonPath.getString("getProducts[0].title"));
        assertEquals(expBody2.getString("title"),responseJsonPath.getString("getProducts[1].title"));
        Log4j.titleControl("");

        assertEquals(expBody1.getString("description"),responseJsonPath.getString("getProducts[0].description"));
        assertEquals(expBody2.getString("description"),responseJsonPath.getString("getProducts[1].description"));
        Log4j.descriptionControl("");

        assertEquals(expBody1.getInt("price"),responseJsonPath.getInt("getProducts[0].price"));
        assertEquals(expBody2.getInt("price"),responseJsonPath.getInt("getProducts[1].price"));
        Log4j.priceControl("");

        assertEquals(expBody1.getBoolean("isBasketDiscount"),responseJsonPath.getBoolean("getProducts[0].isBasketDiscount"));
        assertEquals(expBody2.getBoolean("isBasketDiscount"),responseJsonPath.getBoolean("getProducts[1].isBasketDiscount"));
        Log4j.isBasketDiscount("");

        assertEquals(expBody1.getInt("basketDiscountPercentage"),responseJsonPath.getInt("getProducts[0].basketDiscountPercentage"));
        Log4j.basketDiscountPercentageControl("");

        assertEquals(expBody1.getInt("stock"),responseJsonPath.getInt("getProducts[0].stock"));
        assertEquals(expBody2.getInt("stock"),responseJsonPath.getInt("getProducts[1].stock"));
        Log4j.stockControl("");

        assertEquals(expBody1.getBoolean("isActive"),responseJsonPath.getBoolean("getProducts[0].isActive"));
        Log4j.isActiveControl("");

        assertEquals(expBody1.getString("brand"),responseJsonPath.getString("getProducts[0].brand"));
        assertEquals(expBody2.getString("brand"),responseJsonPath.getString("getProducts[1].brand"));
        Log4j.brandControl("");

        assertEquals(expBody1.getString("category"),responseJsonPath.getString("getProducts[0].category"));
        assertEquals(expBody2.getString("category"),responseJsonPath.getString("getProducts[1].category"));
        Log4j.categoryControl("");

        assertEquals(jSonExpectedBody.basariliStatusCode, response.statusCode());
        Log4j.statusCode("");
        Log4j.endControl("");
    }


















}
