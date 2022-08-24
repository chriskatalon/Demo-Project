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

WebUI.navigateToUrl('google.com')

WebUI.focus(findTestObject('Page_Google/input__q'))

WebUI.setText(findTestObject('Page_Google/input__q'), 'vietnam')

WebUI.click(findTestObject('Object Repository/Page_Google/input_Delete_btnK'))

WebUI.navigateToUrl('https://www.google.com/search?q=vietnam&source=hp&ei=UTkGY82lKtvT2roPuMWSyA0&iflsig=AJiK0e8AAAAAYwZHYYXZ52dLapyAuoO_bXNg04Gqwt0_&ved=0ahUKEwiNkvvA29_5AhXbqVYBHbiiBNkQ4dUDCAc&oq=vietnam&gs_lcp=Cgdnd3Mtd2l6EAwyEQguEIAEELEDEIMBEMcBENEDMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyBQgAEIAEMggIABCxAxCDATIFCAAQgAQyCAgAELEDEIMBMggIABCxAxCDATIICAAQgAQQyQMyCAgAELEDEIMBOgsILhCABBCxAxCDAToOCC4QsQMQgwEQxwEQ0QM6CwguEIAEEMcBEK8BOg4ILhCxAxCDARDHARCvAToLCC4QsQMQxwEQ0QNQyCFY5yZg8zRoAnAAeACAAaYBiAHSBpIBAzAuN5gBAKABAbABALgBAw&sclient=gws-wiz')

WebUI.closeBrowser()

