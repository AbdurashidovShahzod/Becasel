package uz.unzosoft.fastfoodbecasel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.unzosoft.fastfoodbecasel.R
import uz.unzosoft.fastfoodbecasel.extentions.addFragment
import uz.unzosoft.fastfoodbecasel.ui.onboarding.FastFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        val fastFragment = FastFragment()
        addFragment(fastFragment)
    }
}