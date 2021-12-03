package com.mycompany.figura.abstrata;

public class App {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(20.0, "Vermelho", 5);
        Retangulo retangulo = new Retangulo("Azul", 5, 12.0, 20.0);
        Triangulo triangulo = new Triangulo("Amarelo", 8, 12.0, 12.0);
        Circulo circulo = new Circulo("Roxo", 30, 15.0);

        System.out.println(String.format("Area do quadrado: %.2f", quadrado.calcularArea()));
        System.out.println(String.format("Area do Retangulo: %.2f", retangulo.calcularArea()));
        System.out.println(String.format("Area do triangulo: %.2f", triangulo.calcularArea()));
        System.out.println(String.format("Area do círculo: %.2f", circulo.calcularArea()));

        Imagem imagem = new Imagem();
        imagem.adicionarFigura(quadrado);
        imagem.adicionarFigura(retangulo);
        imagem.adicionarFigura(triangulo);
        imagem.adicionarFigura(circulo);

        imagem.exibirFiguras();
        imagem.exibeFiguraAreaMaiorQue200();
        imagem.exibeQuadrado();
        imagem.exibeSomaArea();
    }
    
}
