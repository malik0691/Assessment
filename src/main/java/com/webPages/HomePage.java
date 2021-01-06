package com.webPages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class HomePage {

    //Locators for HomePage
    By text= byText("Chapter1");



    public void clickChapter1(){

        $(byClassName("mainheading"))
                .shouldBe(visible)
                .shouldHave(text("Selenium: Beginners Guide"));

        $(text).shouldBe(visible).click();
    }
}

