package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.textView);
        password = (EditText) findViewById(R.id.editTextTextPassword3);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals(" ")) {
                    username.setError("Username harus diisi");
                } else if (password.getText().toString().equals(" ")) {
                    password.setError("Password harus diisi");
                } else {
                    String un = username.getText().toString();
                    String pw = password.getText().toString();

                    Toast.makeText(MainActivity.this, "Hallo! " + un + ". Password Anda " + pw, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("username", un);
                    intent.putExtra("password", pw);
                    startActivity(intent);
                }
            }
        });


        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}