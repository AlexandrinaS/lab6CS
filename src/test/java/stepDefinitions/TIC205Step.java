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
import io.cucumber.java.en.*;
import java.util.concurrent.TimeUnit;

public class TIC205Step {
    WebDriver driver;

    @Given("I launch chrome browser4")
    public void I_launch_chrome_browser4(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexandrina\\Desktop\\utm\\anu_4\\CS\\lab5CS\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @When ("I open loving herman homepage4")
    public void I_open_loving_herman_homepage4(){
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html");

    }
    @When("I Click Contact button2")
    public void i_click_contact_button2() {
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a")).click();
    }
    @When("I Fill the input field Name with valid data4")
    public void i_fill_the_input_field_name_with_valid_data4() {
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[1]/input")).sendKeys("Alex");
    }
    @When("I Fill the input field Email with invalid data4")
    public void i_fill_the_input_field_email_with_invalid_data4() {
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[2]/input")).sendKeys("test@mail.com");
    }

    @When("I Fill the input field Subject with valid data4")
    public void i_fill_the_input_field_subject_with_valid_data4() {
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[3]/input")).sendKeys("Shoes");
    }
    @When("I Fill the input field Message with valid data4")
    public void i_fill_the_input_field_message_with_valid_ata4() {
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[4]/textarea")).sendKeys("i want shoes");
    }
    @When("I Click Send button4")
    public void i_click_send_button4() {

    }
    @Then("Alert message is displayed under the input field Email2")
    public void alert_message_is_displayed_under_the_input_field_email2() {
        boolean status;
        status = driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[2]/input")).isDisplayed();
        Assert.assertTrue(status);
    }
    @Then("I am redirected to home page4")
    public void I_am_redirected_to_home_page4(){
        String url;
        url = driver.getCurrentUrl();
        Assert.assertEquals("https://loving-hermann-e2094b.netlify.app/contact.html", url);
    }
    @And("I close web driver4")
    public void I_close_web_driver4(){
        driver.quit();
    }
}
