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



class AdditionSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to Google search page")
	def navigateToGoogleSearchPage() {
		println ("\n I am inside navigateToGoogleSearchPage")
		WebUI.openBrowser("http://www.google.com")
	}

	@When("User enters (.*)")
	def enterMathFunction(String math_function) {
		println ("\n I am inside enterMathFunction(String math_function)")
		WebUI.setText(findTestObject('Object Repository/Page_Google/input_Sign in_q'), math_function)
	}

	@And("User clicks the Google Search button")
	def clickGoogleSearchButton() {
		println ("\n I am inside clickGoogleSearchButton")
		WebUI.click(findTestObject('Object Repository/Page_Google/input_Remove_btnK'))
	}

	@Then("The Google results page is displayed with the correct (.*) from the addition of the numeric values")
	def verifyAdditionResult(String result) {
		println ("\n I am inside verifyAdditionResult")
		WebUI.verifyElementText(findTestObject('Object Repository/Page_34 - Google Search/div_7 (function()var adocument.getElementBy_60f9ac'), result)
		WebUI.closeBrowser()
	}
}