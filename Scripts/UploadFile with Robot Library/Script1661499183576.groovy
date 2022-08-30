import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tus.io/demo.html')

WebUI.maximizeWindow()

WebUI.doubleClick(findTestObject('Page_Resumable File Upload Demo  tus/input_Select a file you want to upload_js-file-input'))

WebUI.delay(10)

//Robot robot = new Robot()
//robot.keyPress(KeyEvent.VK_ALT)
//robot.keyPress(KeyEvent.VK_F4)
// Function+F4 is now pressed
//WebDriver driver = DriverFactory.getWebDriver()
//WebElement element = driver.findElement('Page_Resumable File Upload Demo  tus/input_Select a file you want to upload_js-file-input')
//WebUI.executeJavaScript(null, null)
//WebElement element = WebUiCommonHelper.s
//findWebElement(findTestObject('Page_Resumable File Upload Demo  tus/input_Select a file you want to upload_js-file-input')) //element.sendKeys(Keys.chord(Keys.ALT, Keys.F4))
//WebUI.sendKeys(findTestObject('Page_Resumable File Upload Demo  tus/input_Select a file you want to upload_js-file-input'), Keys.ALT, Keys.F4.toString())
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.F4))
//WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.F4))
WebUI.sendKeys(null, Keys.chord(Keys.ALT, Keys.F4))
WebUI.sendKeys(null, Keys.chord(Keys.ALT, Keys.F4))
WebUI.delay(10)
WebUI.sendKeys(null, Keys.chord(Keys.ALT, Keys.F4))
WebUI.uploadFile(findTestObject('Page_Resumable File Upload Demo  tus/input_Select a file you want to upload_js-file-input'), 
    'C:\\Users\\quan.trinh\\Desktop\\cancel button.png')

WebUI.delay(10)

