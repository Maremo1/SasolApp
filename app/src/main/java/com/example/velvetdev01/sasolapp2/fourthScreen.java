package com.example.velvetdev01.sasolapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class fourthScreen extends AppCompatActivity {

    public Button back2;

    public void init9()
    {
        back2 = (Button) findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy9 = new Intent(fourthScreen.this, secondScreen.class);

                startActivity(toy9);
            }
        });
    }

    public Button next2;

            public void init10()
            {
                next2 = (Button) findViewById(R.id.next2);
                next2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent toy10 = new Intent(fourthScreen.this, fifthScreen.class);

                        startActivity(toy10);
                    }
                });
            }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_screen);
        init9();
        init10();
    }
}
