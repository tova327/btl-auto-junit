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

public class Test1 {


    WebDriver driver;

//    @Test
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

        homePage.clickBranches();


    }




    @BeforeEach
    public void startDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.btl.gov.il/");
    }

    @AfterEach
    public void closeDriver() {
        driver.quit();
    }
}
