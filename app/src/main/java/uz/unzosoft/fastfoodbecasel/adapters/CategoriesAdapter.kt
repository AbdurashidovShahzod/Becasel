package uz.unzosoft.fastfoodbecasel.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.unzosoft.fastfoodbecasel.R
import uz.unzosoft.fastfoodbecasel.model.LoookFood

class CategoriesAdapter(var context: Context, var asiaFoodList: List<LoookFood>) :
    RecyclerView.Adapter<CategoriesAdapter.CategoriesFood>() {
    var categoriesList: List<LoookFood> = asiaFoodList
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriesFood {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.food_item, parent, false)
        return CategoriesFood(view)
    }

    override fun onBindViewHolder(
        holder: CategoriesFood,
        position: Int
    ) {
        holder.foodImage.setImageResource(categoriesList[position].imageUrl)
        holder.name.text = (categoriesList[position].name)
        holder.price.text = (categoriesList[position].price)
        holder.rating.text = (categoriesList[position].rating)
        holder.restaurantName.text = categoriesList[position].restorantname
        holder.onBind(asiaFoodList[position])
    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }

    inner class CategoriesFood(var itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(loookFood: LoookFood) {
            itemView.animation = AnimationUtils.loadAnimation(context, R.anim.anim_rv_item)
        }

        var foodImage: ImageView = itemView.findViewById(R.id.food_image)
        var price: TextView = itemView.findViewById(R.id.price)
        var name: TextView = itemView.findViewById(R.id.name)
        var rating: TextView = itemView.findViewById(R.id.rating)
        var restaurantName: TextView = itemView.findViewById(R.id.restorant_name)
    }

}
