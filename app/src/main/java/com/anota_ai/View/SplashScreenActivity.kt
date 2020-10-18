package com.anota_ai.View

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.anota_ai.R
import com.anota_ai.Control.LoginActivity


class SplashScreenActivity : AppCompatActivity() {
    /* Timer Splash Screen */
    private val SPLASH_TIME_OUT = 5000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Handler(Looper.getMainLooper()).postDelayed(
            {

                val intent = Intent(this@SplashScreenActivity, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }, 3000
        )

    }
}