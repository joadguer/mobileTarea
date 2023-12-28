package org.example.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BaseScreen {


    //version 1
//    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).instance(0)).childSelector(new UiSelector().className(\"android.widget.Button\").description(\"Home\"))")
//    protected WebElement homeButton;
//
//    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).instance(0)).childSelector(new UiSelector().className(\"android.widget.Button\").description(\"Webview\"))")
//    protected WebElement webButton;
//
//    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).instance(0)).childSelector(new UiSelector().className(\"android.widget.Button\").description(\"Login\"))")
//    protected WebElement loginButton;
//
//    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).instance(0)).childSelector(new UiSelector().className(\"android.widget.Button\").description(\"Forms\"))")
//    protected WebElement formsButton;
//
//    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).instance(0)).childSelector(new UiSelector().className(\"android.widget.Button\").description(\"Swipe\"))")
//    protected WebElement swipeButton;
//
//    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).instance(0)).childSelector(new UiSelector().className(\"android.widget.Button\").description(\"Drag\"))")
//    protected WebElement dragButton;



    // -----Version 2
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.Button\").description(\"Home\"))")
    protected WebElement homeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.Button\").description(\"Webview\"))")
    protected WebElement webButton;



    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.Button\").description(\"Login\"))")
    protected WebElement loginButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.Button\").description(\"Forms\"))")
    protected WebElement formsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.Button\").description(\"Swipe\"))")
    protected WebElement swipeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.wdiodemoapp:id/action_bar_root\").childSelector(new UiSelector().resourceId(\"android:id/content\")).childSelector(new UiSelector().className(\"android.widget.FrameLayout\")).childSelector(new UiSelector().className(\"android.view.ViewGroup\")).childSelector(new UiSelector().className(\"android.widget.Button\").description(\"Drag\"))")
    protected WebElement dragButton;




    protected AndroidDriver driver;

    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public HomeScreen navigateToHomeScreen() {
        homeButton.click();
        return new HomeScreen(driver);
    }

    public WebScreen navigateToWebScreen() {
        webButton.click();
        return new WebScreen(driver);
    }

    public LoginScreen navigateToLoginScreen() {
        loginButton.click();
        return new LoginScreen(driver);
    }

    public FormScreen navigateToFormScreen() {
        formsButton.click();
        return new FormScreen(driver);
    }

    public SwipeScreen navigateToSwipeScreen() {
        swipeButton.click();
        return new SwipeScreen(driver);
    }

    public DragScreen navigateToDragScreen() {
        dragButton.click();
        return new DragScreen(driver);
    }

}

