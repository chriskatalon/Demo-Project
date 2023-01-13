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

WebUI.navigateToUrl('https://mydc-qa2.mydirectives.com/#/Login')

WebUI.setText(findTestObject('Page_Login  MyDirectives for Clinicians/input_Username_md-input-2mimmh1s'), 'qababetest+wednesday@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login  MyDirectives for Clinicians/input_Password_md-input-77d4ddoki'), 'psGh2IEvP4ILdyZXRZuznQ==')

WebUI.click(findTestObject('Page_Login  MyDirectives for Clinicians/div_Submit'))

WebUI.click(findTestObject('Page_Welcome to MyDirectives for Clinicians  MyDirectives for Clinicians/div_Start ACP Session or View Patient Documents'))

WebUI.click(findTestObject('Page_Patient Search  MyDirectives for Clinicians/div_Amy Johnson'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Page_Dashboard  MyDirectives for Clinicians/div_Digital Advance Care Plan (Not Complete)'))

WebUI.enhancedClick(findTestObject('Page_Dashboard  MyDirectives for Clinicians/div_Digital Advance Care Plan (Not Complete)'))

WebUI.click(findTestObject('Page_Create Uadd  MyDirectives for Clinicians/span_My Advance Care Goals'))

//WebUI.dragAndDropToObject(findTestObject('Page_Create Uadd  MyDirectives for Clinicians/div_Being free from pain'), findTestObject('Page_Create Uadd  MyDirectives for Clinicians/span_Select (drag) one or more items listed below to this section'))

CustomKeywords.'customkeywords.DragandDropHelper.dragAndDrop'(findTestObject('Page_Create Uadd  MyDirectives for Clinicians/div_Being free from pain'), 
    findTestObject('Page_Create Uadd  MyDirectives for Clinicians/span_Select (drag) one or more items listed below to this section'))

