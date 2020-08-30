package com.feelit.psychologicaltypes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.feelit.psychologicaltypes.Botones;
import com.feelit.psychologicaltypes.contadoresA_B;

import org.w3c.dom.Text;

import static com.feelit.psychologicaltypes.R.layout.activity_preguntas2;


public class Preguntas extends AppCompatActivity {
    Botones boton = new Botones();
    //private int contador=0;
    private int contador_a_1_64;
    private int contador_b_1_64;
    private int contador_a_2_65;
    private int contador_b_2_65;
    private int contador_a_3_66;
    private int contador_b_3_66;
    private int contador_a_4_67;
    private int contador_b_4_67;
    private int contador_a_5_68;
    private int contador_b_5_68;
    private int contador_a_6_69;
    private int contador_b_6_69;
    private int contador_a_7_70;
    private int contador_b_7_70;
    private int contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView t;

        System.out.println("Hola mundo");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        //setContentView(activity_preguntas2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        t = (TextView) findViewById(R.id.txtMensajeContinuar2);
        t.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(Preguntas.this, Preguntas2.class);
                i.putExtra("contador_a_1_64", contadoresA_B.getContador_a_1_64());
                i.putExtra("string", "contadoresA_B.getContador_a_1_64()");

               /* Bundle b = new Bundle();
                b.putString("nombre","kenny");
                i.putExtra("personB",b);
                */
                startActivity(i);

            }

        });

      }


    public void onRadioButtonClicked (View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        if (checked == true) {
            System.out.println("Hola mundo");
        }
        AlertDialog.Builder alert = new AlertDialog.Builder(this);



        // Check which radio button was clicked
        do {
                switch (view.getId()) {

                case R.id.radioButton1a:
                    if (contadoresA_B.getContador_a_1_64()== 0) {
                        contador_a_1_64++;
                        contadoresA_B.setContador_a_1_64(contador_a_1_64);
                    }
                        break;
                case R.id.radioButton1b:
                    if (contadoresA_B.getContador_b_1_64() == 0) {
                        contador_b_1_64++;
                        contadoresA_B.setContador_b_1_64(contador_b_1_64);
                    }
                    break;
                case R.id.radioButton2a:
                    if (contadoresA_B.getContador_a_2_65() == 0) {
                        contador_a_2_65++;
                        contadoresA_B.setContador_a_2_65(contador_a_2_65);
                    }
                    break;
                case R.id.radioButton2b:
                    if (contadoresA_B.getContador_b_2_65() == 0) {
                        contador_b_2_65++;
                        contadoresA_B.setContador_a_2_65(contador_b_2_65);
                    }
                    break;
                case R.id.radioButton3a:
                    if (contadoresA_B.getContador_a_3_66() == 0) {
                        contador_a_3_66++;
                        contadoresA_B.setContador_a_3_66(contador_a_3_66);
                    }
                    break;
                case R.id.radioButton3b:
                    if (contadoresA_B.getContador_b_3_66() == 0) {
                        contador_b_3_66++;
                        contadoresA_B.setContador_b_3_66(contador_b_3_66);
                    }
                    break;
                case R.id.radioButton4a:
                    if (contadoresA_B.getContador_a_4_67() == 0) {
                        contador_a_4_67++;
                        contadoresA_B.setContador_a_4_67(contador_a_4_67);
                    }
                    break;
                case R.id.radioButton4b:
                    if (contadoresA_B.getContador_b_4_67() == 0) {
                        contador_b_4_67++;
                        contadoresA_B.setContador_b_4_67(contador_b_4_67);
                    }
                    break;
                case R.id.radioButton5a:
                    if (contadoresA_B.getContador_a_5_68() == 0) {
                        contador_a_5_68++;
                        contadoresA_B.setContador_a_5_68(contador_a_5_68);
                    }
                    break;
                case R.id.radioButton5b:
                    if (contadoresA_B.getContador_b_5_68() == 0) {
                        contador_b_5_68++;
                        contadoresA_B.setContador_b_5_68(contador_b_5_68);
                    }
                    break;
                case R.id.radioButton6a:
                    if (contadoresA_B.getContador_a_6_69() == 0) {
                        contador_a_6_69++;
                        contadoresA_B.setContador_a_6_69(contador_a_6_69);
                    }
                    break;
                case R.id.radioButton6b:
                    if (contadoresA_B.getContador_b_6_69() == 0) {
                        contador_b_6_69++;
                        contadoresA_B.setContador_b_6_69(contador_b_6_69);
                    }
                    break;
                case R.id.radioButton7a:
                    if (contadoresA_B.getContador_a_7_70() == 0) {
                        contador_a_7_70++;
                        contadoresA_B.setContador_a_7_70(contador_a_7_70);
                    }
                    break;
                case R.id.radioButton7b:
                    if (contadoresA_B.getContador_b_7_70() == 0) {
                        contador_b_7_70++;
                        contadoresA_B.setContador_b_7_70(contador_b_7_70);
                    }
                    break;
            }
        } while (false);
        System.out.println(contadoresA_B.getContador_a_1_64());
        System.out.println(contadoresA_B.getContador_b_7_70());
        System.out.println(checked);
        System.out.println(contador);


    }


}
