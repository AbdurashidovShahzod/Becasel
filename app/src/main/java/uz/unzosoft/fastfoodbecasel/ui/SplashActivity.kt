package uz.unzosoft.fastfoodbecasel.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*
import uz.unzosoft.fastfoodbecasel.R

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    var animationSplash: Animation? = null
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        animationSplash = AnimationUtils.loadAnimation(this, R.anim.splash_anim)
        splashImage.animation = animationSplash
        handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this, IntroductoryActivity::class.java))
            finish()
        }, 4000)
    }
}