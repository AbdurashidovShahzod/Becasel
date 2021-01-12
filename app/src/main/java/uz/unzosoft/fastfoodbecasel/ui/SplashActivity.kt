package uz.unzosoft.fastfoodbecasel.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*
import uz.unzosoft.fastfoodbecasel.MainActivity
import uz.unzosoft.fastfoodbecasel.R
import uz.unzosoft.fastfoodbecasel.data.MySharedPreference

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    var animationSplash: Animation? = null
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MySharedPreference.init(this)
        setContentView(R.layout.activity_splash)
        animationSplash = AnimationUtils.loadAnimation(this, R.anim.splash_anim)
        splashImage.animation = animationSplash



        handler = Handler()
        handler.postDelayed({

            if (MySharedPreference.onBoard == false) {
                MySharedPreference.onBoard = true
                startActivity(Intent(this, IntroductoryActivity::class.java))
                finish()
            } else {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }

        }, 4000)
    }
}