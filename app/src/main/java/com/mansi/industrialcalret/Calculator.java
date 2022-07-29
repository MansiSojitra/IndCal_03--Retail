package com.mansi.industrialcalret;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Calculator extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

//        Button home = findViewById(R.id.button7);
//
//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent( Calculator.this , Home.class);
//                startActivity(intent);
//            }
//        });
//
//
//
//        Button pro = findViewById(R.id.button9);
//
//        pro.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Calculator.this , Profile.class);
//                startActivity(intent);
//            }
//        });
//
//        Button help = findViewById(R.id.button10);
//
//        help.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Calculator.this , Help.class);
//                startActivity(intent);
//            }
//        });

//        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Metals , android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
    }
}