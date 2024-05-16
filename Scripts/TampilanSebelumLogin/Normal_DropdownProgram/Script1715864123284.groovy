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

WebUI.maximizeWindow()

// Klik pada elemen dropdown "Program"
WebUI.click(findTestObject('Object Repository/DropdownProgram/DropdownProgram/span_Program'))

// Temukan dan klik pada elemen "Metrodata Training"
TestObject targetElement = findTestObject('Object Repository/DropdownProgram/DropdownProgram/span_Metrodata Training_absolute inset-0')

// Scroll ke elemen "Metrodata Training"
WebUI.scrollToElement(targetElement, 5)

// Klik pada elemen "Metrodata Training"
WebUI.click(findTestObject('Object Repository/DropdownProgram/DropdownProgram/div_Digital learning provider terbaik yang mampu meningkatkan potensi Anda serta menjembatani kesenjangan digital bagi profesional dan akademisi.FacebookInstagramLinkedinYouTubePerusahaanTerms  ConditionTentang KamiArtik'))

WebUI.delay(2)

// Ambil screenshot
WebUI.takeScreenshot()

WebUI.closeBrowser()
