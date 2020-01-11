package com.isil.apptareaencapsulamiento.ACTIVIDADES;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.isil.apptareaencapsulamiento.ENTIDADES.Empleado;
import com.isil.apptareaencapsulamiento.Enums.EstadoCivil;
import com.isil.apptareaencapsulamiento.Enums.Sexo;
import com.isil.apptareaencapsulamiento.R;

public class MainActivity extends AppCompatActivity {
    TextView txt,txt2;
    RadioGroup radioGroupSexo,radioGroupGenero;
    EditText nombre,apellido;
    String sexo,genero;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);

        txt2=findViewById(R.id.txt2);
        nombre=findViewById(R.id.txtNombre);
        apellido=findViewById(R.id.txtApellido);
        radioGroupGenero=findViewById(R.id.rgEstado);
        radioGroupSexo=findViewById(R.id.rgSexo);

        Empleado emp1=new Empleado("Maria","Sanchez", Sexo.mujer, EstadoCivil.soltero);

        txt.setText(emp1.MostrarInfo());

    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void Mostrar(View view){
        genero = radioGroupGenero.toString();
        sexo = radioGroupSexo.toString();


        Empleado empl2=new Empleado(nombre.getText().toString(),apellido.getText().toString(),sexo,genero);

        txt2.setText(empl2.MostrarInfo());
        Limpiar();
    }

    void Limpiar(){
        nombre.setText("");
        apellido.setText("");
        radioGroupGenero.clearCheck();
        radioGroupSexo.clearCheck();
    }
}