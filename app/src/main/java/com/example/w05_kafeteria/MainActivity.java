package com.example.w05_kafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView, View v, int position, long id)
                    {
                        if (position == 0)
                        {
                            Intent intent = new Intent(MainActivity.this, DrinkCategoryActivity.class);
                            startActivity(intent);
                        }
                        else if (position == 1)
                        {
                            Intent intent = new Intent(MainActivity.this, SnacksCategoryActivity.class);
                            startActivity(intent);
                        }
                        else if (position == 2)
                        {
                            Intent intent = new Intent(MainActivity.this, CoffyShopListActivity.class);
                            startActivity(intent);
                        }
                    }
                };
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);  // ustawienie słuchacza
    }


}