package com.moringaschool.dripstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Products extends AppCompatActivity {
    private String[] shoes = new String[] {"Jordan", "Nike",
            "Air force", "supras", "converse", "rubbers"};
    @BindView(R.id.listView) ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        ButterKnife.bind(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, shoes);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String shoes = ((TextView) view).getText().toString();
                Toast.makeText(Products.this, shoes, Toast.LENGTH_LONG).show();
            }
        });

//            Intent intent = getIntent();



            }
    }