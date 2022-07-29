package com.mansi.industrialcalret;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thirdpage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdpage);

        Button home = findViewById(R.id.button7);
        home.setOnClickListener(this);
//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(thirdpage.this, Home.class);
//                startActivity(intent);
//            }
//        });

        Button cal = findViewById(R.id.buttoncal);
        cal.setOnClickListener(this);
//        cal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(thirdpage.this,Calculator.class);
//                startActivity(intent);
//            }
//        });

        Button pro = findViewById(R.id.buttonpro);
        pro.setOnClickListener(this);
//        pro.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(thirdpage.this, Profile.class);
//                startActivity(intent);
//            }
//        });

        Button help = findViewById(R.id.buttonhel);
       help.setOnClickListener(this);
//        help.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(thirdpage.this , Help.class);
//                startActivity(intent);
//            }
//        });

    }


    @Override
    public void onClick(View view) {

            if (view.getId() == R.id.button7) {
                Intent intent = new Intent(thirdpage.this, Home.class);
                startActivity(intent);
            } else if (view.getId() == R.id.buttoncal) {
                Intent intent1 = new Intent(thirdpage.this, Calculator.class);
               startActivity(intent1);
            } else if (view.getId() == R.id.buttonpro) {
                Intent intent2 = new Intent(thirdpage.this, Profile.class);
                startActivity(intent2);
            }else if (view.getId() == R.id.buttonhel){
                Intent intent3 = new Intent(thirdpage.this, Help.class);
                startActivity(intent3);
            }



    }
}