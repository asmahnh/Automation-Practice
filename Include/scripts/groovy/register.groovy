import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class register {

	@Given("User open the URL Testing")
	def openurltesting() {
		println ("\n URL testing should be opened")
		
		WebUI.openBrowser("http://automationpractice.com/")
		WebUI.maximizeWindow()
	}

	@When("User clicks Sign in menu")
	def clicksigninmenu() {
		println ("\n sign in menu should be opened")
		
		WebUI.click(findTestObject('Object Repository/Register/btn_signin'))
	}

	@And("User enter an email address(.*)")
	def enteremail(String email) {
		println ("\n email should be filled")
		
		WebUI.setText(findTestObject('Object Repository/Register/txt_email'), 'gorohov1976@tubidu.com')
	}

	@And("User clicks Create an account button")
	def clickscreateanaccountbutton() {
		println ("\n Register account page should be displayed")
		
		WebUI.click(findTestObject('Object Repository/Register/btn_createanaccount'))
	}

	@And("User select the title(.*)")
	def selecttitle(String title) {
		println ("\n title should be filled")
		
		WebUI.click(findTestObject('Object Repository/Register/btn_title'))
	}

	@And("User enter the First Name(.*)")
	def enterfirstname(String firtsname) {
		println ("\n First name should be filled")
		
		WebUI.setText(findTestObject('Object Repository/Register/txt_firstname'), 'Asma')
	}

	@And("User enter the Last Name(.*)")
	def enterlastname(String lastname) {
		println ("\n Last name should be filled")
		
		WebUI.setText(findTestObject('Object Repository/Register/txt_lastname'), 'Tester')
	}

	@And("User enter the Password(.*)")
	def enterpassword(String password) {
		println ("\n Password should be filled")
		
		WebUI.setText(findTestObject('Object Repository/Register/txt_password'), 'Testing01@')
	}

	@And("User select the date of birth(.*)")
	def selectdateofbirth(String date) {
		println ("\n date of birth should be filled")
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Register/drop_days'), '5', false)
	}

	@And("User select the month of birth(.*)")
	def selectmonthofbirth(String month) {
		println ("\n Month of birth should be filled")
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Register/drop_month'), '12', false)
	}

	@And("User select the year of birth(.*)")
	def selectyearofbirth(String year) {
		println ("\n Year of birth should be filled")
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Register/drop_years'), '1992', false)
	}

	@And("User enter the Company(.*)")
	def entercompany(String company) {
		println ("\n Company should be filled")
		
		WebUI.setText(findTestObject('Object Repository/Register/txt_company'), 'Jarv Group')
	}

	@And("User enter the Address(.*)")
	def enteraddress(String address) {
		println ("\n Address should be filled")
		
		WebUI.setText(findTestObject('Object Repository/Register/txt_address'), 'Menara Cakrawala')
	}

	@And("User enter the City(.*)")
	def entercity(String city) {
		println ("\n City should be filled")
		
		WebUI.setText(findTestObject('Object Repository/Register/txt_city'), 'New York')
	}

	@And("User select the State(.*)")
	def selectstate(String state) {
		println ("\n State should be filled")
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Register/drop_state'), '32', false)
	}

	@And("User enter the Zipcode(.*)")
	def enterzipcode(String zipcode) {
		println ("\n Zipcode should be filled")
		
		WebUI.setText(findTestObject('Object Repository/Register/txt_zipcode'), '06830')
	}

	@And("User select the Country(.*)")
	def selectcountry(String country) {
		println ("\n Country should be filled")
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Register/drop_country'), '21', false)
	}

	@And("User enter the Homephone(.*)")
	def enterhomephone(String homephone) {
		println ("\n Homephone should be filled")
		
		WebUI.setText(findTestObject('Object Repository/Register/txt_homephone'), '655555566')
	}

	@And("User enter the Mobilephone(.*)")
	def entermobilephone(String mobilephone) {
		println ("\n Mobilephone should be filled")
		
		WebUI.setText(findTestObject('Object Repository/Register/txt_phonemobile'), '85552225555')
	}

	@And("User clicks Register button")
	def clicksregisterbutton() {
		println ("\n Register button should be clicked")
		
		WebUI.click(findTestObject('Object Repository/Register/btn_register'))
	}

	@Then("User register new account successful")
	def registernewaccount() {
		println ("\n Register new account should be success")
		
		WebUI.click(findTestObject('Object Repository/Register/btn_account'))
		WebUI.delay(3)
		WebUI.closeBrowser()
	}
}