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

WebUI.openBrowser("http://automationpractice.com/")
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Register/btn_signin'))

WebUI.setText(findTestObject('Object Repository/Register/txt_email'), 'gorohov1976@tubidu.com')

WebUI.click(findTestObject('Object Repository/Register/btn_createanaccount'))

WebUI.click(findTestObject('Object Repository/Register/btn_title'))

WebUI.setText(findTestObject('Object Repository/Register/txt_firstname'), 'Asma')

WebUI.setText(findTestObject('Object Repository/Register/txt_lastname'), 'Tester')

WebUI.setText(findTestObject('Object Repository/Register/txt_password'), 'Testing01@')

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/drop_days'), '5', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/drop_month'), '12', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/drop_years'), '1992', false)

WebUI.setText(findTestObject('Object Repository/Register/txt_company'), 'Jarv Group')

WebUI.setText(findTestObject('Object Repository/Register/txt_address'), 'Menara Cakrawala')

WebUI.setText(findTestObject('Object Repository/Register/txt_otheraddress'), 'Unit A')

WebUI.setText(findTestObject('Object Repository/Register/txt_city'), 'New York')

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/drop_state'), '32', false)

WebUI.setText(findTestObject('Object Repository/Register/txt_zipcode'), '06830')

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/drop_country'), '21', false)

WebUI.setText(findTestObject('Object Repository/Register/txt_homephone'), '655555566')

WebUI.setText(findTestObject('Object Repository/Register/txt_phonemobile'), '85552225555')

WebUI.delay(2)

WebUI.closeBrowser()







