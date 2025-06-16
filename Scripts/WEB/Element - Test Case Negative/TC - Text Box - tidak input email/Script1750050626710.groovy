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

WebUI.openBrowser('https://demoqa.com')

WebUI.scrollToElement(findTestObject('Text Box/card_element'), 0)

WebUI.click(findTestObject('Text Box/card_element'))

WebUI.click(findTestObject('Text Box/menu_textbox'))

WebUI.setText(findTestObject('Text Box/field_FullName'), 'kiky nsr')

WebUI.setText(findTestObject('Text Box/field_email'), '')

WebUI.setText(findTestObject('Text Box/field_CurrentAddress'), 'medan')

WebUI.setText(findTestObject('Text Box/field_PermanentAddress'), 'jakarta')

WebUI.scrollToElement(findTestObject('Text Box/submit_btn'), 0)

WebUI.click(findTestObject('Text Box/submit_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Text Box/output_email'), 0)

WebUI.closeBrowser()

