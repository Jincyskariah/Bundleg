package com.example.bundleg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,email,password;
Button register;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.txtname);
        email = findViewById(R.id.txtmail);
        password = findViewById(R.id.txtpass);
        register = findViewById(R.id.butnreg);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputname = name.getText().toString();
                String inputemail = email.getText().toString();
                String inputpass = password.getText().toString();
                if (inputname != "" && inputemail !="" && inputpass!="") {
                    Intent intent = new Intent(MainActivity.this, Bundlelog.class);
                    intent.putExtra("name", inputname);
                    intent.putExtra("email",inputemail);
                    intent.putExtra("password",inputpass);
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(MainActivity.this, "enter all fields", Toast.LENGTH_SHORT).show();
                }




            }
        }



    }
}



