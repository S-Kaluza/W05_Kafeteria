package com.example.w05_kafeteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SnacksCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_category);
        ArrayAdapter<Snacks> listAdapter = new ArrayAdapter<Snacks>(
                this,
                android.R.layout.simple_list_item_1,
                Snacks.snacks);
        ListView listSnacks = (ListView) findViewById(R.id.list_snacks);
        listSnacks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listSnacks,
                                            View itemView,
                                            int position,
                                            long id) {
                        Intent intent = new Intent(SnacksCategoryActivity.this, SnacksActivity.class);
                        intent.putExtra(SnacksActivity.EXTRA_SNACKID, (int) id);
                        startActivity(intent);
                    }
                };
        listSnacks.setOnItemClickListener(itemClickListener);
    }
}