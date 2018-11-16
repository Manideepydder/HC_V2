import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject

import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import javax.security.auth.login.FailedLoginException as FailedLoginException
import javax.xml.xpath.XPath as XPath
import java.util.Hashtable.ValueCollection as ValueCollection


try {
	
				Mobile.setText(findTestObject('Object Repository/HC_V2_1/Login/Enter text - email'), 'hogarhello@gmail.com', 1)
		
				Mobile.setText(findTestObject('Object Repository/HC_V2_1/Login/enter text - password'), '987654321', 2)
		
				Mobile.tap(findTestObject('Object Repository/HC_V2_1/Login/Text - Login'), 0)
}
catch (exception e)
{
	//
}