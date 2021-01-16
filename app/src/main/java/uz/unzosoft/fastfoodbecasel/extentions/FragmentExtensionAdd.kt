package uz.unzosoft.fastfoodbecasel.extentions

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import uz.unzosoft.fastfoodbecasel.R

fun AppCompatActivity.addFragment(fragment: Fragment) {
    val fragmentManager = supportFragmentManager
    val transaction = fragmentManager.beginTransaction()
    transaction.add(R.id.container, fragment)
    transaction.commit()
}