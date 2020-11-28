package com.taran.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtUserNameL , edtPasswordL;
    private Button btnLogInL , btnSignUpL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("log in");

        btnSignUpL = findViewById(R.id.btnSignUpL);
        btnLogInL = findViewById(R.id.btnLogInL);
        edtUserNameL = findViewById(R.id.edtUserNameL);
        edtPasswordL = findViewById(R.id.edtPasswordL);

       // btnLogInL.setOnClickListener(this);
        btnSignUpL.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(MainActivity.this,SignUp.class);
        startActivity(intent);
    }
}