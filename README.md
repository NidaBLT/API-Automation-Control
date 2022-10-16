# API Automation Control
 API Automation Control
 
# Fake API Oluşturma
 -NodeJs kurulumu yapılır.
 -Belgelerim altında bir klasör ve içinede başka bir data adında klasör oluşturulur.
 -"npm install -g json-server" komut penceresinde çalıştırılır.Data klasöründe olduğumuzdan emin oluruz.
 -Data klasörünün içine bir text dosyası ve uzantısı .json olarak eklenir.(data.json)
 -İçine örnek bi json eklenir.
 -Komut penceresinde "json-server --watch db.json" çalıştırılır. Ve Resources altında url alınır.
 
 # Dependencies - Intellij IDEA
 
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>5.2.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.json</groupId>
            <artifactId>json</artifactId>
            <version>20220924</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.5.0</version>
        </dependency>

        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.1.0</version>
            <scope>test</scope>
        </dependency>


