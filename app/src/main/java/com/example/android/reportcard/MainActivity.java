package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String[] nombresEstudiantes;
    int numEstudiantes;
    int numAsignaturas;
    String[] asignaturas;
    String[][] notas;

    /*
    Métodos que leen los datos de los estudiantes
     */

    /*
    El número de estudiantes de la clase.
     */
    public void NumEstudiantes(int NumEstudiantes) {

        numEstudiantes = NumEstudiantes;
    }

    /*
    El número de asignatuas de cada estudiante
     */
    public void NumAsignaturas(int NumAsignaturas) {

        numAsignaturas = NumAsignaturas;
    }

    /*
    Nombres de los estudiantes
     */

    public void NombresEstudiantes(String[] NombresEstudiantes) {

        for (int i = 0; i < numEstudiantes; i++) {

            nombresEstudiantes[i] = NombresEstudiantes[i];
        }
    }

    /*
    Asignaturas de los estudiantes.
     */
    public void Asignaturas(String[] Asignaturas) {

        for (int i = 0; i < numAsignaturas; i++) {

            asignaturas[i] = Asignaturas[i];
        }

    }

    /*
    Notas de los alumnos en cada asignatura
     */

    public void NotasAlumnos(String[] Notas) {

        for (int i = 0; i < nombresEstudiantes.length; i++) {
            for (int j = 0; j < asignaturas.length; j++) {

                notas[i][j] = Notas[j];
            }

        }

    }
}
