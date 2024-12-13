package com.example.admineatsphere

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.admineatsphere.adapter.AddItemAdapter
import com.example.admineatsphere.databinding.ActivityAddItemBinding
import com.example.admineatsphere.databinding.ActivityAllItemBinding

class AllItemActivity : AppCompatActivity() {
    private val binding: ActivityAllItemBinding by lazy {
        ActivityAllItemBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(binding.root)

        val menuFoodName = listOf("Aaloo Paratha", "Appam", "Apple Pie", "BBQ Ribs", "Beef Wellington", "Bruschetta", "Butter Chicken", "Caesar Salad", "Chicken Burger", "Chicken Wings", "Chole Bhature", "Creme Brulee", "Dal Makhni", "Dosa", "French Fries", "Fried Chicken", "Grilled Chicken", "Gulab Jamun", "Hot Dog", "Kadhai Chicken", "Lasagna", "Lassi", "Mac and Cheese", "Mashed Potatoes", "Medu Vada", "Moussaka", "Mysore Pak", "Naan", "Neer Dosa", "Palak Paneer", "Pancakes", "Paneer Butter Masala", "Pasta", "Pesarattu", "Pongal", "Quiche", "Rasam", "Risotto", "Rogan Josh", "Sambhar Rice", "Steak", "Stuffed Pepper", "Tandoori Chicken", "Tiramisu", "Uttapam", "Vada", "Veg Burger")
        val menuPrice = listOf("5$", "3$", "7$", "10$", "15$", "4$", "8$", "6$", "5$", "6$", "4$", "7$", "6$", "3$", "2$", "9$", "10$", "4$", "5$", "8$", "7$", "2$", "5$", "3$", "2$", "9$", "4$", "1$", "3$", "7$", "5$", "8$", "6$", "3$", "4$", "7$", "2$", "9$", "10$", "6$", "15$", "7$", "10$", "6$", "4$", "2$", "5$")
        val menuImages = listOf(
            R.drawable.aaloparatha, R.drawable.appam, R.drawable.applepie, R.drawable.bbqribs,
            R.drawable.beefwelington, R.drawable.buscheta, R.drawable.butterchicken,
            R.drawable.caesarsalad, R.drawable.chickenburger, R.drawable.chickenwings,
            R.drawable.cholebhature, R.drawable.cremebrule, R.drawable.dalmakhni, R.drawable.dosa,
            R.drawable.frenchfries, R.drawable.friedchicken, R.drawable.grilledchicken,
            R.drawable.gulabjamun, R.drawable.hotdog, R.drawable.kadhaichicken, R.drawable.lasgna,
            R.drawable.lassi, R.drawable.macandcheese, R.drawable.mashedpotatoes,
            R.drawable.meduvada, R.drawable.moussaka, R.drawable.mysorepak, R.drawable.naan,
            R.drawable.neerdosa, R.drawable.palakpanner, R.drawable.pancakes,
            R.drawable.paneerbuttermasala, R.drawable.pasta, R.drawable.pesarattu,
            R.drawable.pongal, R.drawable.quiche, R.drawable.rasam, R.drawable.risotto,
            R.drawable.roganjosh, R.drawable.sambharrice, R.drawable.steak, R.drawable.stuffedpepper,
            R.drawable.tandorichicken, R.drawable.tiramisu, R.drawable.uttapam, R.drawable.vada,
            R.drawable.vegburger
        )
        val adapter = AddItemAdapter(ArrayList(menuFoodName),ArrayList(menuPrice),ArrayList(menuImages))
        binding.MenuRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.MenuRecyclerView.adapter=adapter

        binding.backButton.setOnClickListener{
            finish()
        }
    }

}