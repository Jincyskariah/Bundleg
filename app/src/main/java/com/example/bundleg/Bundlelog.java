package com.example.bundleg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Bundlelog extends AppCompatActivity {
EditText name,password;
Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundlelog);
        name=findViewById(R.id.namelogin);
        password=findViewById(R.id.passwordlgin);
        login=findViewById(R.id.login);

        Bundle bundle=getIntent().getExtras();
        String loginname=bundle.getString("name");
        name.setText(loginname);



    }
}
