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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://docs.katalon.com/docs/author/keywords/keyword-description-in-katalon-studio/web-ui-keywords/webui-verify-image-present#ariaid-title1')

//WebUI.scrollToElement(findTestObject('Verify Image Ex'), 10)
//WebUI.verifyImagePresent(findTestObject('Verify Image Ex'))
WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_WebUI Verify Image Present  Katalon Docs/img_Note_image img_E7b_ medium-zoom-image'), 
    0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_WebUI Verify Image Present  Katalon Docs/img_Note_image img_E7b_ medium-zoom-image'), 
    0)

WebUI.waitForImagePresent(findTestObject('Page_WebUI Verify Image Present  Katalon Docs/img_Note_image img_E7b_ medium-zoom-image'), 
    0)

