package uz.unzosoft.fastfoodbecasel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import uz.unzosoft.fastfoodbecasel.R
import uz.unzosoft.fastfoodbecasel.ui.onboarding.FragmentAdapter

class IntroductoryActivity : AppCompatActivity() {
    private var pagerAdapter = FragmentAdapter(supportFragmentManager)
    private lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introductory)
        viewPager = findViewById(R.id.pager)
        viewPager.adapter = pagerAdapter
    }
}