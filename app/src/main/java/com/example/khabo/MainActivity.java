package com.example.khabo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=findViewById(R.id.login_btn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Login Clicked!", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,Sign_In_Activity.class);
                startActivity(intent);

            }
        });
        reg=findViewById(R.id.register_btn);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Registration Clicked!", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,SignUp_Activity.class);
                startActivity(intent);

            }
        });
    }
}