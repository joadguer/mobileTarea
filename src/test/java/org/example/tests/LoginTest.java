package org.example.tests;

import org.example.screens.HomeScreen;
import org.example.screens.LoginScreen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    LoginScreen loginScreen;
    @BeforeMethod
    public void signingUpAndGoLogin() {
        HomeScreen homeScreen = returnHomeScreen();
        LoginScreen login = homeScreen.navigateToLoginScreen();
        this.loginScreen = login;
        loginScreen.navigateSignUpSection();
        loginScreen.signingUp();
    }

    @Test
    public void login(){
        loginScreen.navigateLoginSection();
    }


}
