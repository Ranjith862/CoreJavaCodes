package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://leafground.com/select.xhtml");
			driver.manage().window().maximize();
			WebElement selectTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
			selectTool.click();
			Select tool = new Select(selectTool);
			tool.selectByVisibleText("Selenium");
			WebElement selectCountry = driver.findElement(By.id("j_idt87:country_label"));
			selectCountry.click();
			Thread.sleep(2000);
			WebElement brazil = driver.findElement(By.id("j_idt87:country_1"));
			brazil.click();
		} catch (Exception e) {
			System.out.println("Error occured: " + e.getMessage());
		} finally {
			driver.close();
		}

	}

}
