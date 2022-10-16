package ExpectedDataStore;

import org.json.JSONObject;

public class ExpectedDataGetProducts {
    public int basariliStatusCode=200;
    public JSONObject expectedDataCreate1() {

        JSONObject expBody1 = new JSONObject();
        expBody1.put("id", 1);
        expBody1.put("title", "Hepsi Home Pasta Tekli Sarkıt Avize Ahşap");
        expBody1.put("description", "Avize");
        expBody1.put("price", 110);
        expBody1.put("isBasketDiscount",true);
        expBody1.put("basketDiscountPercentage",4);
        expBody1.put("rating",2.19);
        expBody1.put("stock",1);
        expBody1.put("isActive",false);
        expBody1.put("brand","Apple");
        expBody1.put("category","ipad");

        return expBody1;
    }
    public JSONObject expectedDataCreate2(){

        JSONObject expBody2 = new JSONObject();
        expBody2.put("id", 2);
        expBody2.put("title", "Apple iPhone 12 64 GB");
        expBody2.put("description", "Apple");
        expBody2.put("price", "15000");
        expBody2.put("isBasketDiscount",false);
        expBody2.put("rating",3.2);
        expBody2.put("stock",2000);
        expBody2.put("brand","Apple");
        expBody2.put("category","smartphones");

        return expBody2;
    }
}
