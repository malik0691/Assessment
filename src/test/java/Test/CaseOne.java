package Test;

import com.webPages.Chapter1Page;
import com.webPages.HomePage;
import com.webPages.SetupPage;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

public class CaseOne extends SetupPage {


    @Test(priority = 1, enabled = true)
    public void testBookSite() {

        //Create object of HomePage Class
        HomePage home = new HomePage();
        home.clickChapter1();

        //Create object of Chapter1Page Class
        Chapter1Page ch = new Chapter1Page();
        ch.navigateToHome();

    }

    @AfterClass
    public void close(){

        Selenide.closeWindow();
    }

}
