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

WebUI.openBrowser('https://demoqa.com/')

WebUI.scrollToElement(findTestObject('Check Box/card_Elements'), 0)

WebUI.click(findTestObject('Check Box/card_Elements'))

WebUI.scrollToElement(findTestObject('Buttons/menu_buttons'), 0)

WebUI.click(findTestObject('Buttons/menu_buttons'))

WebUI.verifyElementNotPresent(findTestObject('Buttons/text_DoubleClick'), 0)

WebUI.verifyElementNotPresent(findTestObject('Buttons/text_RightClick'), 0)

WebUI.verifyElementNotPresent(findTestObject('Buttons/text_ClickMe'), 0)

WebUI.scrollToElement(findTestObject('Buttons/btn_DoubleClickMe'), 0)

WebUI.doubleClick(findTestObject('Buttons/btn_DoubleClickMe'))

WebUI.verifyElementPresent(findTestObject('Buttons/text_DoubleClick'), 0)

WebUI.rightClick(findTestObject('Buttons/btn_RightClickMe'))

WebUI.verifyElementPresent(findTestObject('Buttons/text_RightClick'), 0)

WebUI.click(findTestObject('Buttons/btn_ClickMe'))

WebUI.verifyElementPresent(findTestObject('Buttons/text_ClickMe'), 0)

WebUI.closeBrowser()

