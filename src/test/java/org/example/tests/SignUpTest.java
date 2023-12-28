package org.example.tests;

import org.example.screens.HomeScreen;
import org.example.screens.LoginScreen;
import org.openqa.selenium.bidi.log.Log;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


    public class SignUpTest extends BaseTest{
        LoginScreen loginScreen;
        @BeforeMethod
        public LoginScreen goLogin() {
            HomeScreen homeScreen = returnHomeScreen();
            LoginScreen login = homeScreen.navigateToLoginScreen();
            this.loginScreen = login;
            return login;
        }

        @Test
        public void signUpOption() {
            loginScreen.navigateSignUpSection();
            loginScreen.signingUp();
        }

}
