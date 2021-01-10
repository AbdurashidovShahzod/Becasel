package uz.unzosoft.fastfoodbecasel.ui.onboarding

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_on_boarding3.*
import kotlinx.android.synthetic.main.fragment_on_boarding3.view.*
import uz.unzosoft.fastfoodbecasel.MainActivity
import uz.unzosoft.fastfoodbecasel.R

@Suppress("UNREACHABLE_CODE")
class Fragment3 : Fragment(R.layout.fragment_on_boarding3) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        skip.setOnClickListener {
            startActivity(Intent(this.context, MainActivity::class.java))
            Toast.makeText(this.context, "Create", Toast.LENGTH_SHORT).show()
        }
    }

    fun v(v: View) {
        skip.setOnClickListener {
            startActivity(Intent(this.context, MainActivity::class.java))
            Toast.makeText(this.context, "Create", Toast.LENGTH_SHORT).show()
        }
    }
}