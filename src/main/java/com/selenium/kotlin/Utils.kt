package com.selenium.kotlin

import java.io.FileInputStream
import java.io.IOException
import java.util.*

object Utils {
    private var properties: Properties? = null

    private fun loadProperties(): Unit {
        try {
            properties = Properties()
            properties?.load(FileInputStream("config.properties"))
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun getProperties(properties: String): String {
        loadProperties()
        return Utils.properties?.getProperty(properties).toString()
    }
}