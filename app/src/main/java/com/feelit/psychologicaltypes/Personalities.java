package com.feelit.psychologicaltypes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Personalities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView t;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalities);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        t = (TextView) findViewById(R.id.txtMensajeContinuar);
        t.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(Personalities.this, Preguntas.class);
                startActivity(i);
            }

        });
    }



}
