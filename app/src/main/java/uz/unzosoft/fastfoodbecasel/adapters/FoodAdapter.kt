package uz.unzosoft.fastfoodbecasel.adapters

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.unzosoft.fastfoodbecasel.R
import uz.unzosoft.fastfoodbecasel.extentions.SingleBlock
import uz.unzosoft.fastfoodbecasel.ui.model.CategoriesFood


class FoodAdapter(private var context: Context, private var popularFoodList: List<CategoriesFood>) :
    RecyclerView.Adapter<FoodAdapter.PopularFoodViewHolder>() {
    private var  index=-1
    private var listener: SingleBlock<Int>? = null
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
            index=position
            notifyDataSetChanged()
        }
        holder.item.apply {
            alpha = if(index==position){
                setBackgroundColor(Color.parseColor("#FF6200EE"))
                0.2F
            }else{setBackgroundColor(Color.parseColor("#FFFfff"))
                0F

            }
        }
        listener?.invoke(position)
    }

    override fun getItemCount(): Int {
        return popularFoodList.size
    }
    fun setOnClickListener(block: SingleBlock<Int>) {
        notifyDataSetChanged()
        listener = block
    }

    class PopularFoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var foodImage: ImageView = itemView.findViewById(R.id.food_image)
        var price: TextView = itemView.findViewById(R.id.price)
        var name: TextView = itemView.findViewById(R.id.name)
        var item:FrameLayout=itemView.findViewById(R.id.itemSelect)

    }

}