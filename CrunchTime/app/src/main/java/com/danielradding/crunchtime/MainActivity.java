package com.danielradding.crunchtime;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.danielradding.crunchtime.functions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        final EditText ED = (EditText)findViewById(R.id.editText);
        final EditText ED2 = (EditText)findViewById(R.id.editText2);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner);
        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        final TextView exType = (TextView)findViewById(R.id.textView2);
        final TextView exType2 = (TextView)findViewById(R.id.textView3);
        final functions func = new functions();

        ED.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence a, int b, int c, int d) {}
            public void beforeTextChanged(CharSequence a, int b, int c, int d) {}
            public void afterTextChanged(Editable s) {
                final String ex = spinner.getSelectedItem().toString();
                final String ex2 = spinner2.getSelectedItem().toString();
                exType.setText(func.exType(ex));
                exType2.setText(func.exType(ex2));
                ED.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double num = Double.parseDouble(ED.getText().toString());
                        double converted = func.convert(num, ex, ex2);
                        ED2.setText(String.valueOf(converted));
                    }
                });
            }
        });

        ED2.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence a, int b, int c, int d) {}
            public void beforeTextChanged(CharSequence a, int b, int c, int d) {}
            public void afterTextChanged(Editable s) {
                final String ex = spinner.getSelectedItem().toString();
                final String ex2 = spinner2.getSelectedItem().toString();
                exType.setText(func.exType(ex));
                exType2.setText(func.exType(ex2));
                ED2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double num = Double.parseDouble(ED2.getText().toString());
                        double converted = func.convert(num, ex2, ex);
                        ED.setText(String.valueOf(converted));
                    }
                });
            }
        });


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
