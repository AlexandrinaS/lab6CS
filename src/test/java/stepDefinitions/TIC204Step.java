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

public class TIC204Step {
    WebDriver driver;

    @Given("I launch chrome browser3")
    public void I_launch_chrome_browser3(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexandrina\\Desktop\\utm\\anu_4\\CS\\lab5CS\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @When ("I open loving herman homepage3")
    public void I_open_loving_herman_homepage3(){
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html");

    }
    @When("I Click Contact button")
    public void i_click_contact_button() {
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a")).click();
    }
    @When("I Fill the input field Name with valid data3")
    public void i_fill_the_input_field_name_with_valid_data3() {
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[1]/input")).sendKeys("Alex");
    }
    @When("I Fill the input field Email with valid data3")
    public void i_fill_the_input_field_email_with_valid_data3() {
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[2]/input")).sendKeys("test@mail.com");
    }

    @When("I Fill the input field Subject with valid data3")
    public void i_fill_the_input_field_subject_with_valid_data3() {
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[3]/input")).sendKeys("Shoes");
    }
    @When("I Fill the input field Message with valid data3")
    public void i_fill_the_input_field_message_with_valid_ata3() {
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[4]/textarea")).sendKeys("i want shoes");
}
    @When("I Click Send button3")
    public void i_click_send_button3() {

    }
    @Then("I am redirected to home page3")
    public void I_am_redirected_to_home_page3(){
        String url;
        url = driver.getCurrentUrl();
        Assert.assertEquals("https://loving-hermann-e2094b.netlify.app/contact.html", url);
    }
    @And("I close web driver3")
    public void I_close_web_driver3(){
        driver.quit();
    }
}
