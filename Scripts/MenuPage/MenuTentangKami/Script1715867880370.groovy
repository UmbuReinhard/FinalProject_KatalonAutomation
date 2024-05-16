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

WebUI.click(findTestObject('Object Repository/TentangKami/Page_Metrodata Academy/svg_Open menu_w-6 h-6 text-white'))

WebUI.click(findTestObject('Object Repository/TentangKami/Page_Metrodata Academy/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/TentangKami/Page_Metrodata Academy/input__email'), 'wisma.kurnia@ms.mii.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/TentangKami/Page_Metrodata Academy/input__password'), '6Vl+jaOc5RfTCe1KgSC8DI9bVHJNi6QT')

WebUI.click(findTestObject('Object Repository/TentangKami/Page_Metrodata Academy/button_Masuk'))

WebUI.click(findTestObject('Object Repository/TentangKami/Page_Metrodata Academy/svg_Open menu_w-6 h-6 text-white'))

WebUI.click(findTestObject('Object Repository/TentangKami/Page_Metrodata Academy/a_Tentang Kami'))

WebUI.click(findTestObject('Object Repository/TentangKami/Page_Metrodata Academy/button_Tap to unmute_ytp-large-play-button ytp-button ytp-large-play-button-red-bg'))

WebUI.click(findTestObject('Object Repository/TentangKami/Page_Metrodata Academy/button_Watch on_ytp-play-button ytp-button'))

WebUI.click(findTestObject('Object Repository/TentangKami/Page_Metrodata Academy/button_Metrodata Academy_w-9 h-9 lgw-10 lgh_1e0ff3'))

WebUI.click(findTestObject('Object Repository/TentangKami/Page_Metrodata Academy/button_Metrodata Academy_w-9 h-9 lgw-10 lgh_1e0ff3'))

WebUI.click(findTestObject('Object Repository/TentangKami/Page_Metrodata Academy/button_Metrodata Academy_w-9 h-9 lgw-10 lgh_1e0ff3'))

WebUI.closeBrowser()

