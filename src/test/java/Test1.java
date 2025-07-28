import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.Branches;
import pageObject.HomePage;
import pageObject.SearchResult;
import pageObject.SingleBranch;

public class Test1 extends BaseTest{




   @Test
    public void search(){

        HomePage homePage = new HomePage(driver);
        homePage.search("חישוב סכום דמי לידה ליום");

        SearchResult searchResult = new SearchResult(driver);
        String title =searchResult.getTitle();

        String expTitle="תוצאות חיפוש עבור חישוב סכום דמי לידה ליום";
        Assertions.assertEquals(expTitle, title);

    }

    @Test
    public void branches(){
        HomePage homePage = new HomePage(driver);
        Branches branchesPage=homePage.clickBranches();
        WebElement titleElement = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/h1"));

        // Get the text of the element
        String title = titleElement.getText();
        String expTitle="סניפים וערוצי שרות";
        // Verify that the title contains the expected text
        Assertions.assertEquals(expTitle, title);
        SingleBranch singleBranch=branchesPage.getRandomBranch();
        Assertions.assertTrue(singleBranch.checkInformationExistance());

    }





}
