package uz.unzosoft.fastfoodbecasel.ui.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class FragmentAdapter(activity: FragmentManager) : FragmentStatePagerAdapter(activity) {
    override fun getCount() = 3

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return Fragment1()
            1 -> return Fragment2()
            2 -> return Fragment3()

        }
        return Fragment1()
    }
}