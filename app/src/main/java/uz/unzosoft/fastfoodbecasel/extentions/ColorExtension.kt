package uz.unzosoft.fastfoodbecasel.extentions

import android.graphics.Color

fun Int.toDarkenColor():Int{
    val hsv=FloatArray(3)
    Color.colorToHSV(this,hsv)
    hsv[2]*=0.8f
    return Color.HSVToColor(hsv)
}
fun Int.toLightColor():Int{
    val hsv=FloatArray(3)
    Color.colorToHSV(this,hsv)
    hsv[1]*=0.5f
    return Color.HSVToColor(hsv)
}