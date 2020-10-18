package com.anota_ai.Control

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.anota_ai.Control.RegisterExpenseActivity


class LoginActivity: AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState);
        setContentView(com.anota_ai.R.layout.activity_login);
    }

    fun registerExpensePage(view: View) {
        val intent = Intent(this, RegisterExpenseActivity::class.java);
        startActivity(intent);
    }
}