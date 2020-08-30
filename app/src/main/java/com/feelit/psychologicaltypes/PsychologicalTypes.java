package com.feelit.psychologicaltypes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.TextView;


public class PsychologicalTypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView t;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychological_types);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      

        t = (TextView) findViewById(R.id.txtMensaje);
        t.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(PsychologicalTypes.this, Introduccion.class);
                startActivity(i);
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_psychological_types, menu);
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
