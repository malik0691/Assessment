import com.webPages.Chapter1Page;
import com.webPages.HomePage;
import com.webPages.SetupPage;
import org.testng.annotations.*;

public class CaseOne extends SetupPage {

    //Create object of HomePage Class
    HomePage home = new HomePage();
    //Create object of Chapter1Page Class
    Chapter1Page ch = new Chapter1Page();

    @Test(description = "test to navigate to chapter 1")
    public void testA() {

        home.clickChapter1();
    }

    @Test(description = "test to check the availability  of text")
    public void testB() {

        ch.navigatebackToHome();
    }

}


