package com.abrahamgudratli.abrahamscafe;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] dishes = {
                new Dish("Plov", "It is made by rice, grape, meat", 1500),
                new Dish("Black pepper and chichpa vindaloo", "French mustard combined into smooth soup", 1200),
                new Dish("Thai basil and mulberry salad", "A crisp salad featuring fresh thai basil and mulberry", 1499),
                new Dish("Onion and apple ciabatta", "Warm ciabatta filled with caramalised onion and fresh apple", 1299),
                new Dish("Onion and olive bread", "Crunchy bread made with baby onion and olive", 1199),
                new Dish("Onion and mustard soup", "Dried onion and French mustard combined into smooth soup", 1299),
                new Dish("Samphire and rocket salad", "Samphire and fresh rocket served on a bed of lettuce", 1599),
                new Dish("Cocoa and chicory salad", "Cocoa and chicory served on a bed of lettuce", 1699),
                new Dish("Cauliflower and squash curry", "Mild curry made with fresh cauliflower and butternut squash", 1499),
                new Dish("Cauliflower and potato madras", "Medium-hot madras made with fresh cauliflower and new potato", 1399),
                new Dish("Rocket salad", "Rocket served on a bed of lettuce", 1299),
                new Dish("Chicory salad", "Chicory served on a bed of lettuce", 1199),
                new Dish("Squash curry", "Cauliflower and butternut squash", 1099),
                new Dish("Potato madras", "Fresh cauliflower and new potato", 1199)

        };

        ArrayAdapter<Dish> dishArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        mainCoursesList.setAdapter(dishArrayAdapter);

    }
}
