package com.abrahamgudratli.abrahamscafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCardView;
    CardView mainCoursesCardView;
    CardView desertCardView;
    CardView drinkCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startersCardView = findViewById(R.id.card_view_starters);
        mainCoursesCardView = findViewById(R.id.card_view_main_courses);
        desertCardView = findViewById(R.id.card_view_desserts);
        drinkCardView = findViewById(R.id.card_view_drinks);

        mainCoursesCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
                startActivity(mainCoursesActivityIntent);

            }
        });

        startersCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent starterActivityIntent = new Intent(MainActivity.this, StarterActivity.class);
                startActivity(starterActivityIntent);

            }
        });

        desertCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dessertActivtyIntern = new Intent(MainActivity.this, DessertActivity.class);
                startActivity(dessertActivtyIntern);
            }
        });

        drinkCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drinkActivityIntent = new Intent(MainActivity.this, DrinkActivity.class);
                startActivity(drinkActivityIntent);
            }
        });


        TextView textViewEmail = findViewById(R.id.text_view_email);
        textViewEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailLauncherIntent = new Intent(Intent.ACTION_SENDTO);
                emailLauncherIntent.setData(Uri.parse("mailto:fargocafe@abrahamgudratli.com"));
                startActivity(emailLauncherIntent);
            }
        });



    }
}