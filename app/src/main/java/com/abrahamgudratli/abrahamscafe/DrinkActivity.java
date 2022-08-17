package com.abrahamgudratli.abrahamscafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        ListView listViewDrink;
        listViewDrink = findViewById(R.id.list_view_drink);

        Dish[] dishes = {
                new Dish("Coca Cola", 5),
                new Dish("Fanta", 5),
                new Dish("Sprite", 5),
                new Dish("Mountain Dew", 4),
                new Dish("Sari Kiz", 4),
                new Dish("Wine", 10),
                new Dish("Whiskey", 10),
                new Dish("Vodka", 10),
                new Dish("Beer", 6),
                new Dish("Tequila", 9),
                new Dish("Latte", 10),
                new Dish("Americano", 8),
                new Dish("Mocha", 10)

        };

        ArrayAdapter<Dish> dishArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        listViewDrink.setAdapter(dishArrayAdapter);


    }
}