package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.*;
import java.util.concurrent.TimeUnit;

public class TIC203Step {
    WebDriver driver;

    @Given("I launch chrome browser7")
    public void I_launch_chrome_browser7(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexandrina\\Desktop\\utm\\anu_4\\CS\\lab5CS\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When ("I open loving herman homepage7")
    public void i_open_loving_herman_homepage7(){
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html");
    }
    @When ("I scroll down to the end of the page")
    public void i_scroll_down_to_the_end_of_the_page(){
        boolean status;
        status = driver.findElement(By.xpath("/html/body/div[14]")).isDisplayed();
        Assert.assertTrue(status);
    }

    @When ("I click the facebook social button")
    public void i_click_the_facebook_social_button(){
        var element = driver.findElement(By.xpath("/html/body/div[14]/div/div[1]/ul/li[1]/a"));
        element.click();
    }
    @When ("I am redirected to link page")
    public void i_am_redirected_to_link_page(){
        var is_facebook_link = driver.getCurrentUrl().contains("facebook.com");
        Assert.assertTrue(is_facebook_link);
    }

    @And("I close web driver7")
    public void i_close_web_driver7(){
        driver.quit();
    }
}
