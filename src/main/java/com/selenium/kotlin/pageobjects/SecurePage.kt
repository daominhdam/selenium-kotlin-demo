package com.selenium.kotlin.pageobjects

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class SecurePage(private val driver: WebDriver) {

    @FindBy(className = "icon-lock")
    private val headerTxt: WebElement? = null

    @FindBy(xpath = "//*[@id=\'content\']/div/a")
    private val logoutBtn: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun isPageOpened(): Boolean {
        return driver.currentUrl.toString().contains("secure")
    }

    fun logout() {
        logoutBtn?.click()
    }
}