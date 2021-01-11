package uz.unzosoft.fastfoodbecasel.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.unzosoft.fastfoodbecasel.R
import uz.unzosoft.fastfoodbecasel.ui.SeconFoodActivity
import uz.unzosoft.fastfoodbecasel.ui.model.CategoriesFood


class FoodAdapter(var context: Context, popularFoodList: List<CategoriesFood>) :
    RecyclerView.Adapter<FoodAdapter.PopularFoodViewHolder>() {
    var popularFoodList: List<CategoriesFood> = popularFoodList
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularFoodViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.popular_food_row_item, parent, false)
        return PopularFoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: PopularFoodViewHolder, position: Int) {
        holder.foodImage.setImageResource(popularFoodList[position].imageUrl)
        holder.name.text = popularFoodList[position].name
        holder.price.text = popularFoodList[position].price
        holder.itemView.setOnClickListener {
            val i = Intent(context, SeconFoodActivity::class.java)
            context.startActivity(i)
        }
    }

    override fun getItemCount(): Int {
        return popularFoodList.size
    }

    class PopularFoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var foodImage: ImageView = itemView.findViewById(R.id.food_image)
        var price: TextView = itemView.findViewById(R.id.price)
        var name: TextView = itemView.findViewById(R.id.name)

    }

}