package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SignUpScreen extends BaseScreen{
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.ScrollView\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\").description(\"button-sign-up-container\"))")
    protected WebElement signUpSection;
    public SignUpScreen(AndroidDriver driver) {
        super(driver);
    }

    public void navigateSignUpSection() {
        signUpSection.click();
    }




}
