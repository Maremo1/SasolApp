package com.example.velvetdev01.sasolapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class firstScreen extends AppCompatActivity {

    public Button sign;

    public void init()
    {
        sign = (Button)findViewById(R.id.sign);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent toy = new Intent(firstScreen.this, secondScreen.class);

                startActivity(toy);
            }
        });
    }

    public Button register;

    public void init1()
    {
        register = (Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy1 = new Intent(firstScreen.this, secondScreen.class);

                startActivity(toy1);
            }
        });
    }

    public Button newacc;

    public void init2()
    {
        newacc =(Button) findViewById(R.id.newacc);
        newacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy2 = new Intent(firstScreen.this, secondScreen.class);

                startActivity(toy2);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        init();
        init1();
        init2();
    }
}
