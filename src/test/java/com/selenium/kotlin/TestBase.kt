package com.selenium.kotlin

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import java.net.URI
import java.util.concurrent.TimeUnit

abstract class TestBase {

    lateinit var driver: WebDriver private set

    @BeforeTest
    fun setup() {
        System.setProperty(Utils.getProperties("driverName"),
                Utils.getProperties("driverPath") + Utils.getProperties("driverFile"))
        driver = ChromeDriver()
        driver.manage()?.timeouts()?.implicitlyWait(10, TimeUnit.SECONDS)
        driver.manage()?.window()?.maximize()
        driver.get(URI(Utils.getProperties("pageURL")).toString())
    }

    @AfterTest
    fun teardown() {
        driver.close()
    }
}