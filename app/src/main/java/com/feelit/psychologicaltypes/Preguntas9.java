package com.feelit.psychologicaltypes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Preguntas9 extends AppCompatActivity {
    Botones boton = new Botones();
    private int contador;
    private int value1;
    private String cadena;
    private String name;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView t;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas9);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
      /*  Bundle bundle = getIntent().getExtras();
       int value = bundle.getInt("contador_a_1_64");
       String cadena = bundle.getString("string");
       */
        t = (TextView) findViewById(R.id.txtMensajeContinuar10);
        t.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {Intent i = new Intent(Preguntas9.this, Preguntas10.class);
                startActivity(i);


            }

        });
      /*  fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    public void onRadioButtonClicked(View view) {

      /*  Bundle bundle = getIntent().getExtras();
        int value1 = bundle.getInt("contador_a_1_64");
        String cadena = bundle.getString("string");
       /* Intent i = getIntent();
        Bundle b = i.getBundleExtra("personB");
        String name=b.getString("nombre");
        System.out.println("Variable pasada3"+ name);
        */

        System.out.println("hola mundo");
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        if (checked == true) {
            System.out.println("Hola mundo");
        }
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        do {
            switch (view.getId()) {
                case R.id.radioButton58a:
                    if (contadoresA_B.getContador_a_1_64() == 1) {
                        contador_a_1_64++;
                        contadoresA_B.setContador_a_1_64(contador_a_1_64 + contadoresA_B.getContador_a_1_64());
                    }else if (contadoresA_B.getContador_a_1_64()==0){
                        contador_a_1_64++;
                        contadoresA_B.setContador_a_1_64(contador_a_1_64);
                    }else if (contadoresA_B.getContador_a_1_64()==2){
                        contador_a_1_64++;
                        contadoresA_B.setContador_a_1_64(contador_a_1_64 + contadoresA_B.getContador_a_1_64());
                    }else if (contadoresA_B.getContador_a_1_64()==3){
                        contador_a_1_64++;
                        contadoresA_B.setContador_a_1_64(contador_a_1_64 + contadoresA_B.getContador_a_1_64());
                    }else if (contadoresA_B.getContador_a_1_64()==4){
                        contador_a_1_64++;
                        contadoresA_B.setContador_a_1_64(contador_a_1_64 + contadoresA_B.getContador_a_1_64());
                    }else if (contadoresA_B.getContador_a_1_64()==5){
                        contador_a_1_64++;
                        contadoresA_B.setContador_a_1_64(contador_a_1_64 + contadoresA_B.getContador_a_1_64());
                    }else if (contadoresA_B.getContador_a_1_64()==6){
                        contador_a_1_64++;
                        contadoresA_B.setContador_a_1_64(contador_a_1_64 + contadoresA_B.getContador_a_1_64());
                    }else if (contadoresA_B.getContador_a_1_64()==7){
                        contador_a_1_64++;
                        contadoresA_B.setContador_a_1_64(contador_a_1_64 + contadoresA_B.getContador_a_1_64());
                    }else if (contadoresA_B.getContador_a_1_64()==8){
                        contador_a_1_64++;
                        contadoresA_B.setContador_a_1_64(contador_a_1_64 + contadoresA_B.getContador_a_1_64());
                    }


                    break;
                case R.id.radioButton58b:

                    if (contadoresA_B.getContador_b_1_64() == 1) {
                        contador_b_1_64++;
                        contadoresA_B.setContador_b_1_64(contador_b_1_64 + contadoresA_B.getContador_b_1_64());
                    }else if (contadoresA_B.getContador_b_1_64()==0){
                        contador_b_1_64++;
                        contadoresA_B.setContador_b_1_64(contador_b_1_64);
                    }else if (contadoresA_B.getContador_b_1_64()==2){
                        contador_b_1_64++;
                        contadoresA_B.setContador_b_1_64(contador_b_1_64 + contadoresA_B.getContador_b_1_64());
                    }else if (contadoresA_B.getContador_b_1_64()==3){
                        contador_b_1_64++;
                        contadoresA_B.setContador_b_1_64(contador_b_1_64 + contadoresA_B.getContador_b_1_64());
                    }else if (contadoresA_B.getContador_b_1_64()==4){
                        contador_b_1_64++;
                        contadoresA_B.setContador_b_1_64(contador_b_1_64 + contadoresA_B.getContador_b_1_64());
                    }else if (contadoresA_B.getContador_b_1_64()==5){
                        contador_b_1_64++;
                        contadoresA_B.setContador_b_1_64(contador_b_1_64 + contadoresA_B.getContador_b_1_64());
                    }else if (contadoresA_B.getContador_b_1_64()==6){
                        contador_b_1_64++;
                        contadoresA_B.setContador_b_1_64(contador_b_1_64 + contadoresA_B.getContador_b_1_64());
                    }else if (contadoresA_B.getContador_b_1_64()==7){
                        contador_b_1_64++;
                        contadoresA_B.setContador_b_1_64(contador_b_1_64 + contadoresA_B.getContador_b_1_64());
                    }else if (contadoresA_B.getContador_b_1_64()==8){
                        contador_b_1_64++;
                        contadoresA_B.setContador_b_1_64(contador_b_1_64 + contadoresA_B.getContador_b_1_64());
                    }
                    break;

                case R.id.radioButton59a:
                    if (contadoresA_B.getContador_a_2_65() == 1) {
                        contador_a_2_65++;
                        contadoresA_B.setContador_a_2_65(contador_a_2_65 + contadoresA_B.getContador_a_2_65());
                    }else if (contadoresA_B.getContador_a_2_65()==0){
                        contador_a_2_65++;
                        contadoresA_B.setContador_a_2_65(contador_a_2_65);
                    }else if (contadoresA_B.getContador_a_2_65()==2){
                        contador_a_2_65++;
                        contadoresA_B.setContador_a_2_65(contador_a_2_65 + contadoresA_B.getContador_a_2_65());
                    }else if (contadoresA_B.getContador_a_2_65()==3){
                        contador_a_2_65++;
                        contadoresA_B.setContador_a_2_65(contador_a_2_65 + contadoresA_B.getContador_a_2_65());
                    }else if (contadoresA_B.getContador_a_2_65()==4){
                        contador_a_2_65++;
                        contadoresA_B.setContador_a_2_65(contador_a_2_65 + contadoresA_B.getContador_a_2_65());
                    }else if (contadoresA_B.getContador_a_2_65()==5){
                        contador_a_2_65++;
                        contadoresA_B.setContador_a_2_65(contador_a_2_65 + contadoresA_B.getContador_a_2_65());
                    }else if (contadoresA_B.getContador_a_2_65()==6){
                        contador_a_2_65++;
                        contadoresA_B.setContador_a_2_65(contador_a_2_65 + contadoresA_B.getContador_a_2_65());
                    }else if (contadoresA_B.getContador_a_2_65()==7){
                        contador_a_2_65++;
                        contadoresA_B.setContador_a_2_65(contador_a_2_65 + contadoresA_B.getContador_a_2_65());
                    }else if (contadoresA_B.getContador_a_2_65()==8){
                        contador_a_2_65++;
                        contadoresA_B.setContador_a_2_65(contador_a_2_65 + contadoresA_B.getContador_a_2_65());
                    }
                    break;
                case R.id.radioButton59b:
                    if (contadoresA_B.getContador_b_2_65() == 1) {
                        contador_b_2_65++;
                        contadoresA_B.setContador_b_2_65(contador_b_2_65 + contadoresA_B.getContador_b_2_65());
                    }else if (contadoresA_B.getContador_b_2_65()==0){
                        contador_b_2_65++;
                        contadoresA_B.setContador_b_2_65(contador_b_2_65);
                    }else if (contadoresA_B.getContador_b_2_65()==2){
                        contador_b_2_65++;
                        contadoresA_B.setContador_b_2_65(contador_b_2_65 + contadoresA_B.getContador_b_2_65());
                    }else if (contadoresA_B.getContador_b_2_65()==3){
                        contador_b_2_65++;
                        contadoresA_B.setContador_b_2_65(contador_b_2_65 + contadoresA_B.getContador_b_2_65());
                    }else if (contadoresA_B.getContador_b_2_65()==4){
                        contador_b_2_65++;
                        contadoresA_B.setContador_b_2_65(contador_b_2_65 + contadoresA_B.getContador_b_2_65());
                    }else if (contadoresA_B.getContador_b_2_65()==5){
                        contador_b_2_65++;
                        contadoresA_B.setContador_b_2_65(contador_b_2_65 + contadoresA_B.getContador_b_2_65());
                    }else if (contadoresA_B.getContador_b_2_65()==6){
                        contador_b_2_65++;
                        contadoresA_B.setContador_b_2_65(contador_b_2_65 + contadoresA_B.getContador_b_2_65());
                    }else if (contadoresA_B.getContador_b_2_65()==7){
                        contador_b_2_65++;
                        contadoresA_B.setContador_b_2_65(contador_b_2_65 + contadoresA_B.getContador_b_2_65());
                    }else if (contadoresA_B.getContador_b_2_65()==8){
                        contador_b_2_65++;
                        contadoresA_B.setContador_b_2_65(contador_b_2_65 + contadoresA_B.getContador_b_2_65());
                    }
                    break;
                case R.id.radioButton60a:
                    if (contadoresA_B.getContador_a_3_66() == 1) {
                        contador_a_3_66++;
                        contadoresA_B.setContador_a_3_66(contador_a_3_66 + contadoresA_B.getContador_a_3_66());
                    }else if (contadoresA_B.getContador_a_3_66()==0){
                        contador_a_3_66++;
                        contadoresA_B.setContador_a_3_66(contador_a_3_66);
                    }else if (contadoresA_B.getContador_a_3_66()==2){
                        contador_a_3_66++;
                        contadoresA_B.setContador_a_3_66(contador_a_3_66 + contadoresA_B.getContador_a_3_66());
                    }else if (contadoresA_B.getContador_a_3_66()==3){
                        contador_a_3_66++;
                        contadoresA_B.setContador_a_3_66(contador_a_3_66 + contadoresA_B.getContador_a_3_66());
                    }else if (contadoresA_B.getContador_a_3_66()==4){
                        contador_a_3_66++;
                        contadoresA_B.setContador_a_3_66(contador_a_3_66 + contadoresA_B.getContador_a_3_66());
                    }else if (contadoresA_B.getContador_a_3_66()==5){
                        contador_a_3_66++;
                        contadoresA_B.setContador_a_3_66(contador_a_3_66 + contadoresA_B.getContador_a_3_66());
                    }else if (contadoresA_B.getContador_a_3_66()==6){
                        contador_a_3_66++;
                        contadoresA_B.setContador_a_3_66(contador_a_3_66 + contadoresA_B.getContador_a_3_66());
                    }else if (contadoresA_B.getContador_a_3_66()==7){
                        contador_a_3_66++;
                        contadoresA_B.setContador_a_3_66(contador_a_3_66 + contadoresA_B.getContador_a_3_66());
                    }else if (contadoresA_B.getContador_a_3_66()==8){
                        contador_a_3_66++;
                        contadoresA_B.setContador_a_3_66(contador_a_3_66 + contadoresA_B.getContador_a_3_66());
                    }
                    break;
                case R.id.radioButton60b:
                    if (contadoresA_B.getContador_b_3_66() == 1) {
                        contador_b_3_66++;
                        contadoresA_B.setContador_b_3_66(contador_b_3_66 + contadoresA_B.getContador_b_3_66());
                    }else if (contadoresA_B.getContador_b_3_66()==0){
                        contador_b_3_66++;
                        contadoresA_B.setContador_b_3_66(contador_b_3_66);
                    }else if (contadoresA_B.getContador_b_3_66()==2) {
                        contador_b_3_66++;
                        contadoresA_B.setContador_b_3_66(contador_b_3_66 + contadoresA_B.getContador_b_3_66());
                    }else if (contadoresA_B.getContador_b_3_66()==3) {
                        contador_b_3_66++;
                        contadoresA_B.setContador_b_3_66(contador_b_3_66 + contadoresA_B.getContador_b_3_66());
                    }else if (contadoresA_B.getContador_b_3_66()==4) {
                        contador_b_3_66++;
                        contadoresA_B.setContador_b_3_66(contador_b_3_66 + contadoresA_B.getContador_b_3_66());
                    }else if (contadoresA_B.getContador_b_3_66()==5) {
                        contador_b_3_66++;
                        contadoresA_B.setContador_b_3_66(contador_b_3_66 + contadoresA_B.getContador_b_3_66());
                    }else if (contadoresA_B.getContador_b_3_66()==6) {
                        contador_b_3_66++;
                        contadoresA_B.setContador_b_3_66(contador_b_3_66 + contadoresA_B.getContador_b_3_66());
                    }else if (contadoresA_B.getContador_b_3_66()==7) {
                        contador_b_3_66++;
                        contadoresA_B.setContador_b_3_66(contador_b_3_66 + contadoresA_B.getContador_b_3_66());
                    }else if (contadoresA_B.getContador_b_3_66()==8) {
                        contador_b_3_66++;
                        contadoresA_B.setContador_b_3_66(contador_b_3_66 + contadoresA_B.getContador_b_3_66());
                    }
                    break;
                case R.id.radioButton61a:
                    if (contadoresA_B.getContador_a_4_67() == 1) {
                        contador_a_4_67++;
                        contadoresA_B.setContador_a_4_67(contador_a_4_67 + contadoresA_B.getContador_a_4_67());
                    }else if (contadoresA_B.getContador_a_4_67()==0){
                        contador_a_4_67++;
                        contadoresA_B.setContador_a_4_67(contador_a_4_67);
                    }else if (contadoresA_B.getContador_a_4_67()==2) {
                        contador_a_4_67++;
                        contadoresA_B.setContador_a_4_67(contador_a_4_67 + contadoresA_B.getContador_a_4_67());
                    }else if (contadoresA_B.getContador_a_4_67()==3) {
                        contador_a_4_67++;
                        contadoresA_B.setContador_a_4_67(contador_a_4_67 + contadoresA_B.getContador_a_4_67());
                    }else if (contadoresA_B.getContador_a_4_67()==4) {
                        contador_a_4_67++;
                        contadoresA_B.setContador_a_4_67(contador_a_4_67 + contadoresA_B.getContador_a_4_67());
                    }else if (contadoresA_B.getContador_a_4_67()==5) {
                        contador_a_4_67++;
                        contadoresA_B.setContador_a_4_67(contador_a_4_67 + contadoresA_B.getContador_a_4_67());
                    }else if (contadoresA_B.getContador_a_4_67()==6) {
                        contador_a_4_67++;
                        contadoresA_B.setContador_a_4_67(contador_a_4_67 + contadoresA_B.getContador_a_4_67());
                    }else if (contadoresA_B.getContador_a_4_67()==7) {
                        contador_a_4_67++;
                        contadoresA_B.setContador_a_4_67(contador_a_4_67 + contadoresA_B.getContador_a_4_67());
                    }else if (contadoresA_B.getContador_a_4_67()==8) {
                        contador_a_4_67++;
                        contadoresA_B.setContador_a_4_67(contador_a_4_67 + contadoresA_B.getContador_a_4_67());
                    }
                    break;
                case R.id.radioButton61b:
                    if (contadoresA_B.getContador_b_4_67() == 1) {
                        contador_b_4_67++;
                        contadoresA_B.setContador_b_4_67(contador_b_4_67 + contadoresA_B.getContador_b_4_67());
                    }else if (contadoresA_B.getContador_b_4_67()==0){
                        contador_b_4_67++;
                        contadoresA_B.setContador_b_4_67(contador_b_4_67);
                    }else if (contadoresA_B.getContador_b_4_67()==2){
                        contador_b_4_67++;
                        contadoresA_B.setContador_b_4_67(contador_b_4_67 + contadoresA_B.getContador_b_4_67());
                    }else if (contadoresA_B.getContador_b_4_67()==3){
                        contador_b_4_67++;
                        contadoresA_B.setContador_b_4_67(contador_b_4_67 + contadoresA_B.getContador_b_4_67());
                    }else if (contadoresA_B.getContador_b_4_67()==4){
                        contador_b_4_67++;
                        contadoresA_B.setContador_b_4_67(contador_b_4_67 + contadoresA_B.getContador_b_4_67());
                    }else if (contadoresA_B.getContador_b_4_67()==5){
                        contador_b_4_67++;
                        contadoresA_B.setContador_b_4_67(contador_b_4_67 + contadoresA_B.getContador_b_4_67());
                    }else if (contadoresA_B.getContador_b_4_67()==6){
                        contador_b_4_67++;
                        contadoresA_B.setContador_b_4_67(contador_b_4_67 + contadoresA_B.getContador_b_4_67());
                    }else if (contadoresA_B.getContador_b_4_67()==7){
                        contador_b_4_67++;
                        contadoresA_B.setContador_b_4_67(contador_b_4_67 + contadoresA_B.getContador_b_4_67());
                    }else if (contadoresA_B.getContador_b_4_67()==8){
                        contador_b_4_67++;
                        contadoresA_B.setContador_b_4_67(contador_b_4_67 + contadoresA_B.getContador_b_4_67());
                    }
                    break;
                case R.id.radioButton62a:
                    if (contadoresA_B.getContador_a_5_68() == 1) {
                        contador_a_5_68++;
                        contadoresA_B.setContador_a_5_68(contador_a_5_68 + contadoresA_B.getContador_a_5_68());
                    }else if (contadoresA_B.getContador_a_5_68()==0){
                        contador_a_5_68++;
                        contadoresA_B.setContador_a_5_68(contador_a_5_68);
                    }else if (contadoresA_B.getContador_a_5_68()==2){
                        contador_a_5_68++;
                        contadoresA_B.setContador_a_5_68(contador_a_5_68 + contadoresA_B.getContador_a_5_68());
                    }else if (contadoresA_B.getContador_a_5_68()==3){
                        contador_a_5_68++;
                        contadoresA_B.setContador_a_5_68(contador_a_5_68 + contadoresA_B.getContador_a_5_68());
                    }else if (contadoresA_B.getContador_a_5_68()==4){
                        contador_a_5_68++;
                        contadoresA_B.setContador_a_5_68(contador_a_5_68 + contadoresA_B.getContador_a_5_68());
                    }else if (contadoresA_B.getContador_a_5_68()==5){
                        contador_a_5_68++;
                        contadoresA_B.setContador_a_5_68(contador_a_5_68 + contadoresA_B.getContador_a_5_68());
                    }else if (contadoresA_B.getContador_a_5_68()==6){
                        contador_a_5_68++;
                        contadoresA_B.setContador_a_5_68(contador_a_5_68 + contadoresA_B.getContador_a_5_68());
                    }else if (contadoresA_B.getContador_a_5_68()==7){
                        contador_a_5_68++;
                        contadoresA_B.setContador_a_5_68(contador_a_5_68 + contadoresA_B.getContador_a_5_68());
                    }else if (contadoresA_B.getContador_a_5_68()==8){
                        contador_a_5_68++;
                        contadoresA_B.setContador_a_5_68(contador_a_5_68 + contadoresA_B.getContador_a_5_68());
                    }
                    break;
                case R.id.radioButton62b:
                    if (contadoresA_B.getContador_b_5_68() == 1) {
                        contador_b_5_68++;
                        contadoresA_B.setContador_b_5_68(contador_b_5_68 + contadoresA_B.getContador_b_5_68());
                    }else if (contadoresA_B.getContador_b_5_68()==0){
                        contador_b_5_68++;
                        contadoresA_B.setContador_b_5_68(contador_b_5_68);
                    }else if (contadoresA_B.getContador_b_5_68()==2){
                        contador_b_5_68++;
                        contadoresA_B.setContador_b_5_68(contador_b_5_68 + contadoresA_B.getContador_b_5_68());
                    }else if (contadoresA_B.getContador_b_5_68()==3){
                        contador_b_5_68++;
                        contadoresA_B.setContador_b_5_68(contador_b_5_68 + contadoresA_B.getContador_b_5_68());
                    }else if (contadoresA_B.getContador_b_5_68()==4){
                        contador_b_5_68++;
                        contadoresA_B.setContador_b_5_68(contador_b_5_68 + contadoresA_B.getContador_b_5_68());
                    }else if (contadoresA_B.getContador_b_5_68()==5){
                        contador_b_5_68++;
                        contadoresA_B.setContador_b_5_68(contador_b_5_68 + contadoresA_B.getContador_b_5_68());
                    }else if (contadoresA_B.getContador_b_5_68()==6){
                        contador_b_5_68++;
                        contadoresA_B.setContador_b_5_68(contador_b_5_68 + contadoresA_B.getContador_b_5_68());
                    }else if (contadoresA_B.getContador_b_5_68()==7){
                        contador_b_5_68++;
                        contadoresA_B.setContador_b_5_68(contador_b_5_68 + contadoresA_B.getContador_b_5_68());
                    }else if (contadoresA_B.getContador_b_5_68()==8){
                        contador_b_5_68++;
                        contadoresA_B.setContador_b_5_68(contador_b_5_68 + contadoresA_B.getContador_b_5_68());
                    }
                    break;
                case R.id.radioButton63a:
                    if (contadoresA_B.getContador_a_6_69() == 1) {
                        contador_a_6_69++;
                        contadoresA_B.setContador_a_6_69(contador_a_6_69 + contadoresA_B.getContador_a_6_69());
                    }else if (contadoresA_B.getContador_a_6_69()==0){
                        contador_a_6_69++;
                        contadoresA_B.setContador_a_6_69(contador_a_6_69);
                    }else if (contadoresA_B.getContador_a_6_69()==2){
                        contador_a_6_69++;
                        contadoresA_B.setContador_a_6_69(contador_a_6_69 + contadoresA_B.getContador_a_6_69());
                    }else if (contadoresA_B.getContador_a_6_69()==3){
                        contador_a_6_69++;
                        contadoresA_B.setContador_a_6_69(contador_a_6_69 + contadoresA_B.getContador_a_6_69());
                    }else if (contadoresA_B.getContador_a_6_69()==4){
                        contador_a_6_69++;
                        contadoresA_B.setContador_a_6_69(contador_a_6_69 + contadoresA_B.getContador_a_6_69());
                    }else if (contadoresA_B.getContador_a_6_69()==5){
                        contador_a_6_69++;
                        contadoresA_B.setContador_a_6_69(contador_a_6_69 + contadoresA_B.getContador_a_6_69());
                    }else if (contadoresA_B.getContador_a_6_69()==6){
                        contador_a_6_69++;
                        contadoresA_B.setContador_a_6_69(contador_a_6_69 + contadoresA_B.getContador_a_6_69());
                    }else if (contadoresA_B.getContador_a_6_69()==7){
                        contador_a_6_69++;
                        contadoresA_B.setContador_a_6_69(contador_a_6_69 + contadoresA_B.getContador_a_6_69());
                    }else if (contadoresA_B.getContador_a_6_69()==8){
                        contador_a_6_69++;
                        contadoresA_B.setContador_a_6_69(contador_a_6_69 + contadoresA_B.getContador_a_6_69());
                    }
                    break;
                case R.id.radioButton63b:
                    if (contadoresA_B.getContador_b_6_69() == 1) {
                        contador_b_6_69++;
                        contadoresA_B.setContador_b_6_69(contador_b_6_69 + contadoresA_B.getContador_b_6_69());
                    }else if (contadoresA_B.getContador_b_6_69()==0){
                        contador_b_6_69++;
                        contadoresA_B.setContador_b_6_69(contador_b_6_69);
                    }else if (contadoresA_B.getContador_b_6_69()==2){
                        contador_b_6_69++;
                        contadoresA_B.setContador_b_6_69(contador_b_6_69 + contadoresA_B.getContador_b_6_69());
                    }else if (contadoresA_B.getContador_b_6_69()==3){
                        contador_b_6_69++;
                        contadoresA_B.setContador_b_6_69(contador_b_6_69 + contadoresA_B.getContador_b_6_69());
                    }else if (contadoresA_B.getContador_b_6_69()==4){
                        contador_b_6_69++;
                        contadoresA_B.setContador_b_6_69(contador_b_6_69 + contadoresA_B.getContador_b_6_69());
                    }else if (contadoresA_B.getContador_b_6_69()==5){
                        contador_b_6_69++;
                        contadoresA_B.setContador_b_6_69(contador_b_6_69 + contadoresA_B.getContador_b_6_69());
                    }else if (contadoresA_B.getContador_b_6_69()==6){
                        contador_b_6_69++;
                        contadoresA_B.setContador_b_6_69(contador_b_6_69 + contadoresA_B.getContador_b_6_69());
                    }else if (contadoresA_B.getContador_b_6_69()==7){
                        contador_b_6_69++;
                        contadoresA_B.setContador_b_6_69(contador_b_6_69 + contadoresA_B.getContador_b_6_69());
                    }else if (contadoresA_B.getContador_b_6_69()==8){
                        contador_b_6_69++;
                        contadoresA_B.setContador_b_6_69(contador_b_6_69 + contadoresA_B.getContador_b_6_69());
                    }
                    break;
                case R.id.radioButton64a:
                    if (contadoresA_B.getContador_a_7_70() == 1) {
                        contador_a_7_70++;
                        contadoresA_B.setContador_a_7_70(contador_a_7_70 + contadoresA_B.getContador_a_7_70());
                    }else if (contadoresA_B.getContador_a_7_70()==0){
                        contador_a_7_70++;
                        contadoresA_B.setContador_a_7_70(contador_a_7_70);
                    }else if (contadoresA_B.getContador_a_7_70()==2){
                        contador_a_7_70++;
                        contadoresA_B.setContador_a_7_70(contador_a_7_70 + contadoresA_B.getContador_a_7_70());
                    }else if (contadoresA_B.getContador_a_7_70()==3){
                        contador_a_7_70++;
                        contadoresA_B.setContador_a_7_70(contador_a_7_70 + contadoresA_B.getContador_a_7_70());
                    }else if (contadoresA_B.getContador_a_7_70()==4){
                        contador_a_7_70++;
                        contadoresA_B.setContador_a_7_70(contador_a_7_70 + contadoresA_B.getContador_a_7_70());
                    }else if (contadoresA_B.getContador_a_7_70()==5){
                        contador_a_7_70++;
                        contadoresA_B.setContador_a_7_70(contador_a_7_70 + contadoresA_B.getContador_a_7_70());
                    }else if (contadoresA_B.getContador_a_7_70()==6){
                        contador_a_7_70++;
                        contadoresA_B.setContador_a_7_70(contador_a_7_70 + contadoresA_B.getContador_a_7_70());
                    }else if (contadoresA_B.getContador_a_7_70()==7){
                        contador_a_7_70++;
                        contadoresA_B.setContador_a_7_70(contador_a_7_70 + contadoresA_B.getContador_a_7_70());
                    }else if (contadoresA_B.getContador_a_7_70()==8){
                        contador_a_7_70++;
                        contadoresA_B.setContador_a_7_70(contador_a_7_70 + contadoresA_B.getContador_a_7_70());
                    }
                    break;
                case R.id.radioButton64b:
                    if (contadoresA_B.getContador_b_7_70() == 1) {
                        contador_b_7_70++;
                        contadoresA_B.setContador_b_7_70(contador_b_7_70 + contadoresA_B.getContador_b_7_70());
                    }else if (contadoresA_B.getContador_b_7_70()==0){
                        contador_b_7_70++;
                        contadoresA_B.setContador_b_7_70(contador_b_7_70);
                    }else if (contadoresA_B.getContador_b_7_70()==2){
                        contador_b_7_70++;
                        contadoresA_B.setContador_b_7_70(contador_b_7_70 + contadoresA_B.getContador_b_7_70());
                    }else if (contadoresA_B.getContador_b_7_70()==3){
                        contador_b_7_70++;
                        contadoresA_B.setContador_b_7_70(contador_b_7_70 + contadoresA_B.getContador_b_7_70());
                    }else if (contadoresA_B.getContador_b_7_70()==4){
                        contador_b_7_70++;
                        contadoresA_B.setContador_b_7_70(contador_b_7_70 + contadoresA_B.getContador_b_7_70());
                    }else if (contadoresA_B.getContador_b_7_70()==5){
                        contador_b_7_70++;
                        contadoresA_B.setContador_b_7_70(contador_b_7_70 + contadoresA_B.getContador_b_7_70());
                    }else if (contadoresA_B.getContador_b_7_70()==6){
                        contador_b_7_70++;
                        contadoresA_B.setContador_b_7_70(contador_b_7_70 + contadoresA_B.getContador_b_7_70());
                    }else if (contadoresA_B.getContador_b_7_70()==7){
                        contador_b_7_70++;
                        contadoresA_B.setContador_b_7_70(contador_b_7_70 + contadoresA_B.getContador_b_7_70());
                    }else if (contadoresA_B.getContador_b_7_70()==8){
                        contador_b_7_70++;
                        contadoresA_B.setContador_b_7_70(contador_b_7_70 + contadoresA_B.getContador_b_7_70());
                    }
                    break;
            }
        } while (false);


    }
}
