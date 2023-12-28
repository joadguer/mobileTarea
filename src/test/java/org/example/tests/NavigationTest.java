package org.example.tests;

import org.example.screens.*;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest{

    @Test
    public void changeMenuOption(){
        // Start from the HomeScreen
        HomeScreen homeScreen = returnHomeScreen();

        // Navigate to WebScreen
        WebScreen webScreen = homeScreen.navigateToWebScreen();
        // Perform actions/assertions for WebScreen

        // Navigate to LoginScreen
        LoginScreen loginScreen = webScreen.navigateToLoginScreen();
        // Perform actions/assertions for LoginScreen

        // Navigate to FormScreen
        FormScreen formScreen = loginScreen.navigateToFormScreen();
        // Perform actions/assertions for FormScreen

        // Navigate to SwipeScreen
        SwipeScreen swipeScreen = formScreen.navigateToSwipeScreen();
        // Perform actions/assertions for SwipeScreen

        // Navigate to DragScreen
        DragScreen dragScreen = swipeScreen.navigateToDragScreen();
        // Perform actions/assertions for DragScreen
        //regresa al menu principal
        HomeScreen returnHome = dragScreen.navigateToHomeScreen();

    }





}
