package uz.unzosoft.fastfoodbecasel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import uz.unzosoft.fastfoodbecasel.adapters.FoodAdapter
import uz.unzosoft.fastfoodbecasel.adapters.AsiaFoodAdapter
import uz.unzosoft.fastfoodbecasel.ui.SeconFoodActivity
import uz.unzosoft.fastfoodbecasel.ui.model.LoookFood
import uz.unzosoft.fastfoodbecasel.ui.model.CategoriesFood

class MainActivity : AppCompatActivity() {
    lateinit var asiaFoodAdapter: AsiaFoodAdapter
    lateinit var foodAdapter: FoodAdapter
    var listFood = ArrayList<LoookFood>()
    var listPopular = ArrayList<CategoriesFood>()
    var listChicken = ArrayList<LoookFood>()


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
        listFood.add(LoookFood("BIGGER", "16 000 UZS", R.drawable.a1, "5.0", "Becausel"))
        listFood.add(LoookFood("CLASSIC", "12 000 UZS", R.drawable.classic, "5.0", "Becausel"))
        listFood.add(
            LoookFood(
                "CHEESEBURGER",
                "24 000 UZS",
                R.drawable.chesbirger,
                "4.8",
                "Becausel"
            )
        )
        listFood.add(
            LoookFood(
                "CHILI LONGER",
                "21 000 UZS",
                R.drawable.chililonger,
                "5.0",
                "Becausel"
            )
        )
        listFood.add(
            LoookFood(
                "LOOOK", "14 000 UZS", R.drawable.look, "4.5", "Becausel"
            )
        )
        listFood.add(
            LoookFood(
                "CHICKEN LONGER",
                "14 000 UZS",
                R.drawable.chickenloger,
                "3.8",
                "Becausel"
            )
        )
        listFood.add(
            LoookFood(
                "HAMBURGER",
                "21 000 UZS", R.drawable.humbergers, "4.6", "Becausel"
            )
        )
        listFood.add(
            LoookFood(
                "DOUBLECHEESE BURGER",
                "34 000 UZS",
                R.drawable.doubleches,
                "4.7",
                "Becausel"
            )
        )
        listFood.add(
            LoookFood(
                "BEEF LONGER",
                "21 000 UZS",
                R.drawable.beeflonger,
                "3.8",
                "Becausel"
            )
        )
        listFood.add(
            LoookFood(
                "CRISPY BURGER",
                "15 000 UZS",
                R.drawable.cripsy,
                "2.9",
                "Becausel"
            )
        )
        listFood.add(
            LoookFood(
                "BOSS BURGER",
                "34 000 UZS",
                R.drawable.bossburger,
                "3.9",
                "Becausel"
            )
        )


        /**
         * Categories
         */
        listPopular.add(CategoriesFood("Chicken", "", R.drawable.chicken))
        listPopular.add(CategoriesFood("Burgers", "", R.drawable.bossburger))
        listPopular.add(CategoriesFood("Spinners", "", R.drawable.spinner))
        listPopular.add(CategoriesFood("Pizza", "", R.drawable.hawaiian))
        listPopular.add(CategoriesFood("Drinks", "", R.drawable.drinks))
        listPopular.add(CategoriesFood("Appertizers and Combo", "", R.drawable.appr))
        listPopular.add(CategoriesFood("Deserts", "", R.drawable.deserts))
        listPopular.add(CategoriesFood("Other", "", R.drawable.other))
        listPopular.add(CategoriesFood("Kids", "", R.drawable.kids))

        /**
         * Chicken food
         */
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel",
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becausel"
            )
        )

    }
}