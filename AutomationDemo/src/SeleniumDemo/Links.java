package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Links {
	static List<WebElement> countOfLinks;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://leafground.com/link.xhtml");
			driver.manage().window().maximize();
		    countOfLinks = driver.findElements(By.tagName("a"));
			System.out.println("No Of Links: " + countOfLinks.size());

			for (WebElement linksName : countOfLinks) {
				String nameOfLinks = linksName.getText();
				System.out.println("Name of the Links: "+ nameOfLinks);
			}
			//Call the toCheckDublicate method:
			toCheckDuplicate();
			System.out.println("Displayed and Not Displayed Links: ");
			visibleAndNonVisible();
		} catch (Exception e) {
			System.out.println("Exception Handled: " + e);
		} finally {
			driver.quit();
		}

	}

	public static void toCheckDuplicate() {
         List<String> linkText = new ArrayList<>();
         
         Set<String> uniqueValue = new HashSet<>();
         Set<String> duplicateValue = new HashSet<>();
         
         for(WebElement checkDublicates : countOfLinks) {
        	 String text = checkDublicates.getText().trim();
        	 if(!text.isEmpty()) {
        		 if(!uniqueValue.add(text)) {
        			 duplicateValue.add(text);
        		 }
        		 linkText.add(text);
        	 }
         }
         
         if(duplicateValue.isEmpty()) {
        	 System.out.println("There is no dublicate Links.");
         }
         else {
        	 System.out.println("Dublicate links: ");
        	 for(String dublicate : duplicateValue) {
        		 System.out.println(dublicate);
        	 }
         }
	}
	
	public static void visibleAndNonVisible() {
		int displayedLinks = 0;
		int notDisplayedLinks = 0;
		for(WebElement displayed : countOfLinks) {
			if(displayed.isDisplayed()) {
				displayedLinks++;
			}
			else {
				notDisplayedLinks++;
			}
		}
		
		System.out.println("Total Links: "+ countOfLinks.size());
		System.out.println("Displayed Links: "+ displayedLinks);
		System.out.println("Not Displayed Links: "+ notDisplayedLinks);
	}
}
