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
    RecyclerView.Adapter<CategoriesAdapter.AsiaFoodViewHolder>() {
    var asiaFoodList: List<LoookFood> = asiaFoodList
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AsiaFoodViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.asia_food_row_item, parent, false)
        return CategoriesAdapter.AsiaFoodViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: CategoriesAdapter.AsiaFoodViewHolder,
        position: Int
    ) {
        holder.foodImage.setImageResource(asiaFoodList[position].imageUrl)
        holder.name.text=(asiaFoodList[position].name)
        holder.price.text=(asiaFoodList[position].price)
        holder.rating.text=(asiaFoodList[position].rating)
        holder.restaurantName.text = asiaFoodList[position].restorantname
    }

    override fun getItemCount(): Int {
        return asiaFoodList.size
    }

    class AsiaFoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var foodImage: ImageView = itemView.findViewById(R.id.food_image)
        var price: TextView = itemView.findViewById(R.id.price)
        var name: TextView = itemView.findViewById(R.id.name)
        var rating: TextView = itemView.findViewById(R.id.rating)
        var restaurantName: TextView = itemView.findViewById(R.id.restorant_name)

    }

}
