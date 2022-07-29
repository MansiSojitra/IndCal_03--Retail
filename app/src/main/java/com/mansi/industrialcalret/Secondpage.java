package com.mansi.industrialcalret;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Secondpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

//        EditText username,password,emailid,phoneno;
//        Button register;
//        DBHelper DB;
//
//        username = (EditText) findViewById(R.id.editTextTextPersonName2);
//        password = (EditText) findViewById(R.id.editTextTextPassword2);
//        emailid = (EditText) findViewById(R.id.editTextTextEmailAddress);
//        phoneno = (EditText) findViewById(R.id.editTextPhone);
//
//        register = (Button) findViewById(R.id.button3);
//        DB = new DBHelper(this);
//
//        register.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                String user = username.getText().toString();
//                String pass = password.getText().toString();
//                String email = emailid.getText().toString();
//                String phone = phoneno.getText().toString();
//
//                if(user.equals("") || pass.equals("")){
//                    Toast.makeText(Secondpage.this , "Please enter all fields ", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    Boolean checkuser = DB.checkusername(user);
//                    if(checkuser==false) {
//                        Boolean insert = DB.insertData(user, pass , email , phone);
//                        if (insert == true) {
//                            Toast.makeText(Secondpage.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
//                            Intent intent1 = new Intent(getApplicationContext(),Home.class);
//                            startActivity(intent1);
//                        }
//                        else{
//                            Toast.makeText(Secondpage.this, "Registration failed", Toast.LENGTH_SHORT).show();
//                        }
//
//                    }}
//            }
//        });

    }
}