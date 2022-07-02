package StepDefinations;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

    public class StepDefs {


        public WebDriver driver;
        public LoginPage lp;


        @Given("user launch Chrome Browser")
        public void userLaunchChromeBrowser() {
            //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers/chromedriver");
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

            driver = new ChromeDriver();
            lp = new LoginPage(driver);
        }



        @When("user opens URL {string}")
        public void userOpensURL(String url) {
            driver.get(url);

        }

        @And("User enters email as {string} and Password as {string}")
        public void userEntersEmailAsAndPasswordAs(String email, String password) {
            lp.setTxtUserName(email);
            lp.setTxtPassword(password);
        }
     // @Test(invocationCount = 2)
        @And("Click on Login")
        public void clickOnLogin() {
            lp.setTxtLoginbtn();
        }

        //@Then("Page Title should be {string}")
        //public void pageTitleShouldBe(String title) {
           // if (driver.getPageSource().contains("Login was unsuccessful")) {

             //   driver.close();
               // Assert.assertTrue(false);
           // } else {

               // Assert.assertEquals(title, driver.getTitle());
            //}

            //driver.getTitle();
       // }



        @When("User Clicks on Logout link")
        public void userClicksOnLogoutLink() throws InterruptedException {

            lp.setTxtLogoutbtn();
            Thread.sleep(3000);

        }

        @And("Close the browser")
        public void closeTheBrowser() {
        }
    }



