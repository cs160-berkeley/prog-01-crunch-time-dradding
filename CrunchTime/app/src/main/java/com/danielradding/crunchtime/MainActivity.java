package com.danielradding.crunchtime;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("Pushup", 350);
        map.put("Situp", 200);
        map.put("Jumping Jacks", 10);
        map.put("Jogging", 12);
        map.put("Squats", 225);
        map.put("Leg-lift", 25);
        map.put("Plank", 25);
        map.put("Pullup", 100);
        map.put("Cycling", 12);
        map.put("Walking", 20);
        map.put("Swimming", 13);
        map.put("Stair-Climbing", 15);
        

        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        String exercise = spinner.getSelectedItem().toString();

        Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        String exercise2 = spinner.getSelectedItem().toString();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
