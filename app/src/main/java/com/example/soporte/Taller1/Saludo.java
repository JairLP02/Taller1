package com.example.soporte.Taller1;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {

    private TextView mostrar;
    private Bundle b;
    private String nomb1, nomb2, apell1, apell2, edad, sexo,aux;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        mostrar = (TextView)findViewById(R.id.txtSaludo);
        b = getIntent().getExtras();
        nomb1 = b.getString("Nombre1");
        nomb2 = b.getString("Nombre2");
        apell1 = b.getString("Apellido1");
        apell2 = b.getString("Apellido2");
        edad = b.getString("Edad");
        sexo = b.getString("Sexo");

        res = this.getResources();

        aux = res.getString(R.string.saludo)+" "+nomb1+" "+nomb2+" "+apell1+" "+apell2+" "+res.getString(R.string.saludo2)+" "+edad+" "+res.getString(R.string.saludo3)+" "+sexo;
        mostrar.setText(aux);

    }
}
