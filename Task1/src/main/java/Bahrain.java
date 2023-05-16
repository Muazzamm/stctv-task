import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Bahrain {
    //Lite Package For Bahrain
    public static void litepacakagebh(WebDriver driver){
        String ExpectedResult="2 BHD/month";
        WebElement Lite=driver.findElement(By.id("currency-lite"));
        String ActualResult=Lite.getText();
        Assert.assertEquals(ActualResult,ExpectedResult);
    }
    //Classic Package For Bahrain
    public static void classicpacakagebh(WebDriver driver){
        String ExpectedResult="3 BHD/month";
        WebElement Lite=driver.findElement(By.id("currency-classic"));
        String ActualResult=Lite.getText();
        Assert.assertEquals(ActualResult,ExpectedResult);
    }
    //PREMIUM Package For Bahrain
    public static void premiumpacakagebh(WebDriver driver){
        String ExpectedResult="6 BHD/month";
        WebElement Lite=driver.findElement(By.id("currency-premium"));
        String ActualResult=Lite.getText();
        Assert.assertEquals(ActualResult,ExpectedResult);
    }
}
