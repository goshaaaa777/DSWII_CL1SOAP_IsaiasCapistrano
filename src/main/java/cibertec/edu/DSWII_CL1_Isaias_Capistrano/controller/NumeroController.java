package cibertec.edu.DSWII_CL1_Isaias_Capistrano.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/numeros")
public class NumeroController {
    @GetMapping("/paresDecendentes")
    public List<Integer> obtenerParecesDescendentes(){
        List<Integer> numerosPares = new ArrayList<>();
        for (int i = 20; i >=10; i--) {
            if (i % 2 == 0) {
                numerosPares.add(i);
            }
        }
        return numerosPares;
    }

}
