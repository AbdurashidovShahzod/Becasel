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
    var listPopular = ArrayList<CategoriesFood>()

    var listBurger = ArrayList<LoookFood>()
    var listChicken = ArrayList<LoookFood>()
    var listSpinners = ArrayList<LoookFood>()
    var listPizza = ArrayList<LoookFood>()
    var listDrinks = ArrayList<LoookFood>()
    var listAppetizersCombo = ArrayList<LoookFood>()


    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()

        asiaFoodAdapter = AsiaFoodAdapter(this, listDrinks)
        foodAdapter = FoodAdapter(this, listPopular)
        popular_recycler.adapter = foodAdapter
        asia_recycler.adapter = asiaFoodAdapter
        textAll.setOnClickListener {
            startActivity(Intent(this, SeconFoodActivity::class.java))
        }
    }

    private fun initData() {
        listBurger.add(LoookFood("BIGGER", "16 000 UZS", R.drawable.a1, "5.0", "Becasel"))
        listBurger.add(LoookFood("CLASSIC", "12 000 UZS", R.drawable.classic, "5.0", "Becasel"))
        listBurger.add(
            LoookFood(
                "CHEESEBURGER",
                "24 000 UZS",
                R.drawable.chesbirger,
                "4.8",
                "Becasel"
            )
        )
        listBurger.add(
            LoookFood(
                "CHILI LONGER",
                "21 000 UZS",
                R.drawable.chililonger,
                "5.0",
                "Becasel"
            )
        )
        listBurger.add(
            LoookFood(
                "LOOOK", "14 000 UZS", R.drawable.look, "4.5", "Becasel"
            )
        )
        listBurger.add(
            LoookFood(
                "CHICKEN LONGER",
                "14 000 UZS",
                R.drawable.chickenloger,
                "3.8",
                "Becasel"
            )
        )
        listBurger.add(
            LoookFood(
                "HAMBURGER",
                "21 000 UZS", R.drawable.humbergers, "4.6", "Becasel"
            )
        )
        listBurger.add(
            LoookFood(
                "DOUBLECHEESE BURGER",
                "34 000 UZS",
                R.drawable.doubleches,
                "4.7",
                "Becasel"
            )
        )
        listBurger.add(
            LoookFood(
                "BEEF LONGER",
                "21 000 UZS",
                R.drawable.beeflonger,
                "3.8",
                "Becasel"
            )
        )
        listBurger.add(
            LoookFood(
                "CRISPY BURGER",
                "15 000 UZS",
                R.drawable.cripsy,
                "2.9",
                "Becasel"
            )
        )
        listBurger.add(
            LoookFood(
                "BOSS BURGER",
                "34 000 UZS",
                R.drawable.bossburger,
                "3.9",
                "Becasel"
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
                "Becasel",
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listChicken.add(
            LoookFood(
                "DINNER MEAL NORMAL",
                "29 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        /**
         * Spinner food
         */
        listSpinners.add(
            LoookFood(
                "SPINNER SUPER CHARGED",
                "12 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listSpinners.add(
            LoookFood(
                "SMILE BOX",
                "16 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listSpinners.add(
            LoookFood(
                "DUET MASTER",
                "18 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listSpinners.add(
            LoookFood(
                "SPINNER SALSA WRAP",
                "12 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )
        listSpinners.add(
            LoookFood(
                "SPINNER NO SOUCE",
                "12 000 UZS",
                R.drawable.spinner,
                "5.0",
                "Becasel"
            )
        )

        /**
         * Pizza food
         */
        listPizza.add(
            LoookFood(
                "PIZZA SUPREME",
                "39 000 UZS",
                R.drawable.popularfood3,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA PEPPERONI",
                "29 000 UZS",
                R.drawable.popularfood3,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA STEAK",
                "49 000 UZS",
                R.drawable.popularfood3,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA BBQ CHICKEN",
                "33 000 UZS",
                R.drawable.popularfood3,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA SPICY",
                "32 000 UZS",
                R.drawable.popularfood3,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA VEGETARIAN",
                "26 000 UZS",
                R.drawable.popularfood3,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA WHITE CHEESE",
                "21 000 UZS",
                R.drawable.popularfood3,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA HAWAIIAN",
                "31 000 UZS",
                R.drawable.popularfood3,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA MARGARITTA",
                "25 000 UZS",
                R.drawable.popularfood3,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA FRANKFURT",
                "32 000 UZS",
                R.drawable.popularfood3,
                "5.0",
                "Becasel"
            )
        )
        /**
         * Drink food
         */
        listDrinks.add(
            LoookFood(
                "MINERALKA 0.5L BEZGAZ",
                "3 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDrinks.add(
            LoookFood(
                "MINERALKA 1.5L BEZGAZ",
                "5 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDrinks.add(
            LoookFood(
                "MINERALKA 1L BEZGAZ",
                "4 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDrinks.add(
            LoookFood(
                "MINERALKA 0.5L GAZ",
                "3 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDrinks.add(
            LoookFood(
                "MINERALKA 1L GAZ",
                "4 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDrinks.add(
            LoookFood(
                "MINERALKA 1.5L GAZ",
                "5 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDrinks.add(
            LoookFood(
                "COCA COLA 400ML",
                "5 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDrinks.add(
            LoookFood(
                "COCA COLA 1.5L",
                "11 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDrinks.add(LoookFood("COCA COLA 1L", "9 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDrinks.add(LoookFood("COCA COLA 0.5", "6 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDrinks.add(LoookFood("FANTA 400ML", "5 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDrinks.add(LoookFood("FANTA 1.5L", "11 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDrinks.add(LoookFood("FANTA 0.5L", "6 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDrinks.add(LoookFood("FANTA 1L", "9 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDrinks.add(LoookFood("SPRITE 0.5L", "6 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDrinks.add(LoookFood("SPRITE 1.5L", "11 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDrinks.add(LoookFood("SPRITE 400ML", "5 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDrinks.add(LoookFood("ICE TEA", "9 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDrinks.add(LoookFood("SOK 1L", "10 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDrinks.add(
            LoookFood(
                "SOK 1L (GRANAT,APELSIN,MALINA)",
                "11 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )

        /**
         * Appetizers and Combo food
         */
        listAppetizersCombo.add(LoookFood("FRIES","9 000 UZS",R.drawable.appr,"5.0","Becasel"))
        listAppetizersCombo.add(LoookFood("WINGS","16 000 UZS",R.drawable.appr,"5.0","Becasel"))
        listAppetizersCombo.add(LoookFood("STRIPS","16 000 UZS",R.drawable.appr,"5.0","Becasel"))
        listAppetizersCombo.add(LoookFood("BITES","9 000 UZS",R.drawable.appr,"5.0","Becasel"))
        listAppetizersCombo.add(LoookFood("MUSHROOMS 6 PCS","9 000 UZS",R.drawable.appr,"5.0","Becasel"))
        listAppetizersCombo.add(LoookFood("1 WINGS","5 000 UZS",R.drawable.appr,"5.0","Becasel"))
        listAppetizersCombo.add(LoookFood("1 STRIPS","5 000 UZS",R.drawable.appr,"5.0","Becasel"))
        listAppetizersCombo.add(LoookFood("CHEESE NUGGETS","11 000 UZS",R.drawable.appr,"5.0","Becasel"))
        listAppetizersCombo.add(LoookFood("COMBO","12 000 UZS",R.drawable.appr,"5.0","Becasel"))
        listAppetizersCombo.add(LoookFood("WICKED COMBO (strips)","18 000 UZS",R.drawable.appr,"5.0","Becasel"))
        listAppetizersCombo.add(LoookFood("WICKED COMBO (wings)","18 000 UZS",R.drawable.appr,"5.0","Becasel"))




    }
}