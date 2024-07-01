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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon.com/pricing')

WebUI.click(findTestObject('Object Repository/Page_Software Quality Management Platform  _0ea48f/button_Reject All'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Software Quality Management Platform  _0ea48f/div_Buy via the AWS Marketplace'))

WebUI.click(findTestObject('Object Repository/Page_Software Quality Management Platform  _0ea48f/div_Buy via the AWS Marketplace'))

WebUI.switchToWindowTitle('AWS Marketplace: The Katalon Platform')

WebUI.verifyElementText(findTestObject('Object Repository/Page_AWS Marketplace The Katalon Platform/h1_The Katalon Platform'), 
    'The Katalon Platform')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_AWS Marketplace The Katalon Platform/h1_The Katalon Platform'), 
    0)

WebUI.closeBrowser()
