package com.example.kuldeepvashist.mypatho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mypatho extends AppCompatActivity {
    private Button DELHI;
    private Button NOIDA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypatho);
        DELHI = (Button) findViewById(R.id.button1);
        NOIDA = (Button) findViewById(R.id.button2);

        DELHI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Mypatho.this, Patholist1.class);
                startActivity(i);

            }
        });

        NOIDA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Mypatho.this, Patholist2.class);
                startActivity(j);
            }
        });

    }
}
