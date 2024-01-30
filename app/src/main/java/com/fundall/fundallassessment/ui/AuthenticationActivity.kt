package com.fundall.fundallassessment.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fundall.fundallassessment.MainActivity
import com.fundall.fundallassessment.R
import com.fundall.fundallassessment.utils.EncryptedPrefsUtils
import com.fundall.fundallassessment.utils.PREF_USER

class AuthenticationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_FundallAssessment)
        super.onCreate(savedInstanceState)

        if (EncryptedPrefsUtils.getString(this, PREF_USER).isNullOrEmpty()) {
            setContentView(R.layout.activity_authentication)
        } else {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}