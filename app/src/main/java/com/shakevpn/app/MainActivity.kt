package com.shakevpn.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(28, 32, 28, 32)
            setBackgroundColor(Color.rgb(245, 248, 255))
        }

        val title = TextView(this).apply {
            text = "SHAKE VPN"
            textSize = 30f
            setTextColor(Color.rgb(30, 70, 150))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Secure connection, simple life"
            textSize = 15f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
        }

        val serverTitle = TextView(this).apply {
            text = "Choose your server"
            textSize = 18f
            setTextColor(Color.BLACK)
            gravity = Gravity.CENTER
            setPadding(0, 35, 0, 12)
        }

        val servers = arrayOf(
            "Bangladesh",
            "United Kingdom",
            "United States",
            "Germany"
        )

        val serverPicker = Spinner(this)
        serverPicker.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            servers
        )

        val connectButton = Button(this).apply {
            text = "CONNECT"
            textSize = 18f
            setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "VPN server connection is not configured yet.",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        root.addView(title)
        root.addView(subtitle)
        root.addView(serverTitle)
        root.addView(serverPicker)
        root.addView(connectButton)

        setContentView(root)
    }
}
