package com.mycompany.figura.abstrata;

public class Quadrado extends Figura {

    private Double lado;

    public Quadrado(Double lado, String cor, Integer espessura) {
        super(cor, espessura);
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", lado=" + lado + " area=" + calcularArea() + "}";
    }

}
