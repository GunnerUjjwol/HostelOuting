package com.example.android.hosteloutingpass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText mrollno=(EditText) findViewById(R.id.erollno);
        final EditText mpass=(EditText) findViewById(R.id.repass);

        final Button btn_login=(Button) findViewById(R.id.btn_login);
        final Button btn_register=(Button) findViewById(R.id.btn_register);

        //Switching to register activity on clicking Register Button
     btn_register.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent registerIntent= new Intent(MainActivity.this,RegisterActivity.class);
             MainActivity.this.startActivity(registerIntent);

         }
     });


    }
}
