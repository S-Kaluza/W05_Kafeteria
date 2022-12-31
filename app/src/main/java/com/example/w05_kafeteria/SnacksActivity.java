package com.example.w05_kafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SnacksActivity extends AppCompatActivity {

    public static final String EXTRA_SNACKID = "snackId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        int snackId = (Integer)getIntent().getExtras().get(EXTRA_SNACKID);
        Snacks snack = Snacks.snacks[snackId];
        TextView name = (TextView)findViewById(R.id.textView);
        name.setText(snack.getName());
        TextView description = (TextView)findViewById(R.id.textView2);
        description.setText(snack.getDescription());
        TextView price = (TextView)findViewById(R.id.textView8);
        price.setText(String.format("%,.2f zł%n",snack.getPrice()));
        ImageView photoSnacks = (ImageView) findViewById(R.id.imageView2);
        photoSnacks.setImageResource(snack.getImageResourceId());
        photoSnacks.setContentDescription(snack.getName());

    }
}