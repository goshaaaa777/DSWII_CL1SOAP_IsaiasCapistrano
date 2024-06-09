package cibertec.edu.DSWII_CL1_Isaias_Capistrano.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ualumno")
public class UAlumnoController {

    @PostMapping("/calcularPromedio")
    public double calculaPromedi(@RequestBody double[] calificaciones) {
        if(calificaciones.length != 4) {
            throw new IllegalArgumentException("Ingresar 4 calificaciones para calcular el promedio!");
        }
        double menorCalificacion = calificaciones[0];
        int imenorCalificacion = 0;
        for(int  i = 1; i < calificaciones.length; i++){
            if (calificaciones[i] < menorCalificacion){
                menorCalificacion = calificaciones[i];
                imenorCalificacion = i;
            }
        }
        double[] calificacionavg = new double[3];
                int index = 0;
        for (int i = 0; i < calificaciones.length; i++){
            if(i != imenorCalificacion){
                calificacionavg[index++] = calificaciones[i];
            }
        }
        return calificacionavg[0] * 0.2 +calificacionavg[1] * 0.3 +calificacionavg[2] * 0.5;

    }
}
