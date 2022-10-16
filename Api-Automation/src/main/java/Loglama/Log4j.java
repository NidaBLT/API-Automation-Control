package Loglama;
import org.apache.log4j.Logger;

public class Log4j {
    private static Logger Log = Logger.getLogger(Log4j.class.getName());

    public static void idControl(String testClassName){
        Log.info("Ürünlerin 'id' kontrolü yapılır.");
    }
    public static void titleControl (String testClassName){
        Log.info("Ürünlerin 'title' kontrolü yapılır.");
    }
    public static void descriptionControl (String message) {
        Log.info("Ürünlerin 'description' kontrolü yapılır.");
    }
    public static void priceControl (String message) {
        Log.info("Ürünlerin 'price' kontrolü yapılır.");
    }
    public static void isBasketDiscount (String message) { Log.info("Ürünlerin 'isBasketDiscount' kontrolü yapılır.");}
    public static void basketDiscountPercentageControl (String message) { Log.info("1.Ürünün 'basketDiscountPercentage' kontrolü yapılır.");}
    public static void stockControl (String message) { Log.info("Ürünlerin 'stock' kontrolü yapılır.");}
    public static void isActiveControl (String message) { Log.info("1.Ürünün 'isActive' kontrolü yapılır.");}
    public static void brandControl (String message) { Log.info("Ürünlerin 'brand' kontrolü yapılır.");}
    public static void categoryControl (String message) { Log.info("Ürünlerin 'category' kontrolü yapılır.");}

    public static void startLog (String testClassName){ Log.info("Test is Starting...");}

    public static void endLog (String testClassName){ Log.info("Test is Ending...");}

    public static void endControl (String message) { Log.info("Testler başarı ile tamamlandı.");}

    public static void warn (String message) { Log.warn(message);}

    public static void error (String message) { Log.error(message);}

    public static void fatal (String message) { Log.fatal(message);}

    public static void debug (String message) { Log.debug(message);}
    public static void statusCode (String message) { Log.info("Statü kodu kontrol edilir.");}
}
