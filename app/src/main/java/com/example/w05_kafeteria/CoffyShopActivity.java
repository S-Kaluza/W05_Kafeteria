package com.example.w05_kafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CoffyShopActivity extends AppCompatActivity {

    public static final String EXTRA_SHOPID = "shopId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        int shopId = (Integer)getIntent().getExtras().get(EXTRA_SHOPID);
        CoffyShop shop = CoffyShop.shops[shopId];
        TextView Adress = (TextView)findViewById(R.id.textView6);
        Adress.setText(shop.getAdress());
        TextView openingHours = (TextView)findViewById(R.id.textView5);
        openingHours.setText(shop.getOpeningHours().getOpeningHours());
        TextView name = (TextView)findViewById(R.id.textView4);
        name.setText(shop.getName());
        TextView description = (TextView)findViewById(R.id.textView3);
        description.setText(shop.getDescription());
        ImageView mapPhoto = (ImageView)findViewById(R.id.imageView3);
        mapPhoto.setImageResource(shop.getImageResourceId());
        mapPhoto.setContentDescription(shop.getName());
        ImageView shopPhoto = (ImageView)findViewById(R.id.imageView4);
        shopPhoto.setImageResource(shop.getImageMapResource());
        shopPhoto.setContentDescription(shop.getName());
    }

    public void openBrowser(View view){
        int shopId = (Integer)getIntent().getExtras().get(EXTRA_SHOPID);
        CoffyShop shop = CoffyShop.shops[shopId];
        String url = shop.getMapAdressURL();
        Intent intent = new Intent();
        intent.setAction(intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}