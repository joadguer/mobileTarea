package org.example.screens;

import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginScreen extends BaseScreen{
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.ScrollView\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\").description(\"button-sign-up-container\"))")
    protected WebElement signUpSection;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.ScrollView\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\").description(\"button-login-container\"))")
    protected WebElement loginSection;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.ScrollView\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.EditText\").description(\"input-email\"))")
    protected WebElement signUpName;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.ScrollView\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.EditText\").description(\"input-password\"))")
    protected WebElement signUpPassword;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.ScrollView\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.EditText\").description(\"input-repeat-password\"))")
    protected WebElement signUpConfirmPass;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.ScrollView\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\").description(\"button-SIGN UP\"))")
    protected WebElement signUpButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\n\")")
    protected WebElement sectionOk;

    // mio
//    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\n\").childSelector(new UiSelector().resourceId(\"android:id/parentPanel\")).childSelector(new UiSelector().resourceId(\"android:id/topPanel\")).childSelector(new UiSelector().resourceId(\"android:id/contentPanel\")).childSelector(new UiSelector().resourceId(\"android:id/buttonPanel\")).childSelector(new UiSelector().className(\"android.widget.LinearLayout\").resourceId(\"android:id/button1\"))")
//    protected WebElement okButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\").childSelector(new UiSelector().resourceId(\"android:id/parentPanel\")).childSelector(new UiSelector().resourceId(\"android:id/topPanel\")).childSelector(new UiSelector().resourceId(\"android:id/contentPanel\")).childSelector(new UiSelector().resourceId(\"android:id/buttonPanel\")).childSelector(new UiSelector().className(\"android.widget.Button\").text(\"OK\"))")
    protected WebElement okButton;

    public void navigateSignUpSection() {
        signUpSection.click();
    }

    public void navigateLoginSection() {
        loginSection.click();
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\").childSelector(new UiSelector().resourceId(\"android:id/parentPanel\")).childSelector(new UiSelector().resourceId(\"android:id/topPanel\")).childSelector(new UiSelector().resourceId(\"android:id/contentPanel\"))")
    protected WebElement dialog;

    public void switchToDialog() {
        int count = 0;
        while (count < 5) {
            try {
                dialog.sendKeys(Keys.TAB);
                count++;
            } catch (ElementNotInteractableException e) {
                break;
            }
        }
    }
    public void signingUp(){
        signUpName.sendKeys("jj@gmail.com");
        signUpPassword.sendKeys("mipassword");
        signUpConfirmPass.sendKeys("mipassword");
        signUpButton.click();
//
//        AppiumFluentWait<AndroidDriver> wait = (AppiumFluentWait<AndroidDriver>) new AppiumFluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10)) // Espera hasta 10 segundos
//                .pollingEvery(Duration.ofMillis(500)) // Verifica cada 500 milisegundos
//                .ignoring(Exception.class); // Ignora excepciones
//        wait.until(ExpectedConditions.visibilityOf(okButton));

        switchToDialog();
        okButton.click();
    }


    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }
}
