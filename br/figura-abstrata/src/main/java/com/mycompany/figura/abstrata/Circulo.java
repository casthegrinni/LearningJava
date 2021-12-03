package com.mycompany.figura.abstrata;

public class Circulo extends Figura {

    private Double raio;

    public Circulo(String cor, Integer espessura, Double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", raio=" + raio + " area=" + calcularArea() + "}";
    }

}
