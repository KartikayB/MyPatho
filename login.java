package com.example.kuldeepvashist.mypatho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private EditText Name;
    private EditText password;
    private TextView info;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Name = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.pass);
        info = (TextView) findViewById(R.id.attempt);
        Login = (Button) findViewById(R.id.btn);
        info.setText("No of attempts remaining:5");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userpassword) {
        if ((userName.equals("sahil")) && (userpassword.equals("1234"))) {
            Intent y = new Intent(login.this,Mypatho.class);
            startActivity(y);
        } else {
            counter--;

            info.setText("No of attempts remaining " + String.valueOf(counter));
            if (counter == 0) {
                Login.setEnabled(false);
            }
        }
    }
}