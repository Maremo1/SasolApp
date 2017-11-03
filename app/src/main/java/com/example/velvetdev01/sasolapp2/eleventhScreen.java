package com.example.velvetdev01.sasolapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class eleventhScreen extends AppCompatActivity {

    public Button confirm;

    public void init18()
    {
        confirm = (Button) findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy18 = new Intent(eleventhScreen.this, eleventhScreen.class);

                startActivity(toy18);
            }
        });
    }

    public Button cancel1;

    public void init19()
    {
        cancel1 = (Button) findViewById(R.id.cancel1);
        cancel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy19 = new Intent(eleventhScreen.this, tenthScreen.class);

                startActivity(toy19);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh_screen);
        init18();
        init19();
    }
}
