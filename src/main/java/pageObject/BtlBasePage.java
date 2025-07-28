package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BtlBasePage extends BasePage {

    public BtlBasePage(WebDriver driver) {
        super(driver);
    }

    public void clickMenu(Menu choice){
        String xpath = "//a[text()="+choice+" and(not(contains(@class,'mobile')))]";
        driver.findElement(By.xpath(xpath)).click();

    }
    public void clickSubMenu(String sub){
        String xpath = "//*[text()="+sub+"]";
        driver.findElement(By.xpath(xpath)).click();
    }


    public void search(String s){
        String xpath = "//input[@id='TopQuestions']";
        String icon = "//input[@name=\"ctl00$SiteHeader$reserve$btnSearch\"]";
        driver.findElement(By.xpath(xpath)).sendKeys(s);
        driver.findElement(By.xpath(icon)).click();
    }

    public Branches clickBranches(){
        String xpath ="//a[@id=\"ctl00_Topmneu_BranchesHyperLink\"]";
        driver.findElement(By.xpath(xpath)).click();
        return new Branches(driver);
    }






}
