package com.isil.apptareaencapsulamiento.ENTIDADES;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.isil.apptareaencapsulamiento.Enums.EstadoCivil;
import com.isil.apptareaencapsulamiento.Enums.Sexo;

import java.util.concurrent.ThreadLocalRandom;


public class Empleado {
    private String nombre;
    private String apellido;
    private Sexo genero;
    private EstadoCivil estadoCivil;
    private String sexo;
    private String  estado;
    private String mujer="mujer";
    private String hombre="hombre";
    private String casado="casado";
    private String soltero="soltero";
    private String titulo = "", msg = "";


    public Empleado(String nombre, String apellido, Sexo genero, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.estadoCivil = estadoCivil;

    }

    public Empleado(String nombre, String apellido, String sexo, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.estado = estado;

    }

    public String SubStringNom() {
        return nombre.substring(0, 2);
    }

    public String SubStringApell() {
        return apellido.substring(0, 2);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public int generador() {
        return ThreadLocalRandom.current().nextInt(100, 999);
    }


    private String Asignacion() {
        if (estadoCivil == EstadoCivil.casado && genero == Sexo.mujer) titulo = "La Sra. ";
        else if (estadoCivil == EstadoCivil.soltero && genero == Sexo.mujer) titulo = "La Srta. ";
        else titulo = "El Sr. ";
        return titulo;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public String MostrarInfo () {
        return msg = Asignacion() + " " + nombre + " " + apellido + " tiene un numero de \n" +
                        "empleado el cual es " + SubStringNom()+SubStringApell()+generador();
    }
}










