package YahooSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooSearchTest {
private WebDriver driver;
    @BeforeTest(groups = {"hello"})
    public void setupDriver(){
    System.setProperty("webdriver.gecko.driver","C:\\Users\\keert\\IdeaProjects\\WebDriverJavaBootCamp\\src\\test\\resources\\geckodriver.exe");
    driver=new FirefoxDriver();

    }
    @Test(groups={"hello"})
    public void navigatingToMainPage() {
String url="http://yahoo.com";
driver.get(url);

    }
    @Test(groups="hello")
    public void testSearch() throws Exception {
        navigatingToMainPage();
        typeRequestInSearchInput();
        submitSearch();
        printOutAmountOfResult();
    }
    @Test
    public void typeRequestInSearchInput(){
        driver.findElement(YahooSearchMainPage.inputField).sendKeys("Portnov Computer School");

    }

    @Test
    public void submitSearch(){
        driver.findElement(YahooSearchMainPage.clickSubmit).click();
    }

    @Test
    public void printOutAmountOfResult(){
        String res= driver.findElement(YahooSearchMainPage.totalResult).getText();
        System.out.println(res);
    }

    // Add some changes
}
