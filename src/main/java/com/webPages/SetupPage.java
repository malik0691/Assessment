package com.webPages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.open;

public class SetupPage {


    @BeforeTest
    public void setuptoOpenHomeSite() {

        String baseURL = System.getProperty("siteURL");
        //to open a browser
        Configuration.browser = System.getProperty("browser");
        open(baseURL);
    }

    @AfterTest
    public void close(){

        Selenide.closeWindow();
    }

}
