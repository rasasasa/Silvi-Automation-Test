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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication('com.cashir.app')

Mobile.tap(findTestObject('Login/android.widget.Button0 - Masuk'), 0)

Mobile.tap(findTestObject('Login/android.widget.RelativeLayout0'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditText0 - Contoh 0857192919'), '85742231430', 0)

Mobile.tap(findTestObject('Login/android.widget.Button0 - Lanjut'), 0)

Mobile.tap(findTestObject('Login/android.widget.Button0 - Kirim'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - 1'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - 2'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - 3'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - 4'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - 5'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView0 - 6'), 0)

Mobile.verifyElementExist(findTestObject('Register/android.widget.RelativeLayout0 (1)'), 0)

Mobile.closeApplication()

