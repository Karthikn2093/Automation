package testPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {

	public ChromeDriver driver;

	@AfterMethod
	public void exitApp(ITestResult result) throws IOException {

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./images/" + result.getName() + ".png");
		FileUtils.copyFile(src, dest);
		driver.quit();

	}

}
