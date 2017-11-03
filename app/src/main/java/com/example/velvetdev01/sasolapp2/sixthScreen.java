package com.example.velvetdev01.sasolapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class sixthScreen extends AppCompatActivity {

    public Button pay1;

    public void init11() {
        pay1 = (Button) findViewById(R.id.pay1);
        pay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy11 = new Intent(sixthScreen.this, tenthScreen.class);

                startActivity(toy11);
            }
        });
    }

    public Button back4;

    public void init12() {
        back4 = (Button) findViewById(R.id.back4);
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy12 = new Intent(sixthScreen.this, secondScreen.class);

                startActivity(toy12);

            }
        });
    }

    public Button button;

    public void init23()
    {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy23 = new Intent(sixthScreen.this, tenthScreen.class);

                startActivity(toy23);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_screen);
        init11();
        init12();
        init23();
    }
}
