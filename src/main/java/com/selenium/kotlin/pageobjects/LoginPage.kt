package com.selenium.kotlin.pageobjects

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class LoginPage(private val driver: WebDriver) {

    @FindBy(id = "username")
    private val usernameTextBox: WebElement? = null

    @FindBy(id = "password")
    private val passwordTextBox: WebElement? = null

    @FindBy(className = "radius")
    private val loginBtn: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun userLogin(username: String, password: String) {
        usernameTextBox?.clear()
        usernameTextBox?.sendKeys(username)
        passwordTextBox?.clear()
        passwordTextBox?.sendKeys(password)
        loginBtn?.click()
    }
}