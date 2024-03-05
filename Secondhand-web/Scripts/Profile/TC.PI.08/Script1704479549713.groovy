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

WebUI.callTestCase(findTestCase('Step Definition Login/Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_bullet menu/btn_bullet'))

WebUI.click(findTestObject('Page_bullet menu/btn_edit'))

WebUI.sendKeys(findTestObject('Page_bullet menu/img_3'), 'C:\\Users\\aftar\\Downloads\\images.jpg')

WebUI.sendKeys(findTestObject('Page_bullet menu/input_nama'), 'Bunga')

WebUI.selectOptionByIndex(findTestObject('Page_bullet menu/pilih_kota'), '2')

WebUI.sendKeys(findTestObject('Page_bullet menu/input_alamatt'), 'Jl. Dulu')

WebUI.sendKeys(findTestObject('Page_bullet menu/input_no'), '0833333')

WebUI.click(findTestObject('Page_bullet menu/btn_save'))

