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

public class TIC178Step {
    WebDriver driver;
    String product_title;

    @Given("I launch chrome browser5")
    public void I_launch_chrome_browser5(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alexandrina\\Desktop\\utm\\anu_4\\CS\\lab5CS\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @When ("I open loving herman homepage5")
    public void I_open_loving_herman_homepage5(){
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html");
    }
    @When("I save the title of the selected product")
    public void i_save_the_title_of_the_selected_product(){
       product_title = driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div/div[1]/div[1]/div/div[2]/h4/a")).getText();
    }
    @When("I hover the image of the selected product from section New Arrival")
    public void i_hover_the_image_of_the_selected_product_from_section_new_arrival() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div/div[1]/div[1]/div/div[1]"));
        action.moveToElement(element).perform();
    }
    @Then("I check that black button Quick View is displayed")
    public void i_check_that_black_button_quick_view_is_displayed() {
        boolean status;
        status = driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div/div[1]/div[1]/div/div[1]/div/div/a")).isDisplayed();
        Assert.assertTrue(status);}

    @When("I click the button Quick View")
    public void i_click_the_button_quick_view() throws InterruptedException {
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div/div[1]/div[1]/div/div[1]/div/div/a"));
        action.moveToElement(element).click();
    }

    @Then("I am redirected to another page that presents selected product")
    public void i_am_redirected_to_another_page_that_presents_selected_product() {
        boolean status;
        status = driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div/div[1]/div[1]/div")).isDisplayed();
        Assert.assertTrue(status);
    }

    @Then("I check the title of the selected product")
    public void i_check_the_title_of_the_selected_product() {
       var current_title = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/h3")).getText();
       Assert.assertEquals(product_title, current_title);
    }
    @Then("I close the browser5")
    public void i_close_the_browser() {
        driver.quit();
    }
}
