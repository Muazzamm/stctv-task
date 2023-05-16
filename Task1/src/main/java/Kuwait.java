import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Kuwait {
    //Lite Package For Kuwait
    public static void litepacakagekw(WebDriver driver){
        String ExpectedResult="1.2 KWD/month";
        WebElement Lite=driver.findElement(By.id("currency-lite"));
        String ActualResult=Lite.getText();
        Assert.assertEquals(ActualResult,ExpectedResult);
    }
    //Classic Package For Kuwait
    public static void classicpacakagekw(WebDriver driver){
        String ExpectedResult="2.5 KWD/month";
        WebElement Lite=driver.findElement(By.id("currency-classic"));
        String ActualResult=Lite.getText();
        Assert.assertEquals(ActualResult,ExpectedResult);
    }
    //PREMIUM Package For Kuwait
    public static void premiumpacakagekw(WebDriver driver){
        String ExpectedResult="4.8 KWD/month";
        WebElement Lite=driver.findElement(By.id("currency-premium"));
        String ActualResult=Lite.getText();
        Assert.assertEquals(ActualResult,ExpectedResult);
    }


}
