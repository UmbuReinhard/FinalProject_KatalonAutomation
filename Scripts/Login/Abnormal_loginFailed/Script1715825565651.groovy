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

//-----------------------------------------------------------------------
//------------------------Ambil data dari excell-------------------------
String pathData = 'Data Files/Login/userAccount'

def countRow = findTestData(pathData).getRowNumbers( //Cek jumlah row dalam Data File
    )

//--------------------------Open Webpage---------------------------------
WebUI.openBrowser('')

WebUI.navigateToUrl('https://metrodataacademy.id/')

WebUI.delay(2)

'Berhasil Membuka Halaman Website Metrodata Academy\r\n'
WebUI.takeScreenshot()

//-----------------------------Login Page--------------------------------
WebUI.click(findTestObject('Object Repository/Login/button_Open menu'))

WebUI.click(findTestObject('Object Repository/Login/a_Masuk'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/h1_Selamat Datang'), 0)

WebUI.delay(2)

WebUI.takeScreenshot()

//-----------------------------Input Param Login-------------------------
for (int i = 2; i <= countRow.toInteger(); i++) {
    //-------------------------Setting Param---------------------------------
    String Email = findTestData(pathData).getValue('Email', i)

    String Password = findTestData(pathData).getValue('Password', i)

    WebUI.setText(findTestObject('Object Repository/Login/input__email'), Email)

    //------------------------------Cek Get Value Hasil Perulangan-------------------------
    println((('Email ke-' + i) + ' adalah ') + Email)

    println((('Password ke-' + i) + ' adalah ') + Password)

    WebUI.setEncryptedText(findTestObject('Object Repository/Login/input__password'), Password)

    WebUI.click(findTestObject('Object Repository/Login/button_Masuk'))

    if (Email.isEmpty()) {
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Login/alert_Email')  , 0)) {
	        'Hasil Capture ketika Parameter Email Tidak Di-input'
	        WebUI.delay(2)
		}

        WebUI.takeScreenshot()
    } else if (Password.isEmpty()) {
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Login/alert_password')  , 0)) {
	        'Hasil Capture ketika Parameter PAssword Tidak Di-input'
	        WebUI.delay(2)
		}

        WebUI.takeScreenshot()
    } else if (Email.isEmpty() && Password.isEmpty()) {
		if ( WebUI.verifyElementPresent(findTestObject('Object Repository/Login/alert_Email')  , 0)
			&& WebUI.verifyElementPresent(findTestObject('Object Repository/Login/alert_password')  , 0)) {
			
		        'Hasil Capture ketika Parameter Email Tidak Di-input'
		        WebUI.delay(2)
		        WebUI.takeScreenshot()
			}
    }
}

WebUI.closeBrowser()

