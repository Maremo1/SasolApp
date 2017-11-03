package com.example.velvetdev01.sasolapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class eighthScreen extends AppCompatActivity {

    public Button back8;

            public void init21()
            {
                back8 = (Button) findViewById(R.id.back8);
                back8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent toy21 = new Intent(eighthScreen.this, secondScreen.class);

                        startActivity(toy21);
                    }
                });
            }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth_screen);
        init21();
    }
}
