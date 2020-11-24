package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import com.browserstack.local.Local;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class TIC206Steps {

    WebDriver driver;


    @Given("I launch chrome browser")
    public void I_launch_chrome_browser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexandrina\\Desktop\\utm\\anu_4\\CS\\lab5CS\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When ("I open loving herman homepage")
    public void I_open_loving_herman_homepage(){
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html");

    }

    @And ("I click the button sign up")
    public void I_click_the_button_sign_up(){
        Actions action = new Actions(driver);
        var element = driver.findElement(By.xpath("//*[@id=\"home\"]/div/ul/li[2]/a"));
        element.click();
    }
    @Then("I check that A pop up form is displayed")
    public void i_check_that_a_pop_up_form_is_displayed() {
        String status;
        status = driver.findElement(By.xpath("//*[@id=\"myModal2\"]")).getAttribute("style");
        Assert.assertEquals("display: block;", "display: block;");
    }

    @When("I Fill the input field Name with valid data")
    public void i_fill_the_input_field_name_with_valid_data() {
        driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[1]/input")).sendKeys("Alex");
    }

    @When("I Fill the input field Email with valid data")
    public void i_fill_the_input_field_email_with_valid_data() {
        driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[2]/input")).sendKeys("alex0@gmail.com");
    }
    @When("I Fill the input field Password with valid data")
    public void i_fill_the_input_field_password_with_valid_data() {
        driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[3]/input")).sendKeys("12345");

    }
    @When("I Fill the input field Confirm Password with valid data")
    public void i_fill_the_input_field_confirm_password_with_valid_data() {
        driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[4]/input")).sendKeys("12345");
    }
    @Then("I press the button sign up")
    public void i_press_the_button_sign_up()
    {
        Actions action = new Actions(driver);
        var element = driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/input"));
        element.click();
    }
    @Then("I am redirected to home page")
    public void I_am_redirected_to_home_page(){
        String url;
        url = driver.getCurrentUrl();
        Assert.assertEquals("https://loving-hermann-e2094b.netlify.app/index.html", url);
    }

    @And("I close web driver")
    public void I_close_web_driver(){
        driver.quit();
    }

}
