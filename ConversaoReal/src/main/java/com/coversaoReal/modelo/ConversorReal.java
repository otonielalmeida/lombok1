package com.coversaoReal.modelo;
import lombok.*;
public class ConversorReal {
    @Setter
    @Getter
    public double valor;


    public void setValor(double valor) {
        this.valor = valor;
    }

    public double valorEuro() {
        return +getValor() / 5.93;
    }

    public double valorDolar() {
        return +getValor() / 5.27;
    }

    public String mostrarDados() {
        return "Valor em Reais" + getValor() +
                "\nValor em Euros" + valorEuro() +
                "\nValor em Dolar" + valorDolar();
    }
}