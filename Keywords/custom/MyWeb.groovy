package custom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.support.events.EventFiringWebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyWeb {

	@Keyword
	public static void closeBrowser() {
		closeBrowser1();
	}

	@Keyword
	public static void closeBrowser1() {
		def driver1 = ((EventFiringWebDriver) DriverFactory.getWebDriver());
		if (driver1 == null) {
			return;
		}

		def driver = driver1.getWrappedDriver();
		if (driver == null) {
			return;
		}

		try {
			def handles = driver.getWindowHandles();
			for (def handle : handles) {
				try {
					println "Closing tab: ${handle}...";
					driver.switchTo().window(handle);
					driver.close();
					Thread.sleep(1000);
					println "Tab ${handle} closed successfully"
				} catch (Throwable error) {
					println "Unable to close tab ${handle}: " + error.getMessage();
				}
			}
			try {
				println "Closing any tab left...";
				driver.close();
				Thread.sleep(1000);
			} catch (Throwable error) {
				//
			}
			try {
				println "Quitting driver...";
				driver.quit();
				Thread.sleep(1000);
				println "Done quitting driver"
			} catch (Throwable error) {
				println "Unable to quit the driver: " + error.getMessage();
			}
		} catch (Throwable error) {
			//
		}
	}
}
