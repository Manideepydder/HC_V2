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

Mobile.startApplication('C:\\Users\\manid\\Downloads\\Hogar Pro v-1.0.2.apk', false // true = uninstall and installs app
    )

Mobile.delay(10)



def text_location = new TestObject()

text_location.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]')

def loc_text = Mobile.getText(text_location, 0, FailureHandling.OPTIONAL)

println(loc_text)

def exp_loc_text = 'Allow Hogar Pro to access this device\'s location?'

if (loc_text == exp_loc_text) {
    Mobile.tap(findTestObject('Object Repository/HC_V2_1/Location/Button - Allow'), 0, FailureHandling.OPTIONAL)
}



def skiptext = new TestObject()

skiptext.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]')

def textSkip = Mobile.getText(skiptext, 0, FailureHandling.OPTIONAL)

println(textSkip)

if (textSkip == 'Skip') {
    Mobile.delay(3)

    Mobile.tap(findTestObject('Object Repository/HC_V2_1/Skip/Text - Skip'), 0, FailureHandling.OPTIONAL)
}



def logintxt = new TestObject()

logintxt.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[7]/android.widget.TextView[1]')

def txtlogin = Mobile.getText(logintxt, 0, FailureHandling.OPTIONAL)

println(txtlogin)

if (txtlogin == ' Login ') {
    Mobile.setText(findTestObject('Object Repository/HC_V2_1/Login/Enter text - email'), 'hogarhello@gmail.com', 1)

    Mobile.setText(findTestObject('Object Repository/HC_V2_1/Login/enter text - password'), '987654321', 2)

    Mobile.tap(findTestObject('Object Repository/HC_V2_1/Login/Text - Login'), 0)
}



////Select HC
def selecthc = new TestObject()

selecthc.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.TextView[1]')

def textme = Mobile.getText(selecthc, 0, FailureHandling.OPTIONAL)

println(textme)

if (textme == 'HC list') {
    Mobile.tap(findTestObject('Object Repository/HC_V2_1/Select HC/New Folder/1.android.view.ViewGroup15'), 0)
}

// Accessing devices
def gotoroom = new TestObject()

gotoroom.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[6]')

def textgotoroom = Mobile.getText(gotoroom, 0, FailureHandling.OPTIONAL)

println(textgotoroom)

if (textgotoroom == 'Favorite scenes') {
    Mobile.tap(findTestObject('Object Repository/HC_V2_1/Home - Devices/gotoroom/1.android.view.ViewGroup37'), 0)

    Mobile.tap(findTestObject('Object Repository/HC_V2_1/Home - Devices/selecting room/1.android.view.ViewGroup23'), 0)

    Mobile.tap(findTestObject('Object Repository/HC_V2_1/Home - Devices/select Device/1.android.view.ViewGroup26'), 0)
}

