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

WebUI.navigateToUrl('http://10.13.194.39:84/login')

WebUI.setText(findTestObject('Object Repository/Page_Login  Card Center Management System  CCMS/input_Login__username'), 
    'superadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Card Center Management System  CCMS/input_Login__password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Login  Card Center Management System  CCMS/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Card Center Management System  CCMS/a_Card Report'))

WebUI.click(findTestObject('Object Repository/Page_Card Center Management System  CCMS/span_Card Info'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Card Center Management System  CCMS/select_Select card statusPendingApprovedSen_3d59c9'), 
    '9', true)

WebUI.click(findTestObject('Object Repository/Page_Card Center Management System  CCMS/button_Filter'))

WebUI.closeBrowser()

