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

public class TIC207Steps {

    WebDriver driver;

    @Given("I launch chrome browser2")
    public void I_launch_chrome_browser2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexandrina\\Desktop\\utm\\anu_4\\CS\\lab5CS\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @When ("I open loving herman homepage2")
    public void I_open_loving_herman_homepage2(){
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html");

    }

    @And ("I click the button sign up2")
    public void I_click_the_button_sign_up2(){
        Actions action = new Actions(driver);
        var element = driver.findElement(By.xpath("//*[@id=\"home\"]/div/ul/li[2]/a"));
        element.click();
    }
    @Then("I check that A pop up form is displayed2")
    public void i_check_that_a_pop_up_form_is_displayed2() {
        String status;
        status = driver.findElement(By.xpath("//*[@id=\"myModal2\"]")).getAttribute("style");
        Assert.assertEquals("display: block;", "display: block;");
    }

    @When("I Fill the input field Name with valid data2")
    public void i_fill_the_input_field_name_with_valid_data2() {
        driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[1]/input")).sendKeys("Alex");
    }
    @When("I Fill the input field Email with invalid data")
    public void i_fill_the_input_field_email_with_invalid_data() {
        driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[2]/input")).sendKeys("testmail.com");
    }

    @When("I Fill the input field Password with valid data2")
    public void i_fill_the_input_field_password_with_valid_data2() {
        driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[3]/input")).sendKeys("test");
    }

    @When("I Fill the input field Confirm Password with valid data2")
    public void i_fill_the_input_field_confirm_password_with_valid_data2() {
        driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[4]/input")).sendKeys("test");
    }

    @When("I Click SIGN UP button2")
    public void i_click_sign_up_button2() {
        driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/input")).click();
    }

    @Then("Alert message is displayed under the input field Email")
    public void alert_message_is_displayed_under_the_input_field_email() {
        boolean status;
        status = driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[2]/input")).isDisplayed();
        Assert.assertTrue(status);
    }
    @And("I close web driver2")
    public void I_close_web_driver2(){
        driver.quit();
    }
}

