package com.example.w05_kafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CoffyShopListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);
        ArrayAdapter<CoffyShop> listAdapter = new ArrayAdapter<CoffyShop>(
                this,
                android.R.layout.simple_list_item_1,
                CoffyShop.shops);
        ListView listShops = (ListView) findViewById(R.id.list_shop);
        listShops.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> shopList,
                                            View itemView,
                                            int position,
                                            long id) {
                        Intent intent = new Intent(CoffyShopListActivity.this, CoffyShopActivity.class);
                        intent.putExtra(CoffyShopActivity.EXTRA_SHOPID, (int) id);
                        startActivity(intent);
                    }
                };
        listShops.setOnItemClickListener(itemClickListener);
    }
}