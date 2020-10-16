package com.anota_ai.View

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.anota_ai.R


class SplashScreenActivity : AppCompatActivity()
{
    /* Timer Splash Screen */
    private val SPLASH_TIME_OUT = 5000;

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler().postDelayed(Runnable
        /* THis method will run right after the execution of the splash finish */
        { /* The Main Activity will be started */
            val intent = Intent(this@SplashScreenActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT.toLong()
        )
    }
}