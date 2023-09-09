package com.example.online_shop_app.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.online_shop_app.Adapters.PopularListAdapter;
import com.example.online_shop_app.Domains.PopularDomain;
import com.example.online_shop_app.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular;
    private RecyclerView recyclerViewPopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerview();
        bottom_navigation();

    }

    private void bottom_navigation() {
        LinearLayout homeBtn = findViewById(R.id.homeBtn);
        LinearLayout cartBtn = findViewById(R.id.cartBtn);

        homeBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MainActivity.class)));
        cartBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, CartActivity.class)));
    }

    private void initRecyclerview() {
        ArrayList< PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Macbook Pro 13 M2 chip", "Testing conducted by Apple in May 2022 using preproduction 13-inch MacBook Pro systems with Apple M2, 8-core CPU, 10-core GPU, 8GB of RAM, and 256GB SSD. The wireless web test measures battery life by wirelessly browsing 25 popular websites with display brightness set to 8 clicks from bottom. The Apple TV app movie playback test measures battery life by playing back HD 1080p content with display brightness set to 8 clicks from bottom. Battery life varies by use and configuration. See apple.com/batteries for more information.", "pic1", 15,4,432));
        items.add(new PopularDomain("Ps-5 Digital", "Enjoy PS5™ games as well as supported PlayStation®4 games on your PS5™ console. Some functionalities available on the PS4™ console may be absent when played on the PS5™ console. You must update to the latest system software version. Internet connection required.\n" +
                "\n" +
                "By updating the system software of the PS5™ console, you can enjoy additional features, improved usability, and enhanced security. Always update to the latest version.\n" +
                "\n" +
                "To fully enjoy PS5™ console features, an internet connection is recommended. You can also use a wide variety of features and services by creating an account for, and signing in to, PlayStation™Network.\n" +
                "\n" +
                "PS Plus membership is subject to a recurring subscription fee taken automatically until cancellation. Members must have an account for PlayStation™Network and access to PlayStation™Store and high-speed internet. Benefits vary by member age and may change over time.\n", "pic2",10,4.9,500));
        items.add(new PopularDomain("Iphone 14", "Argentina, Armenia, Australia, Austria, Azerbaijan, Bahrain, Belarus, Belgium, Brazil, Bulgaria, Canada, China mainland,19 Colombia, Costa Rica, Croatia, Cyprus, Czech Republic, Denmark, Estonia, Faroe Islands, Finland, France, Georgia, Germany, Greece, Greenland, Guernsey, Hong Kong, Hungary, Iceland, Ireland, Isle of Man, Israel, Italy, Japan, Jersey, Kazakhstan, Latvia, Liechtenstein, Lithuania, Luxembourg, Macao, Malaysia, Malta, Mexico, Moldova, Monaco, Montenegro, Netherlands, New Zealand, Norway, Palestine, Peru, Poland, Portugal, Qatar, Romania, Russia, San Marino, Saudi Arabia, Serbia, Singapore, Slovakia, Slovenia, South Africa, Spain, Sweden, Switzerland, Taiwan, UK, Ukraine, United Arab Emirates, U.S., Vatican City", "pic3", 10, 5.0, 252));

        recyclerViewPopular = findViewById(R.id.view1);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterPopular = new PopularListAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);
    }
}