package com.example.android.hosteloutingpass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText mname=(EditText) findViewById(R.id.ename);
        final EditText mpassword=(EditText) findViewById(R.id.epassword);
        final  EditText mrollno=(EditText) findViewById(R.id.erollno);
         final EditText memail=(EditText) findViewById(R.id.eemail);
         final EditText mroomno=(EditText) findViewById(R.id.eroomno);
         final EditText mcollege=(EditText) findViewById(R.id.ecollege);
          final EditText myear=(EditText) findViewById(R.id.eyear);
         final EditText mbranch=(EditText) findViewById(R.id.ebranch);


        final Button btn_cancel=(Button) findViewById(R.id.cancel);


        //Funtionality to the cancel button
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mname.setText("");
                mpassword.setText("");
                mrollno.setText("");
                memail.setText("");
                mroomno.setText("");
                mcollege.setText("");
                myear.setText("");
                mbranch.setText("");

            }
        });
    }
}
