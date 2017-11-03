package com.example.velvetdev01.sasolapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class tenthScreen extends AppCompatActivity {

    public Button scan2;

    public void init15()
    {
        scan2 = (Button) findViewById(R.id.scan2);
        scan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy15 = new Intent(tenthScreen.this, ninethScreen.class);

                startActivity(toy15);
            }
        });
    }

    public Button pay2;

    public void init16()
    {
        pay2 = (Button) findViewById(R.id.pay2);
        pay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy16 = new Intent(tenthScreen.this, sixthScreen.class);

                startActivity(toy16);
            }
        });
    }

    public Button back6;

    public void init17()
    {
        back6 = (Button) findViewById(R.id.back6);
        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy17 = new Intent(tenthScreen.this, ninethScreen.class);

                startActivity(toy17);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth_screen);
        init15();
        init16();
        init17();

    }
}
