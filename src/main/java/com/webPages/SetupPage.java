package com.webPages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class SetupPage {

    WebDriver driver;


    @BeforeClass
    public void setuptoOpenHomeSite() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));

        String baseURL = System.getProperty("SiteURL");

        //to open a browser
        Configuration.browser = System.getProperty("Browser");
        open(baseURL);

    }

    @After
    public void tearDown() throws IOException {
        screenshot();
    }

    @Attachment(type = "image/png")
    public byte[] screenshot() throws IOException {
        File screenshot = Screenshots.getLastScreenshot();
        return screenshot == null ? null : Files.toByteArray(screenshot);
    }

}
