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

WebUI.callTestCase(findTestCase('SU-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Create Account/radio_gender'))

WebUI.setText(findTestObject('Create Account/input__customer_firstname'), GlobalVariable.firstName)

WebUI.setText(findTestObject('Create Account/input__customer_lastname'), GlobalVariable.lastName)

WebUI.setText(findTestObject('Create Account/input__email'), GlobalVariable.emailAddress)

WebUI.setText(findTestObject('Create Account/input__passwd'), GlobalVariable.password)

WebUI.selectOptionByValue(findTestObject('Create Account/dropdown_day'), '6', false)

WebUI.selectOptionByValue(findTestObject('Create Account/dropdown_mounth'), '10', false)

WebUI.selectOptionByValue(findTestObject('Create Account/dropdown_year'), '1995', false)

WebUI.setText(findTestObject('Create Account/input__firstname'), GlobalVariable.firstName)

WebUI.setText(findTestObject('Create Account/input__lastname'), GlobalVariable.lastName)

WebUI.setText(findTestObject('Create Account/company'), GlobalVariable.company)

WebUI.setText(findTestObject('Create Account/address'), GlobalVariable.address)

WebUI.setText(findTestObject('Create Account/address line 2'), GlobalVariable.addressLine2)

WebUI.setText(findTestObject('Create Account/city'), GlobalVariable.city)

WebUI.selectOptionByValue(findTestObject('Create Account/dropdown-city'), '4', false)

WebUI.setText(findTestObject('Create Account/posCode'), GlobalVariable.posCode)

WebUI.setText(findTestObject('Create Account/auditional-Information'), GlobalVariable.auditionalInfo)

WebUI.setText(findTestObject('Create Account/home-phone'), GlobalVariable.homePhone)

WebUI.setText(findTestObject('Create Account/phone_number'), GlobalVariable.phoneNumber)

WebUI.click(findTestObject('Create Account/register_button'))

