import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Test {
    public WebDriver driver;

    //Open Browser
    @BeforeTest
    public void testBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @org.testng.annotations.Test(priority = 1)
    public void openURL() {
        Stctv obj = new Stctv();
        obj.LoadPage(driver);
       /* driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.changelanguange(driver);*/
    }

    // Saudi Arabia
    @org.testng.annotations.Test(priority = 2)
    public void saudiTest() {
        Saudi saudiObj = new Saudi();
        saudiObj.litepacakage(driver);
        saudiObj.classicpacakage(driver);
        saudiObj.premiumpacakage(driver);
    }

    //Change to Bahrain
    @org.testng.annotations.Test(priority = 3)
    public void changetoBahrainTest() {
        Stctv obj = new Stctv();
        obj.selectCountry(driver, "bh");
    }

    @org.testng.annotations.Test(priority = 4)
    public void BahrainTest() {
        Bahrain bahrainObj = new Bahrain();
        bahrainObj.litepacakagebh(driver);
        bahrainObj.classicpacakagebh(driver);
        bahrainObj.premiumpacakagebh(driver);
    }

    //Change to Kuwait
    @org.testng.annotations.Test(priority = 5)

    public void changetoKuwaitTest() {
        Stctv obj = new Stctv();
        obj.selectCountry(driver, "kw");
    }

    @org.testng.annotations.Test(priority = 6)
    public void Kuwait() {
        Kuwait kuwaitObj = new Kuwait();
        kuwaitObj.litepacakagekw(driver);
        kuwaitObj.classicpacakagekw(driver);
        kuwaitObj.premiumpacakagekw(driver);
    }

    @AfterTest
    public void closebrowser() {
        driver.close();
    }
}




