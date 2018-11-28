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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import javax.security.auth.login.FailedLoginException as FailedLoginException
import javax.xml.xpath.XPath as XPath
import java.util.Hashtable.ValueCollection as ValueCollection

Mobile.startApplication('D:\\Hogar Pro v-1.0.2.apk', false)

Mobile.delay(5)

def location = new TestObject()

location.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]')

def location_text = Mobile.getText(location, 0, FailureHandling.OPTIONAL)

println(location_text)

if (location_text == 'Allow Hogar Pro to access this device\'s location?') {
    Mobile.tap(findTestObject('Object Repository/hc/0.2-Allow location'), 0)
}

def skip = new TestObject()

skip.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]')

def skip_text = Mobile.getText(skip, 0, FailureHandling.OPTIONAL)

println(skip_text)

if (skip_text == 'Skip') {
    Mobile.tap(findTestObject('Object Repository/hc/Skip btn-1'), 0)
}

def login = new TestObject()

login.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[7]/android.widget.TextView[1]')

def login_text = Mobile.getText(login, 0, FailureHandling.OPTIONAL)

println(login_text)

WebUI.acceptAlert()

