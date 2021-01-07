package com.webPages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class HomePage {

    //Locators for HomePage
   private By chapter1Text= byText("Chapter1");

   private static String chapterText;

    public void clickChapter1(){

        $(byClassName("mainheading"))
                .shouldBe(visible)
                .shouldHave(text("Selenium: Beginners Guide"));

        chapterText= $(chapter1Text).getText();

        $(chapter1Text).shouldBe(visible).click();
    }

    public String ChapterText()
    {
         return chapterText;
    }

}