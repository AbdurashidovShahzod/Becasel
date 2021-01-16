package uz.unzosoft.fastfoodbecasel.extentions

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import uz.unzosoft.fastfoodbecasel.R

fun AppCompatActivity.replaceFragment(fragment: Fragment) {
    val fragmentManager = supportFragmentManager
    val transaction = fragmentManager.beginTransaction()
    transaction.replace(R.id.container, fragment)
    transaction.addToBackStack(fragment.toString())
    transaction.commit()
}