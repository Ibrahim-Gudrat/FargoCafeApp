package com.abrahamgudratli.abrahamscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        ListView listViewDessert;
        listViewDessert = findViewById(R.id.list_view_dessert);

        Dish[] dishes = {
               new Dish("Cinnamon and hazelnut biscuits", "Crunchy biscuits made with cinnamon and hazelnut", 1099),
               new Dish("Onion and almond pudding", "A rich suet pudding made with baby onion and blanched almond", 999),
               new Dish("Ham and mango crepes", "Fluffy crepes filled with free-range ham and fresh mango", 799),
               new Dish("Spelt and buttermilk bread", "Crunchy bread made with spelt and creamy buttermilk", 699),
               new Dish("Feta and spinach crepes", "Fluffy crepes filled with tangy feta and baby spinach", 929),
               new Dish("Sausage and scallop wontons", "Thin wonton cases stuffed with spicy sausage and scallop", 349),
               new Dish("Cinnamon and lemon buns", "Crumbly buns made with cinnamon and tangy lemon", 749),
               new Dish("Chicken and blueberry pancake", "Fluffy pancake filled with corn-fed chicken and fresh blueberry", 359),
               new Dish("Rhubarb and cream cake", "Moist cake made with fresh rhubarb and double cream", 899),
               new Dish("Salmon and rice pancake", "Crispy pancake filled with freshly-caught salmon and brown rice", 459),
               new Dish("Blackcurrant and plantain pancake", "Crispy pancake filled with fresh blackcurrant and plantain", 899),
               new Dish("Tangerine and blueberry cheesecake", "A velvety cheesecake layered with fresh tangerine and blueberry", 749),
               new Dish("Scallop and sweetcorn gyoza", "Thin pastry cases stuffed with scallop and baby sweetcorn", 699),
               new Dish("Pork and parmesan panini", "A warm, pressed panini filled with pork and parmesan", 599),
               new Dish("Garam masala and fish wontons", "Thin wonton cases stuffed with garam masala and fish", 699),

        };

        ArrayAdapter<Dish> dishArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        listViewDessert.setAdapter(dishArrayAdapter);

    }
}