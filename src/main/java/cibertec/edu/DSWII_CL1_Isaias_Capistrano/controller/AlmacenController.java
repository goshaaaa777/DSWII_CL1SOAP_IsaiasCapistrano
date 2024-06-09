package cibertec.edu.DSWII_CL1_Isaias_Capistrano.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/almacen")
public class AlmacenController {

@GetMapping("/calcularDescuento")
public double calcularDescuento(@RequestParam double cantidad, @RequestParam double pUnitario){
    double total = cantidad +pUnitario;
    if (total > 200) {
        total *= 0.8;
    }
    return total;
  }
}