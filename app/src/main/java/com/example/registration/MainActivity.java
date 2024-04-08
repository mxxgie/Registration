package com.example.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.registration.MESSAGE";
    EditText firstName, lastName, userEmail, userPassword, reEnterPassword;
    Button register;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        userEmail = findViewById(R.id.userEmail);
        userPassword = findViewById(R.id.userPassword);
        reEnterPassword = findViewById(R.id.reEnterPassword);
        register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = (new Intent(getApplicationContext(), Home.class));
                String fName = firstName.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, fName);
               startActivity(intent);
            }
        });
    }
}