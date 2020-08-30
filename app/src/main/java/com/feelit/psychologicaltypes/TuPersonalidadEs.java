package com.feelit.psychologicaltypes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.feelit.psychologicaltypes.contadoresA_B;

import org.w3c.dom.Text;

public class TuPersonalidadEs extends AppCompatActivity {


    private int resultado1;
    private int resultado2;
    private int resultado3;
    private int resultado4;
    private int resultado5;
    private int resultado6;
    private int resultado7;
    private int resultado8;

    public TextView txtUno1;
    public TextView txtUno2 ;
    public TextView txtUno3;
    public TextView txtUno4 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView t;
        // globally

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tu_personalidad_es);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtUno1 = (TextView)findViewById(R.id.txtUno);
        txtUno2 = (TextView)findViewById(R.id.txtDos);
        txtUno3 = (TextView)findViewById(R.id.txtTres);
        txtUno4 = (TextView)findViewById(R.id.txtCuatro);



        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim);


      /*  t = (TextView) findViewById(R.id.txtMensaje);
        t.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(TuPersonalidadEs.this, Introduccion.class);
                startActivity(i);
            }

        });*/
      resultado1 = contadoresA_B.getContador_a_1_64();
      resultado2 = contadoresA_B.getContador_b_1_64();
      resultado3 =  contadoresA_B.getContador_a_2_65() + contadoresA_B.getContador_a_3_66();
      resultado4 = contadoresA_B.getContador_b_2_65() + contadoresA_B.getContador_b_3_66();
      resultado5 = contadoresA_B.getContador_a_4_67() + contadoresA_B.getContador_a_5_68();
      resultado6 = contadoresA_B.getContador_b_4_67() + contadoresA_B.getContador_b_5_68();
      resultado7 = contadoresA_B.getContador_a_6_69() + contadoresA_B.getContador_a_7_70();
      resultado8 = contadoresA_B.getContador_b_6_69() + contadoresA_B.getContador_b_7_70();


        if(resultado1>resultado2){
            txtUno1.setText("E");
        }else
            txtUno1.setText("I");

        if(resultado3>resultado4){
            txtUno2.setText("S");
        }else {
            txtUno2.setText("N");
        }
        if(resultado5>resultado6){
            txtUno3.setText("T");
        }else {
            txtUno3.setText("F");
        }
        if(resultado7>resultado8){
            txtUno4.setText("J");
        }else {
            txtUno4.setText("P");
        }
        txtUno1.startAnimation(animation);
        txtUno2.startAnimation(animation);
        txtUno3.startAnimation(animation);
        txtUno4.startAnimation(animation);
    }



}
