package cibertec.edu.DSWII_CL1_Isaias_Capistrano.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estacionamiento")
public class UEstaconomientoController {
    @GetMapping("/calcular")
    public double calcularPago(@RequestParam int horas, @RequestParam int minutos) {
        double tarifaxhora = 1.5;
        double totalhoras = horas + (minutos > 0 ? 1:0);
        return totalhoras * tarifaxhora;
    }
}
