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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.Point as Point
import org.openqa.selenium.Rectangle as Rectangle

WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.google.com/?gws_rd=ssl')

WebDriver driver = DriverFactory.getWebDriver()

WebElement element = driver.findElement(By.xpath('//input[@title = \'Search\']'))

//WebElement Image = driver.findElement(By.xpath("//img[@border='0']"));
//Used points class to get x and y coordinates of element.
//Point classname = Image.getLocation();
Point classname = element.getLocation()

int xcordi = classname.getX()

System.out.println(('Element\'s Position from left side' + xcordi) + ' pixels.')

int ycordi = classname.getY()

System.out.println(('Element\'s Position from top' + ycordi) + ' pixels.')

WebUI.takeAreaScreenshotAsCheckpoint('search', new Rectangle(274, 197, 50, 350))

