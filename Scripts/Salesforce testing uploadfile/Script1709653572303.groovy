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

WebUI.navigateToUrl('https://katalon-inc.my.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/Page_Login  Salesforce/input_Username_username'), 'quan.trinh@katalon.com.agent')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_pw'), 'V9wIKXrc2R4moShm3st2MQ==')

WebUI.click(findTestObject('Object Repository/Page_Sabs Cases  Cases  Salesforce/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_00016133  Case  Salesforce/button_test only'))

WebUI.setText(findTestObject('Object Repository/Page_00016133  Case  Salesforce/input_Search Cases and more_input-475'), 
    '16133')

WebUI.verifyElementText(findTestObject('Object Repository/Page_00016133  Case  Salesforce/span_00016133'), '00016133')

WebUI.click(findTestObject('Object Repository/Page_00016133  Case  Salesforce/span_00016133'))

WebUI.verifyElementClickable(findTestObject('Uploadfile - Salesforce'))

WebUI.uploadFile(findTestObject('Uploadfile - Salesforce'), '/Users/quan.trinh/Desktop/Screenshot 2024-03-06 at 18.52.40.png')

