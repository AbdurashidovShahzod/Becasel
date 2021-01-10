package uz.unzosoft.fastfoodbecasel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import uz.unzosoft.fastfoodbecasel.adapters.FoodAdapter
import uz.unzosoft.fastfoodbecasel.adapters.AsiaFoodAdapter
import uz.unzosoft.fastfoodbecasel.ui.SeconFoodActivity
import uz.unzosoft.fastfoodbecasel.ui.model.AsiaFood
import uz.unzosoft.fastfoodbecasel.ui.model.PopularFood

class MainActivity : AppCompatActivity() {
    lateinit var asiaFoodAdapter: AsiaFoodAdapter
    lateinit var foodAdapter: FoodAdapter
    var listFood = ArrayList<AsiaFood>()
    var listPopular = ArrayList<PopularFood>()

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()

        asiaFoodAdapter = AsiaFoodAdapter(this, listFood)
        foodAdapter = FoodAdapter(this, listPopular)
        popular_recycler.adapter = foodAdapter
        asia_recycler.adapter = asiaFoodAdapter
        textAll.setOnClickListener {
            startActivity(Intent(this, SeconFoodActivity::class.java))
        }
    }

    private fun initData() {
        listFood.add(AsiaFood("BIGGER", "16 000 UZS", R.drawable.a1, "5.0", "Becausel"))
        listFood.add(AsiaFood("CLASSIC", "12 000 UZS", R.drawable.classic, "5.0", "Becausel"))
        listFood.add(
            AsiaFood(
                "CHEESEBURGER",
                "24 000 UZS",
                R.drawable.chesbirger,
                "4.8",
                "Becausel"
            )
        )
        listFood.add(
            AsiaFood(
                "CHILI LONGER",
                "21 000 UZS",
                R.drawable.chililonger,
                "5.0",
                "Becausel"
            )
        )
        listFood.add(
            AsiaFood(
                "LOOOK", "14 000 UZS", R.drawable.look, "4.5", "Becausel"
            )
        )
        listFood.add(
            AsiaFood(
                "CHICKEN LONGER",
                "14 000 UZS",
                R.drawable.chickenloger,
                "3.8",
                "Becausel"
            )
        )
        listFood.add(
            AsiaFood(
                "HAMBURGER",
                "21 000 UZS", R.drawable.humbergers, "4.6", "Becausel"
            )
        )
        listFood.add(
            AsiaFood(
                "DOUBLECHEESE BURGER",
                "34 000 UZS",
                R.drawable.doubleches,
                "4.7",
                "Becausel"
            )
        )
        listFood.add(
            AsiaFood(
                "BEEF LONGER",
                "21 000 UZS",
                R.drawable.beeflonger,
                "3.8",
                "Becausel"
            )
        )
        listFood.add(
            AsiaFood(
                "CRISPY BURGER",
                "15 000 UZS",
                R.drawable.cripsy,
                "2.9",
                "Becausel"
            )
        )
        listFood.add(
            AsiaFood(
                "BOSS BURGER",
                "34 000 UZS",
                R.drawable.bossburger,
                "3.9",
                "Becausel"
            )
        )



        listPopular.add(PopularFood("Chicken", "", R.drawable.chicken))
        listPopular.add(PopularFood("Burgers", "", R.drawable.bossburger))
        listPopular.add(PopularFood("Spinners", "", R.drawable.spinner))
        listPopular.add(PopularFood("Pizza", "", R.drawable.hawaiian))
        listPopular.add(PopularFood("Drinks", "", R.drawable.drinks))
        listPopular.add(PopularFood("Appertizers and Combo", "", R.drawable.appr))
        listPopular.add(PopularFood("Deserts", "", R.drawable.deserts))
        listPopular.add(PopularFood("Other", "", R.drawable.other))
        listPopular.add(PopularFood("Kids", "", R.drawable.kids))
    }
}