package com.selenium.kotlin

import org.testng.Assert
import org.testng.annotations.Test

class UserLoginTest() : TestBase() {

    @Test
    fun userLogin() {
        val loginPage = LoginPage(driver)
        loginPage.userLogin(Utils.getProperties("username"), Utils.getProperties("password"))
        val securePage = SecurePage(driver)
        Assert.assertTrue(securePage.isPageOpened())
        securePage.logout()
    }
}
