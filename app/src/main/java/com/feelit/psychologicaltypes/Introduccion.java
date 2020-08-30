package com.feelit.psychologicaltypes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Introduccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView t;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduccion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        t = (TextView) findViewById(R.id.txtMensajeIntroduccion);
        t.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(Introduccion.this, Personalities.class);
                startActivity(i);
            }

        });

    }

}
