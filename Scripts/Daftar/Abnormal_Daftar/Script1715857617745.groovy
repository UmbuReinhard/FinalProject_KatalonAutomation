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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://metrodataacademy.id/')

WebUI.click(findTestObject('Object Repository/Daftar/a_Daftar'))

WebUI.setText(findTestObject('Object Repository/Daftar/input__name'), 'Indah Dwi Sulistiyawati')

WebUI.setText(findTestObject('Object Repository/Daftar/input__email'), 'dsindah87@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Daftar/input__password'), '1yqqhzF9jWbq43zIrQMuwl2yFgQvFLEn')

WebUI.setEncryptedText(findTestObject('Object Repository/Daftar/input__confirmPassword'), '1yqqhzF9jWbq43zIrQMuwl2yFgQvFLEn')

WebUI.delay(2)
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Daftar/input__termsCondition'))

WebUI.click(findTestObject('Object Repository/Daftar/button_Daftar'))

WebUI.delay(2)
WebUI.takeScreenshot()

// Verifikasi dan ambil screenshot untuk alert "Email sudah terdaftar"
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Daftar/li_Email sudah terdaftar'), 5)) {
    println('Email sudah terdaftar')
    WebUI.takeScreenshot()
} else {
    println('Registrasi berhasil atau alert tidak ditemukan')
    WebUI.takeScreenshot()
}

WebUI.closeBrowser()
