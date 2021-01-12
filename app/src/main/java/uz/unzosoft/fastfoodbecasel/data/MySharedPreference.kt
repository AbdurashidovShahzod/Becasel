package uz.unzosoft.fastfoodbecasel.data

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import uz.unzosoft.fastfoodbecasel.data.MySharedPreference.sharedPreferences

object MySharedPreference {
    private const val NAME = "onboarding"
    private const val MODE = Context.MODE_PRIVATE
    lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.editor(operator: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operator(editor)
        editor.apply()
    }

    var onBoard: Boolean?
        get() = sharedPreferences.getBoolean("on", false)
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                this.putBoolean("on", value)
            }
        }

}