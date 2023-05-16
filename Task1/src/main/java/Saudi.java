import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Saudi {
    //Lite Package For Saudi Arabia
    public static void litepacakage(WebDriver driver){
        String ExpectedResult="15 SAR/month";
        WebElement Lite=driver.findElement(By.id("currency-lite"));
        String ActualResult=Lite.getText();
        Assert.assertEquals(ActualResult,ExpectedResult);
    }
    //Classic Package for SaudiArabia
    public static void classicpacakage(WebDriver driver){
        String ExpectedResult="25 SAR/month";
        WebElement Lite=driver.findElement(By.id("currency-classic"));
        String ActualResult=Lite.getText();
        Assert.assertEquals(ActualResult,ExpectedResult);
    }
    //PREMIUM Package for SaudiArabia
    public static void premiumpacakage(WebDriver driver){
        String ExpectedResult="25 SAR/month";
        WebElement Lite=driver.findElement(By.id("currency-classic"));
        String ActualResult=Lite.getText();
        Assert.assertEquals(ActualResult,ExpectedResult);
    }
}
