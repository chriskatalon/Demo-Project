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

WebUI.navigateToUrl('https://www.google.com/')

WebUI.setText(findTestObject('Object Repository/Page_Google/textarea_q'), 'nhua quan kiet')

WebUI.click(findTestObject('Object Repository/Page_Google/input_btnK'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_nhua quan kiet - Tm trn Google/h3_QUN KIT_ Trang ch'), 'QUÂN KIỆT: Trang chủ')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_nhua quan kiet - Tm trn Google/h3_QUN KIT_ Trang ch'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_nhua quan kiet - Tm trn Google/h3_QUN KIT_ Trang ch'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Trang ch - QUN KIT/img_attachment-large size-large'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Page_Trang ch - QUN KIT/li_menu-item-687'))

WebUI.click(findTestObject('Object Repository/Page_Trang ch - QUN KIT/a_SN PHM'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Sn phm - QUN KIT/img_show-on-hover absolute fill hide-for-small b'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Page_Sn phm - QUN KIT/div_Np nha lon thic, lon sa, lon pate'))

WebUI.click(findTestObject('Object Repository/Page_Sn phm - QUN KIT/img_show-on-hover absolute fill hide-for-small b'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Np nha lon thic, lon sa, lon pate - QUN KIT/a_Quai xch thng sn'), 
    0)

WebUI.closeBrowser()

