package com.example.deeplinkexample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.net.URLEncoder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val phoneNumber = "0821111111"

        val text = "Halo, Jangan lupa untuk melakukan pembayaran langsung di temapt sebesar 50.000 ya, terima kasih"

        val textEncoded = URLEncoder.encode(text, "UTF-8")

        val uri = Uri.parse("wisnu://awesome?phone=$phoneNumber&text=$textEncoded")

        val intent = Intent(Intent.ACTION_VIEW, uri)

//        startActivity(intent)
    }
}
