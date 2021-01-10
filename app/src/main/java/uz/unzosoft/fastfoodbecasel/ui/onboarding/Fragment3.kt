package uz.unzosoft.fastfoodbecasel.ui.onboarding

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_on_boarding3.*
import uz.unzosoft.fastfoodbecasel.MainActivity
import uz.unzosoft.fastfoodbecasel.R

@Suppress("UNREACHABLE_CODE")
class Fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_on_boarding3, container, false)
        skip.setOnClickListener {
            startActivity(Intent(this.context, MainActivity::class.java))
            Toast.makeText(this.context, "Click!!!", Toast.LENGTH_SHORT).show()
        }
    }
}