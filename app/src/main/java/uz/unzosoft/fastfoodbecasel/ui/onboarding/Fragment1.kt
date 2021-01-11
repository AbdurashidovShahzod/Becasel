package uz.unzosoft.fastfoodbecasel.ui.onboarding

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.unzosoft.fastfoodbecasel.R
import uz.unzosoft.fastfoodbecasel.extentions.toDarkenColor

@Suppress("UNREACHABLE_CODE")
class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_on_boarding1, container, false)

        activity?.window?.statusBarColor = Color.parseColor("#F5446C")
            .toDarkenColor()

//        activity!!.window.setFlags(
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//        )
    }
}