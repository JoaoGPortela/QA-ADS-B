import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://www.blazedemo.com/")
selenium.click("name=fromPort")
selenium.select("name=fromPort", "label=Mexico City")
selenium.click("name=toPort")
selenium.select("name=toPort", "label=London")
selenium.click("xpath=//input[@value='Find Flights']")
selenium.click("xpath=//input[@value='Choose This Flight']")
selenium.click("id=inputName")
selenium.type("id=inputName", "rand")
selenium.type("id=address", "sadsda")
selenium.type("id=city", "SP")
selenium.click("id=city")
selenium.click("id=city")
selenium.type("id=city", ("xique-xique bahia").toString())
selenium.type("id=state", "bahia")
selenium.type("id=zipCode", "12345")
selenium.click("id=creditCardNumber")
selenium.type("id=creditCardNumber", "1234123412341234")
selenium.click("id=creditCardMonth")
selenium.click("id=creditCardYear")
selenium.type("id=creditCardYear", "2025")
selenium.click("id=nameOnCard")
selenium.type("id=nameOnCard", ("rand smith").toString())
selenium.click("id=rememberMe")
selenium.click("xpath=//input[@value='Purchase Flight']")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Wed, 23 Apr 2025 22:51:52 +0000'])[1]/following::pre[1]")
selenium.click("link=home")
