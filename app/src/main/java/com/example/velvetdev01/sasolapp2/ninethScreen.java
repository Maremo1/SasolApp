package com.example.velvetdev01.sasolapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import  android.widget.Button;

public class ninethScreen extends AppCompatActivity {

    public Button scan1;

    public void init13()
    {
        scan1 = (Button) findViewById(R.id.scan1);
        scan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy13 = new Intent(ninethScreen.this, tenthScreen.class);

                startActivity(toy13);
            }
        });
    }

    public Button back5;

    public void init14()
    {
        back5 = (Button) findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy14 = new Intent(ninethScreen.this, sixthScreen.class);

                startActivity(toy14);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineth_screen);
        init13();
        init14();
    }
}
