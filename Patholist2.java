package com.example.kuldeepvashist.mypatho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Patholist2 extends AppCompatActivity {
    private Button A2;
    private Button B2;
    private Button C2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patholist2);
        A2 = (Button) findViewById(R.id.A2);
        B2 = (Button) findViewById(R.id.B2);
        C2 = (Button) findViewById(R.id.C2);

        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent a2 = new Intent(Patholist2.this,A2.class);
                startActivity(a2);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b2 = new Intent(Patholist2.this,B2.class);
                startActivity(b2);
            }
        });

        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c2 = new Intent(Patholist2.this,C2.class);
                startActivity(c2);
            }
        });
    }
}
