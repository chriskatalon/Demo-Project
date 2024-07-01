import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://forum.katalon.com/')

//WebUI.click(findTestObject('Object Repository/Page_Katalon Community - Discuss, learn, an_96da7d/input_Welcome to Katalon Community_search-term'))

WebDriver driver = DriverFactory.getWebDriver()


// Click Login Button
WebElement loginButton = driver.findElement(By.xpath("//span[.='Log In']"))
WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(loginButton))


String text = "Webdriver"
WebElement search = driver.findElement(By.xpath("//input[@id='search-term']"))
WebUI.executeJavaScript("arguments[0].value='"+ text +"';", Arrays.asList(search))

//WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(search))
//WebElement element = WebUiCommonHelper.findWebElement(findTestObject('//input[@id='search-term']),5)

//WebUI.executeJavaScript(‘arguments[0].click()’, Arrays.asList(element))


