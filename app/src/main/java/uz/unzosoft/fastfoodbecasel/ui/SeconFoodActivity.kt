package uz.unzosoft.fastfoodbecasel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_secon_food.*
import uz.unzosoft.fastfoodbecasel.R

class SeconFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secon_food)
        backBtnFood.setOnClickListener {
            finish()
        }
    }
}