package uz.unzosoft.fastfoodbecasel.ui.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_fast.view.*
import kotlinx.android.synthetic.main.main_demo_layout.*
import kotlinx.android.synthetic.main.main_demo_layout.asia_recycler
import kotlinx.android.synthetic.main.main_demo_layout.popular_recycler
import kotlinx.android.synthetic.main.main_demo_layout.textAll
import uz.unzosoft.fastfoodbecasel.R
import uz.unzosoft.fastfoodbecasel.adapters.CategoriesAdapter
import uz.unzosoft.fastfoodbecasel.adapters.FoodAdapter
import uz.unzosoft.fastfoodbecasel.model.CategoriesFood
import uz.unzosoft.fastfoodbecasel.model.LoookFood
import uz.unzosoft.fastfoodbecasel.ui.SeconFoodActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FastFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FastFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }


    lateinit var asiaFoodAdapter: CategoriesAdapter
    lateinit var foodAdapter: FoodAdapter
    private var listBurger = ArrayList<LoookFood>()
    private var listChicken = ArrayList<LoookFood>()
    private var listSpinners = ArrayList<LoookFood>()
    private var listPizza = ArrayList<LoookFood>()
    private var listDrinks = ArrayList<LoookFood>()
    private var listAppetizersCombo = ArrayList<LoookFood>()
    private var listDesert = ArrayList<LoookFood>()
    private var listOther = ArrayList<LoookFood>()
    private var listKids = ArrayList<LoookFood>()
    private var listPopular = ArrayList<CategoriesFood>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var root = inflater.inflate(R.layout.fragment_fast, container, false)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        initData()
        setUpTabBar()
        asiaFoodAdapter = CategoriesAdapter(root.context, listBurger)

        root.asia_recycler.adapter = asiaFoodAdapter

        foodAdapter = FoodAdapter(root.context, listPopular)
        foodAdapter.setOnClickListener {
            when (it) {
                0 -> asiaFoodAdapter = CategoriesAdapter(root.context, listChicken)
                1 -> asiaFoodAdapter = CategoriesAdapter(root.context, listBurger)
                2 -> asiaFoodAdapter = CategoriesAdapter(root.context, listSpinners)
                3 -> asiaFoodAdapter = CategoriesAdapter(root.context, listPizza)
                4 -> asiaFoodAdapter = CategoriesAdapter(root.context, listDrinks)
                5 -> asiaFoodAdapter = CategoriesAdapter(root.context, listAppetizersCombo)
                6 -> asiaFoodAdapter = CategoriesAdapter(root.context, listDesert)
                7 -> asiaFoodAdapter = CategoriesAdapter(root.context, listOther)
                8 -> asiaFoodAdapter = CategoriesAdapter(root.context, listKids)
            }
            root.asia_recycler.adapter = asiaFoodAdapter
        }
        root.popular_recycler.adapter = foodAdapter





        root.textAll.setOnClickListener {
            startActivity(Intent(root.context, SeconFoodActivity::class.java))
        }
        root.bottom_nav_bar.setOnItemSelectedListener {
            when (it) {
                R.id.nav_near -> {
                    Toast.makeText(root.context, "", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_new_chat -> {
                    Toast.makeText(root.context, "", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_profile -> {
                    startActivity(Intent(root.context, SeconFoodActivity::class.java))
                }
                R.id.nav_settings -> {
                    Toast.makeText(root.context, "", Toast.LENGTH_SHORT).show()
                }
            }
        }

        return root
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FastFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FastFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
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
                R.drawable.hawaiian,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA PEPPERONI",
                "29 000 UZS",
                R.drawable.hawaiian,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA STEAK",
                "49 000 UZS",
                R.drawable.hawaiian,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA BBQ CHICKEN",
                "33 000 UZS",
                R.drawable.hawaiian,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA SPICY",
                "32 000 UZS",
                R.drawable.hawaiian,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA VEGETARIAN",
                "26 000 UZS",
                R.drawable.hawaiian,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA WHITE CHEESE",
                "21 000 UZS",
                R.drawable.hawaiian,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA HAWAIIAN",
                "31 000 UZS",
                R.drawable.hawaiian,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA MARGARITTA",
                "25 000 UZS",
                R.drawable.hawaiian,
                "5.0",
                "Becasel"
            )
        )
        listPizza.add(
            LoookFood(
                "PIZZA FRANKFURT",
                "32 000 UZS",
                R.drawable.hawaiian,
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
        listAppetizersCombo.add(LoookFood("FRIES", "9 000 UZS", R.drawable.appr, "5.0", "Becasel"))
        listAppetizersCombo.add(LoookFood("WINGS", "16 000 UZS", R.drawable.appr, "5.0", "Becasel"))
        listAppetizersCombo.add(
            LoookFood(
                "STRIPS",
                "16 000 UZS",
                R.drawable.appr,
                "5.0",
                "Becasel"
            )
        )
        listAppetizersCombo.add(LoookFood("BITES", "9 000 UZS", R.drawable.appr, "5.0", "Becasel"))
        listAppetizersCombo.add(
            LoookFood(
                "MUSHROOMS 6 PCS",
                "9 000 UZS",
                R.drawable.appr,
                "5.0",
                "Becasel"
            )
        )
        listAppetizersCombo.add(
            LoookFood(
                "1 WINGS",
                "5 000 UZS",
                R.drawable.appr,
                "5.0",
                "Becasel"
            )
        )
        listAppetizersCombo.add(
            LoookFood(
                "1 STRIPS",
                "5 000 UZS",
                R.drawable.appr,
                "5.0",
                "Becasel"
            )
        )
        listAppetizersCombo.add(
            LoookFood(
                "CHEESE NUGGETS",
                "11 000 UZS",
                R.drawable.appr,
                "5.0",
                "Becasel"
            )
        )
        listAppetizersCombo.add(LoookFood("COMBO", "12 000 UZS", R.drawable.appr, "5.0", "Becasel"))
        listAppetizersCombo.add(
            LoookFood(
                "WICKED COMBO (strips)",
                "18 000 UZS",
                R.drawable.appr,
                "5.0",
                "Becasel"
            )
        )
        listAppetizersCombo.add(
            LoookFood(
                "WICKED COMBO (wings)",
                "18 000 UZS",
                R.drawable.appr,
                "5.0",
                "Becasel"
            )
        )


        /**
         * Desert food
         */
        listDesert.add(
            LoookFood(
                "MILKSHAKE BANAN",
                "16 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDesert.add(
            LoookFood(
                "MILKSHAKE KITKAT",
                "14 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDesert.add(
            LoookFood(
                "MILKSHAKE TWIX",
                "14 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDesert.add(
            LoookFood(
                "MILKSHAKE APPLE",
                "14 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDesert.add(
            LoookFood(
                "MILKSHAKE STRAWBERRY",
                "14 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDesert.add(
            LoookFood(
                "MILKSHAKE RAFFAELLO",
                "14 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDesert.add(LoookFood("LEMON CAKE", "14 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDesert.add(
            LoookFood(
                "CHOCOLATE SOUFFLE",
                "14 000 UZS",
                R.drawable.drinks,
                "5.0",
                "Becasel"
            )
        )
        listDesert.add(LoookFood("CHOCOTASTIC", "13 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDesert.add(LoookFood("RED WAVE", "13 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDesert.add(LoookFood("KIWIX", "13 000 UZS", R.drawable.drinks, "5.0", "Becasel"))
        listDesert.add(LoookFood("SAFER", "10 000 UZS", R.drawable.drinks, "5.0", "Becasel"))

        /**
         * Other food
         */
        listOther.add(LoookFood("COLESLAW SALAD", "4 000 UZS", R.drawable.other, "5.0", "Becasel"))
        listOther.add(LoookFood("LOOOK SALAD", "10 000 UZS", R.drawable.other, "5.0", "Becasel"))
        listOther.add(
            LoookFood(
                "VEGGIE-FRESH SALAD",
                "9 000 UZS",
                R.drawable.other,
                "5.0",
                "Becasel"
            )
        )
        /**
         * Kids meal
         */
        listKids.add(LoookFood("TOY", "10 000 UZS", R.drawable.kids, "5.0", "Becasel"))
        listKids.add(
            LoookFood(
                "KIDS MENU STRIPS BOY",
                "28 000 UZS",
                R.drawable.kids,
                "5.0",
                "Becasel"
            )
        )
        listKids.add(
            LoookFood(
                "KIDS MENU STRIPS GIRL",
                "28 000 UZS",
                R.drawable.kids,
                "5.0",
                "Becasel"
            )
        )
        listKids.add(LoookFood("KIDS BURGER", "11 000 UZS", R.drawable.kids, "5.0", "Becasel"))
        listKids.add(LoookFood("KIDS SPINNER", "7 000 UZS", R.drawable.kids, "5.0", "Becasel"))
        listKids.add(
            LoookFood(
                "KIDS MENU SPINNER GIRL",
                "28 000 UZS",
                R.drawable.kids,
                "5.0",
                "Becasel"
            )
        )
        listKids.add(
            LoookFood(
                "KIDS MENU SPINNER BOY",
                "28 000 UZS",
                R.drawable.kids,
                "5.0",
                "Becasel"
            )
        )
        listKids.add(LoookFood("KIDS JUICE", "3 000 UZS", R.drawable.kids, "5.0", "Becasel"))
        listKids.add(LoookFood("BABY (Heinz)", "10 000 UZS", R.drawable.kids, "5.0", "Becasel"))
    }

    private fun setUpTabBar() {


//        bottom_nav_bar.setOnItemSelectedListener {
//            when (it) {
//                R.id.nav_profile -> {
//                    bottom_nav_bar.showBadge(R.id.nav_settings)
//                }
//                R.id.nav_settings -> {
//                    bottom_nav_bar.dismissBadge(R.id.nav_settings)
//                }
//            }
//        }
    }
}
