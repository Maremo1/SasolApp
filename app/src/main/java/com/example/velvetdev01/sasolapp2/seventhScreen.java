package com.example.velvetdev01.sasolapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class seventhScreen extends AppCompatActivity {

    public Button back7;

    public void init20()
    {
        back7 = (Button) findViewById(R.id.back7);
        back7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy20 = new Intent(seventhScreen.this, secondScreen.class);

                startActivity(toy20);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_screen);
        init20();
    }
}
