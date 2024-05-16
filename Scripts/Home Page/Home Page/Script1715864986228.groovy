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

// Buka Page
WebUI.openBrowser('')

WebUI.navigateToUrl('https://metrodataacademy.id/')

WebUI.delay(2)

WebUI.takeScreenshot()

//Login

WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/svg_Open menu_w-6 h-6 text-white'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/input__email'), 'wisma.kurnia@ms.mii.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/input__password'), '6Vl+jaOc5RfTCe1KgSC8DI9bVHJNi6QT')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/button_Masuk'))

// Masuk Homepage

WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/span_Lihat Program'))

WebUI.delay(2)

WebUI.takeScreenshot()

// Detail Program

WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/span_Detail'))

WebUI.delay(2)

WebUI.takeScreenshot()

// View Schedule

WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/button_View All'))

WebUI.delay(2)

WebUI.takeScreenshot()

// View perDay

WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/svg_Next week_w-5 h-5'))
WebUI.delay(2)

WebUI.takeScreenshot()


WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/svg_Next week_w-5 h-5'))
WebUI.delay(2)

WebUI.takeScreenshot()


WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/svg_Next week_w-5 h-5'))
WebUI.delay(2)

WebUI.takeScreenshot()


WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/svg_Next week_w-5 h-5'))
WebUI.delay(2)

WebUI.takeScreenshot()


WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/svg_Next week_w-5 h-5'))
WebUI.delay(2)

WebUI.takeScreenshot()


WebUI.doubleClick(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/svg_Previous week_w-5 h-5'))
WebUI.delay(2)

WebUI.takeScreenshot()


WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/svg_Previous week_w-5 h-5'))

WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/svg_Previous week_w-5 h-5'))

WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/svg_Previous week_w-5 h-5'))

WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/svg_Previous week_w-5 h-5'))

WebUI.click(findTestObject('Object Repository/HomePage/Page_Metrodata Academy/a_Pelajari Metrodata Training'))

WebUI.delay(2)

WebUI.takeScreenshot()


WebUI.closeBrowser()

