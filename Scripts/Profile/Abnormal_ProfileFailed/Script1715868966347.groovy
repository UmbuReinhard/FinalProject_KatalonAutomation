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

//-------------------------Setting Param---------------------------------
String Email = findTestData(pathData).getValue('Email', 1)

String Password = findTestData(pathData).getValue('Password', 1)

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
WebUI.setText(findTestObject('Object Repository/Login/input__email'), Email)

WebUI.setEncryptedText(findTestObject('Object Repository/Login/input__password'), Password)

WebUI.click(findTestObject('Object Repository/Login/button_Masuk'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/alert_Login user successfully'), 0)

WebUI.delay(2)

WebUI.takeScreenshot()

//--------------------------------Info_Profile---------------------------------
WebUI.click(findTestObject('Object Repository/Login/button_Open menu'))

WebUI.click(findTestObject('Object Repository/Login/button_Reinhard Umbu Ngunjuawang'))

WebUI.click(findTestObject('Object Repository/ProfileUser/a_Akun Saya'))

WebUI.delay(2)

WebUI.takeScreenshot()

//--------------------------------Edit Nama Akun---------------------------------
//------------------------Ambil data dari excell-------------------------
String pathData2 = 'Data Files/Profile/dataProfile'

def countRow = findTestData(pathData).getRowNumbers( //Cek jumlah row dalam Data File
    )

for (int i = 1; i < countRow.toInteger(); i++) {
    String FirstName = findTestData(pathData2).getValue('NamaDepan', i)

    String LastName = findTestData(pathData2).getValue('NamaBelakang', i)

    String Birthdate = findTestData(pathData2).getValue('TglLahir', i)

    String Gender = findTestData(pathData2).getValue('Jenkel', i)

    String Phonenumber = findTestData(pathData2).getValue('NoTelp', i)

    String Province = findTestData(pathData2).getValue('Provinsi', i)

    String City = findTestData(pathData2).getValue('Kota', i)

    String Category = findTestData(pathData2).getValue('Kategori', i)

    String Univ = findTestData(pathData2).getValue('Uni', i)

    String Major = findTestData(pathData2).getValue('Jurusan', i)

    String Gelar = findTestData(pathData2).getValue('Gelar', i)

    WebUI.setText(findTestObject('Object Repository/Profile/input__firstName'), FirstName)

    WebUI.setText(findTestObject('Object Repository/Profile/input__lastName'), LastName)

    WebUI.setText(findTestObject('Object Repository/Profile/input__birthDate'), Birthdate)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Profile/dropdown_Jenkel'), Gender, false)
	

    WebUI.setText(findTestObject('Object Repository/Profile/input__phoneNumber'), Phonenumber)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Profile/dropdown_Provinsi'), Province, false)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Profile/dropdown_PilihKotaKABUPATEN'), City, false)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Profile/select_Kategori'), Category, false)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Profile/select_PilihUniversitas'), Univ, false)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Profile/select_PilihJurusan'), Major, false)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Profile/select_PilihGelar'), Gelar, false)

    WebUI.click(findTestObject('Object Repository/Profile/button_SimpanProfile'))

    WebUI.delay(2)

    WebUI.takeFullPageScreenshot()
	
	if (LastName.isEmpty()) {
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/Profile/alert_lastName'), 0)) {
			'Hasil Capture ketika Parameter Nama Belakang Tidak Di-input'
			WebUI.delay(2)
			WebUI.takeScreenshot()
			WebUI.refresh()
		}
	}
	if (Phonenumber.isEmpty()) {
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/Profile/alert_phoneNumber'), 0)) {
			'Hasil Capture ketika Parameter No Telp Tidak Di-input'
			WebUI.delay(2)
			WebUI.takeScreenshot()
			WebUI.refresh()
		}
	}	
}
WebUI.closeBrowser()
