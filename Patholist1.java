package com.example.kuldeepvashist.mypatho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Patholist1 extends AppCompatActivity {
    private Button A1;
    private Button B1;
    private Button C1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patholist1);
        A1 = (Button) findViewById(R.id.A1);
        B1 = (Button) findViewById(R.id.B1);
        C1 = (Button) findViewById(R.id.C1);

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a1 = new Intent(Patholist1.this,A1.class);
                startActivity(a1);
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b1 = new Intent(Patholist1.this,B1.class);
                startActivity(b1);
            }
        });

        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c1 = new Intent(Patholist1.this,C1.class);
                startActivity(c1);
            }
        });

    }
}
