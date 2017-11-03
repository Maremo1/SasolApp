package com.example.velvetdev01.sasolapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.MenuItem;
import android.view.Menu;

import java.util.zip.Inflater;

public class secondScreen extends AppCompatActivity {

    public Button promo;

            public void init3()
            {
                promo = (Button) findViewById(R.id.promo);
                promo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent toy3 = new Intent(secondScreen.this, thirdScreen.class);

                        startActivity(toy3);
                    }
                });
            }


    public Button fill;

    public void init4()
    {
        fill = (Button) findViewById(R.id.fill);
        fill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy4 = new Intent(secondScreen.this, sixthScreen.class);

                startActivity(toy4);
            }
        });
    }

    public Button history;

    public void init5()
    {
        history = (Button)findViewById(R.id.history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy5 = new Intent(secondScreen.this, seventhScreen.class);

                startActivity(toy5);
            }
        });
    }

    public Button loc;

    public void init6()
    {
        loc = (Button) findViewById(R.id.loc);
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy6 = new Intent(secondScreen.this, eighthScreen.class);

                startActivity(toy6);
            }
        });
    }

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        init3();
        init4();
        init5();
        init6();
        call();
        button = (Button) findViewById(R.id.button);
    }

    private void call()
    {
        Intent in = new Intent(Intent.ACTION_DIAL,Uri.parse("0723263921"));
        try{
            startActivity(in);
        }
        catch (android.content.ActivityNotFoundException ex)
        {

        }
    }

}
