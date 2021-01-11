package uz.unzosoft.fastfoodbecasel.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.unzosoft.fastfoodbecasel.R
import uz.unzosoft.fastfoodbecasel.ui.model.LoookFood

class CategoriesAdapter(var context: Context, asiaFoodList: List<LoookFood>) :
    RecyclerView.Adapter<CategoriesAdapter.CategoriesFood>() {
    var categoriesList: List<LoookFood> = asiaFoodList
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriesFood {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.asia_food_row_item, parent, false)
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
    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }

    class CategoriesFood(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var foodImage: ImageView = itemView.findViewById(R.id.food_image)
        var price: TextView = itemView.findViewById(R.id.price)
        var name: TextView = itemView.findViewById(R.id.name)
        var rating: TextView = itemView.findViewById(R.id.rating)
        var restaurantName: TextView = itemView.findViewById(R.id.restorant_name)

    }

}
