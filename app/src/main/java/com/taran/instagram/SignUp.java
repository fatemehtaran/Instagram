package com.taran.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    private Button btnSignUpS , btnLogInS;
    private EditText edtUserS , edtEmailS , edtPasswordS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setTitle("sign up");

        btnSignUpS = findViewById(R.id.btnSignUpS);
        btnLogInS = findViewById(R.id.btnLogInS);
        edtUserS = findViewById(R.id.edtUserS);
        edtEmailS = findViewById(R.id.edtEmailS);
        edtPasswordS = findViewById(R.id.edtPasswordS);

        btnLogInS.setOnClickListener(this);
        btnSignUpS.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}