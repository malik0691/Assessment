package com.webPages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class Chapter1Page {

   //Locators for Chapter1page
   private By checkElement= byId("divontheleft");
   private By navigateBack= byText("Home Page");
   private By chapter1text= byText("Chapter1");


    public void navigatebackToHome(){

        $(checkElement)
                .shouldBe(visible)
                .shouldHave(text("Assert that this text is on the page"));

        $(navigateBack).click();

        $(chapter1text).shouldBe(visible);
        }

    }

