package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tables {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.gecko.driver", "C:/Users/Karthik/Eclipse Workspace/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.cricbuzz.com/live-cricket-scorecard/15069/ind-vs-rsa-1st-test-south-africa-tour-of-india-2015");
			Thread.sleep(3000);
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int sum = 0;
		for(int i=0; i<count-2 ; i++) {
			
			String scorest =  table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int score = Integer.parseInt(scorest);
			sum = sum + score;
			
			
		}
		String extrascore = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extras = Integer.parseInt(extrascore);
		String tot_score = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int total = Integer.parseInt(tot_score);
		int total_score = sum + extras;
		
		if(total_score == total) {
			System.out.println("Same");
		}else {
			System.out.println("Not");
		}
		

	}

}
