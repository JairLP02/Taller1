package com.example.soporte.Taller1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;


public class Principal extends AppCompatActivity {

    private EditText cajaNombre1;
    private EditText cajaNombre2;
    private EditText cajaApellido1;
    private EditText cajaApellido2;
    private EditText cajaEdad;
    private EditText cajaSexo;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        cajaNombre1 = (EditText)findViewById(R.id.txtNombre1);
        cajaNombre2 = (EditText)findViewById(R.id.txtNombre2);
        cajaApellido1 = (EditText)findViewById(R.id.txtApelli);
        cajaApellido2 = (EditText) findViewById(R.id.txtapelli2);
        cajaEdad = (EditText) findViewById(R.id.txtEdad);
        cajaSexo = (EditText) findViewById(R.id.txtSexo);
        i = new Intent(this,Saludo.class);
        b = new Bundle();
    }


    public void saludar(View v){
        String nomb1, nomb2, apell1, apell2, edad, sexo;
      if(validar()) {
            nomb1 = cajaNombre1.getText().toString();
            nomb2 = cajaNombre2.getText().toString();
            apell1 = cajaApellido1.getText().toString();
            apell2 = cajaApellido2.getText().toString();
            edad = cajaEdad.getText().toString();
            sexo = cajaEdad.getText().toString();


            b.putString("Nombre1", nomb1);
            b.putString("Nombre2", nomb2);
            b.putString("Apellido1", apell1);
            b.putString("Apellido2", apell2);
            b.putString("Edad", edad);
            b.putString("Sexo", sexo);
            i.putExtras(b);
            startActivity(i);
        }
    }
    public void borrar (View b){
        cajaNombre1.setText(" ");
        cajaNombre2.setText(" ");
        cajaApellido1.setText(" ");
        cajaApellido2.setText(" ");
        cajaEdad.setText(" ");
        cajaSexo.setText(" ");
    }

    public boolean validar(){
        if(cajaNombre1.getText().toString().isEmpty()){
           cajaNombre1.setError(getResources().getString(R.string.error1));
            return false;
        }
       if (cajaNombre2.getText().toString().isEmpty()){
           cajaNombre2.setError(getResources().getString(R.string.error2));
          return false;
        }
        if(cajaApellido1.getText().toString().isEmpty()){
            cajaApellido1.setError(getResources().getString(R.string.error3));
            return false;
        }
        if (cajaApellido2.getText().toString().isEmpty()){
            cajaApellido2.setError(getResources().getString(R.string.error4));
            return false;
        }
        if(cajaEdad.getText().toString().isEmpty()){
            cajaEdad.setError(getResources().getString(R.string.error5));
            return false;
        }
        if(cajaSexo.getText().toString().isEmpty()){
            cajaEdad.setError(getResources().getString(R.string.error6));
            return false;
        }
        return true;
    }
}















