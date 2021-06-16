package Cucumberframework_dataset.steps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
//	WebDriver driver;
    private RemoteWebDriver driver;

	//private CBTAPI api;	
    //private String score;

	@Before
	public void setup() throws MalformedURLException {
		
		//For CBT
//        String username = System.getenv("CBTUSRNAME").replaceAll("@", "%40");
//        String authkey = System.getenv("CBTAUTH");
		String username = "sanketh.shanbhag%40smartbear.com";
		String authkey = "";
        System.out.println(username);

        DesiredCapabilities caps = new DesiredCapabilities();
        HashMap<String, String> cbtoptions = new HashMap<String, String>();

        cbtoptions.put("record_video", "true");
        cbtoptions.put("screenResolution", "1366x768");
        caps.setCapability("name", "CBT Java");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("browserVersion", "84");
        caps.setCapability("platformName", "Windows 10");
        caps.setCapability("cbt:options", cbtoptions);


//        api = new CBTAPI(username, authkey);

        String hubAddress = String.format("http://%s:%s@hub.crossbrowsertesting.com:80/wd/hub", username, authkey);
        URL url = new URL(hubAddress);
        driver = new RemoteWebDriver(url, caps);
        // record a video using the API instead of the capabilities above.
        //api.record_video(driver.getSessionId().toString());
		
//		//For local chrome
//		System.setProperty("webdriver.chrome.driver","src//test//java//Cucumberframework_dataset//resources//chromedriver.exe");
//		this.driver = new ChromeDriver();
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().pageLoadTimeout(60000, TimeUnit.MILLISECONDS);
	}
		
	@Given("^I navigate to the demo store url \"([^\"]*)\"$")
	public void i_navigate_to_the_demo_store_url(String str_Url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to(str_Url);
	}

	@Given("^navigate to contactus page$")
	public void navigate_to_contactus_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='header']/div[1]/div/nav/nav[2]/a")).click();
	}

	@Given("^I enter a \"([^\"]*)\" Name\\.$")
	public void i_enter_a_Name(String str_UserName) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='FullName']")).sendKeys(str_UserName);
	}

	@Given("^I enter a \"([^\"]*)\" EmailId\\.$")
	public void i_enter_a_EmailId(String str_Emailid) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys(str_Emailid);
	}

	@Given("^I enter enquiry$")
	public void i_enter_enquiry(DataTable dt_enquirytext) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data = dt_enquirytext.raw();
		driver.findElement(By.xpath(".//*[@id='Enquiry']")).sendKeys(data.get(0).get(0) + "\n");
		driver.findElement(By.xpath(".//*[@id='Enquiry']")).sendKeys(data.get(0).get(1));
	}

	@When("^I click on Submit Button$")
	public void i_click_on_Submit_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id=\"content-center\"]/div/div[3]/form/div[6]/div/button")).click();
		
	}

	@Then("^I should be taken to the Succesful Submission Page\\.$")
	public void i_should_be_taken_to_the_Succesful_Submission_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String txt_success = driver.findElement(By.xpath(".//*[@id='content-center']/div/div[3]/div")).getText();
		System.out.println(txt_success);
		Assert.assertEquals("Your enquiry has been successfully sent to the store owner.", txt_success);
	}
	
	@After
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
	}


}
