package com.example.velvetdev01.sasolapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class thirdScreen extends AppCompatActivity {

    public Button back1;

    public void init7()
    {
        back1 = (Button) findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy7 = new Intent(thirdScreen.this, secondScreen.class);

                startActivity(toy7);
            }
        });
    }

    public Button next1;

    public void init8()
    {
        next1 = (Button) findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy8 = new Intent(thirdScreen.this, fourthScreen.class);

                startActivity(toy8);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        init7();
        init8();
    }
}
