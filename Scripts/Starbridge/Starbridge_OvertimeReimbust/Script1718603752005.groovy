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

WebUI.callTestCase(findTestCase('Starbridge/LoginStarbridge'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://starbridges.indocyber.co.id/Application/MainMenu/IndexCalendar')

WebUI.click(findTestObject('Object Repository/Page_Starbridges - Main Menu/a_Component'))

WebUI.click(findTestObject('Object Repository/Page_Starbridges - Main Menu/a_Personal Reimbursement'))

WebUI.click(findTestObject('Object Repository/Page_Starbridges - Main Menu/i_Add New_fa fa-plus'))

WebUI.setText(findTestObject('Object Repository/Page_Starbridges - Main Menu/textarea_Description_Description'), 'Klaim Lembur pada XL AXIATA bulan Mei')

WebUI.click(findTestObject('Page_Starbridges - Main Menu/input_FieldAmount'))

int newValue = 1000000
String jsScript = "arguments[0].setAttribute('aria-valuenow', '" + newValue + "')"
Windows.executeJavaScript(jsScript, Arrays.asList(Windows.findWebElement(findTestObject('Page_Starbridges - Main Menu/input_Amount_Amount'))))

//WebUI.setText(findTestObject('Page_Starbridges - Main Menu/input_Amount_Amount'), '1000000')

