import com.webPages.Chapter1Page;
import com.webPages.HomePage;
import com.webPages.SetupPage;

import org.testng.annotations.*;

public class CaseOne extends SetupPage {

    //Create object of HomePage Class
    HomePage home = new HomePage();

    @Test
    public void testHomePage() {

        home.clickChapter1();

    }


}
