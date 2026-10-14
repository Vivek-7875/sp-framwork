package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps1 {
    WebDriver driver;
        @Given("user launch the app url")
        public void user_launch_the_app_url(){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/login");
        }
        @When("user is on the login page")
        public  void user_is_on_the_login_page(){
            String expectedurl = "https://the-internet.herokuapp.com/login";
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Current Url is: "+currentUrl);
            if(currentUrl.equals(expectedurl)){
                System.out.println("User is on the login page");
            }
        }
        @Then("user enter the user name")
        public  void user_enter_the_user_name(){
            driver.findElement(By.id("username")).sendKeys("tomsmith" );
        }
        @And("user enter the password")
        public void user_enter_the_password(){
            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        }
        @Then("user click on the login button")
        public void user_click_on_the_login_button(){
            driver.findElement(By.xpath("//button[@class='radius']")).click();
        }

    }

