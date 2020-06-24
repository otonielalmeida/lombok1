package com.coversaoReal.controle;

import com.coversaoReal.modelo.ConversorReal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {
    @GetMapping("conversor")
    public String mensagem(){
        ConversorReal c = new ConversorReal();
        c.setValor(1);
        return c.mostrarDados();
    }

}
