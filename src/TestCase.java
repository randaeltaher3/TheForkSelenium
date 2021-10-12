import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;  


public class TestCase {

	public static void main(String[] args) throws InterruptedException{
	
		
				//Using Chrome as Browser
		
				
				String path = System.getProperty("user.dir");
				System.setProperty("webdriver.Chrome.driver", path + "\\Drivers\\chromedriver.exe");	
				ChromeDriver driver = new ChromeDriver();
				
				//go to "www.thefork.com/fr"
				driver.get("https://www.thefork.com/fr");
				System.out.println("Browser Title =  "+driver.getTitle());
				
				//Verify the Website Title
				String ActualTitle = driver.getTitle();
				String ExpectedTitle = "thefork.com";
				Assert.assertEquals(ExpectedTitle, ActualTitle);
				System.out.println("Step Assertion Passed!");
				
				//Maximize current window
				driver.manage().window().maximize();

				//Delay to view the maximize operation and handling the robot Manually (If any)
				Thread.sleep(30000);
					
				//Click on "Accept"
				WebElement acceptButton = driver.findElement(By.id("_evidon-accept-button"));
				acceptButton.click();
				System.out.println(acceptButton.getText());
				
				//Click on "LOG IN"
				WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/button"));
				loginButton.click();
				
				//Delay to view the Tab
				Thread.sleep(5000);
				
				//enter E-mail address
				WebElement emailField = driver.findElement(By.id("identification_email"));
				emailField.sendKeys("randaeltaher3@gmail.com");
				
				//Click on "Continue"
				WebElement continueButtonEmail = driver.findElement(By.xpath("//*[@id=\"USER_SPACE_FIRST_PANEL\"]/div[2]/div[1]/div/div[3]/form[1]/div[2]/button"));
				continueButtonEmail.click();
				
				//Delay to view the Tab
				Thread.sleep(5000);
				
				//enter password
				WebElement passwordField = driver.findElement(By.id("password"));
				passwordField.sendKeys("Niceday123$");
				
				//Click on "Continue"
				WebElement continueButtonPassword = driver.findElement(By.xpath("//*[@id=\"USER_SPACE_FIRST_PANEL\"]/div[2]/div[2]/div/div[2]/form/div[2]/button"));
				continueButtonPassword.click();
				
				//Click on "My personal information"
				WebElement myPersonalInformationPassword = driver.findElement(By.xpath("//*[@id=\"USER_SPACE_FIRST_PANEL\"]/ul/li[1]/div/button"));
				continueButtonPassword.click();
				
				//Assertion for My personal information 
				
				//Verify the First Name
				WebElement ActualFirstName = driver.findElement(By.xpath("//*[@id=\"USER_SPACE_SECOND_PANEL\"]/div[2]/section[1]/form/div[2]/div[1]/label/input"));
				String ExpectedTFirstName = "Randa";
				Assert.assertEquals(ExpectedTFirstName, ActualFirstName.getText());
				System.out.println("Step Assertion Passed!");
				
				//Verify the Last Name
				WebElement  ActualLastName = driver.findElement(By.xpath("//*[@id=\"USER_SPACE_SECOND_PANEL\"]/div[2]/section[1]/form/div[2]/div[2]/label/input"));
				String ExpectedLastName = "Eltaher";
				Assert.assertEquals(ExpectedLastName, ActualLastName.getText());
				System.out.println("Step Assertion Passed!");
				
				
				//Close the browser
				driver.close();
				System.out.println("Passed!");


	}

}
