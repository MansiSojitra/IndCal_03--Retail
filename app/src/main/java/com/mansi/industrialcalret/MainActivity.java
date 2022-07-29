package com.mansi.industrialcalret;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       EditText username,password;
       Button login;
      TextView register;
//        DBHelper DB;
//
//        username = (EditText) findViewById(R.id.editTextTextPersonName);
//        password = (EditText) findViewById(R.id.editTextTextPassword);
        login = (Button) findViewById(R.id.button);
        register = (TextView) findViewById(R.id.textView5);
//        DB = new DBHelper(this);




        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Secondpage.class);
                startActivity(intent);
            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String user = username.getText().toString();
//                String pass= password.getText().toString();
//
//                if(user.equals("")||pass.equals("")){
//                    Toast.makeText(MainActivity.this, "Please enter all feilds", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    Boolean checkuserpass = DB.checkusernamepassword(user , pass);
//                    if(checkuserpass==true){
//                        Intent intent = new Intent(getApplicationContext() , thirdpage.class);
//                        startActivity(intent);
//                    }
//                    else{
//                        Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
//                    }
//
//                }
//
//            }

                Intent intent = new Intent(MainActivity.this, thirdpage.class);
                startActivity(intent);
            }
        });
}
}