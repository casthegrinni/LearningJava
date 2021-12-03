package com.mycompany.figura.abstrata;

public class Retangulo extends Figura {

    private Double base;
    private Double altura;

    public Retangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return super.toString() + ", base=" + base + ", altura=" + altura + " area=" + calcularArea() + "}";
    }

}
