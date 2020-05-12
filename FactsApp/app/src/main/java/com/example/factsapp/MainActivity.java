package com.example.factsapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView factTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = findViewById(R.id.txt_fact);

        String[] myFacts = Fact.getfacts();

        for(String fact : myFacts) {

            factTextView.append(fact + "\n\n");

        }

    }

}
