import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://demoqa.com')

WebUI.scrollToElement(findTestObject('Check Box/card_Elements'), 0)

WebUI.click(findTestObject('Check Box/card_Elements'))

WebUI.click(findTestObject('Check Box/menu_CheckBox'))

WebUI.scrollToElement(findTestObject('Check Box/btn_ExpandHome'), 0)

WebUI.click(findTestObject('Check Box/btn_ExpandHome'))

WebUI.click(findTestObject('Check Box/btn_ExpandDesktop'))

WebUI.click(findTestObject('Check Box/checkbox_Notes'))

WebUI.verifyTextPresent('', false)

WebUI.verifyTextPresent('', false)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

