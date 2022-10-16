package BaseURLStore;

/*Aşağıda verilen örnek json değerini dönen mock bir api oluşturarak, farklı senaryoları içeren
bir otomasyon projesi oluşturunuz.Json Dosyası:
https://gist.githubusercontent.com/onrysl/fc02dd74bf8d90fd8619c3c1d84632ce/raw/
ae4f244f2955144feef0256abc6c51282497123c/example_products.json

 */

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class URLGetProducts {
    protected RequestSpecification getProduct;

    @Before
    public void setUp(){
        getProduct =new RequestSpecBuilder().
                setBaseUri("http://localhost:3000").
                build();
    }

}


