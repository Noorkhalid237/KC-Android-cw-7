package com.example.woolsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Items> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Items wool1 = new Items("Crochet Pink Wool",R.drawable.pink,"Price:2KD");
        Items wool2 = new Items("Crochet Hot Pink Wool",R.drawable.darkpink,"Price:2.5KD");
        Items wool3 = new Items("Crochet Yellow Wool",R.drawable.yellow,"Price:1.75KD");
        Items wool4 = new Items("Crochet Light Blue Wool",R.drawable.blue,"Price:2.5KD");
        Items wool5 = new Items("Crochet Blue Wool",R.drawable.lightblue,"Price:1.75KD");
        Items wool6 = new Items("Crochet Turquoise Wool",R.drawable.turquoise,"Price:3KD");

        items.add(wool1);
        items.add(wool2);
        items.add(wool3);
        items.add(wool4);
        items.add(wool5);
        items.add(wool6);

        ListView itemsList = findViewById(R.id.listview);

        ItemAdapter noor = new ItemAdapter(this,0,items);
        itemsList.setAdapter(noor);
    }

}