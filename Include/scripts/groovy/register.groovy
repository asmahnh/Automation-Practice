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
	}

	@When("User clicks Sign in menu")
	def clicksigninmenu() {
		println ("\n sign in menu should be opened")
	}

	@And("User enter an email address(.*)")
	def enteremail(String email) {
		println ("\n email should be filled")
	}

	@And("User clicks Create an account button")
	def clickscreateanaccountbutton() {
		println ("\n Register account page should be displayed")
	}

	@And("User select the title(.*)")
	def selecttitle(String title) {
		println ("\n title should be filled")
	}

	@And("User enter the First Name(.*)")
	def enterfirstname(String firtsname) {
		println ("\n First name should be filled")
	}

	@And("User enter the Last Name(.*)")
	def enterlastname(String lastname) {
		println ("\n Last name should be filled")
	}

	@And("User enter the Password(.*)")
	def enterpassword(String password) {
		println ("\n Password should be filled")
	}

	@And("User select the date of birth(.*)")
	def selectdateofbirth(String date) {
		println ("\n date of birth should be filled")
	}

	@And("User select the month of birth(.*)")
	def selectmonthofbirth(String month) {
		println ("\n Month of birth should be filled")
	}

	@And("User select the year of birth(.*)")
	def selectyearofbirth(String year) {
		println ("\n Year of birth should be filled")
	}

	@And("User enter the Company(.*)")
	def entercompany(String company) {
		println ("\n Company should be filled")
	}

	@And("User enter the Address(.*)")
	def enteraddress(String address) {
		println ("\n Address should be filled")
	}

	@And("User enter the Address Lain(.*)")
	def enteraddresslain(String addresslain) {
		println ("\n Address Lain should be filled")
	}

	@And("User enter the City(.*)")
	def entercity(String city) {
		println ("\n City should be filled")
	}

	@And("User select the State(.*)")
	def selectstate(String state) {
		println ("\n State should be filled")
	}

	@And("User enter the Zipcode(.*)")
	def enterzipcode(String zipcode) {
		println ("\n Zipcode should be filled")
	}

	@And("User select the Country(.*)")
	def selectcountry(String country) {
		println ("\n Country should be filled")
	}

	@And("User enter the Homephone(.*)")
	def enterhomephone(String homephone) {
		println ("\n Homephone should be filled")
	}

	@And("User enter the Mobilephone(.*)")
	def entermobilephone(String mobilephone) {
		println ("\n Mobilephone should be filled")
	}

	@And("User clicks Register button")
	def clicksregisterbutton() {
		println ("\n Register button should be clicked")
	}

	@Then("User register new account successful")
	def registernewaccount() {
		println ("\n Register new account should be success")
	}
}