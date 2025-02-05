import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.google.gson.Gson as Gson
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities

Map<String, String> customHeader = new HashMap<String, String>()

customHeader.put('key', 'CAPTCHASKIPHEADER')

customHeader.put('value', 'SFTCAPTCHA')

DesiredCapabilities caps = DesiredCapabilities.chrome()

Map<String, String> loggingPrefs = new HashMap<String, String>()

loggingPrefs.put('performance', 'ALL')

caps.setCapability('goog:loggingPrefs', loggingPrefs)

ChromeOptions chromeOptions = new ChromeOptions()

chromeOptions.addArguments('--incognito')

// chromeOptions.setExperimentalOption("detach", true);
chromeOptions.addArguments('--user-agent=' + new Gson().toJson(customHeader))

//System.setProperty('webdriver.chrome.driver', DriverFactory.getChromeDriverPath())

System.setProperty('webdriver.chrome.driver', 'Include/drivers/chromedriver_linux64/chromedriver')

WebDriver driver = new ChromeDriver(chromeOptions)

DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl('chrome://version/')

