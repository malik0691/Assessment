package com.webPages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class Chapter1Page {

   //Locators for Chapter1page
    By checkElement= byId("divontheleft");
    By NavigateBack= byText("Home Page");
    By text= byText("Chapter1");




    public void navigateToHome(){

        $(checkElement)
                .shouldBe(visible)
                .shouldHave(text("Assert that this text is on the pagesss"));


        $(NavigateBack).click();

        $(text).shouldBe(visible);
        }
    }

