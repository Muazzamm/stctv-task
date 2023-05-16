import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Stctv {

    private String url = "https://subscribe.stctv.com/sa-en?";

    //URL
    public void LoadPage(WebDriver driver) {
        driver.get(this.url);
    }

    //Change Country
    public void selectCountry(WebDriver driver, String countryId){
        driver.findElement(By.id("country-btn")).click();
        driver.findElement(By.id(countryId)).click();
    }

}
