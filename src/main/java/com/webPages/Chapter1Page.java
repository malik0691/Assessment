package com.webPages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class Chapter1Page {

   //Locators for Chapter1page
   private By elementField= byId("divontheleft");
   private By navigateBack= byText("Home Page");
   private By chapter1text= byText("Chapter1");

   private static String divText;

    public void navigatebackToHome(){

        $(elementField)
                .shouldBe(visible)
                .shouldHave(text("Assert that this text is on the page"));

        divText= $(elementField).getText();

        $(navigateBack).click();
        $(chapter1text).shouldBe(visible);
        }

        public String chapterElementText()
        {
            return divText;
        }

    }