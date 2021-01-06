import com.webPages.Chapter1Page;
import com.webPages.SetupPage;
import org.testng.annotations.Test;

public class CaseTwo extends SetupPage{

    //Create object of Chapter1Page Class
    Chapter1Page ch = new Chapter1Page();


    @Test
    public void testChapterPage() {

        ch.navigatebackToHome();
    }
}
