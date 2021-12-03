package com.mycompany.figura.abstrata;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    List<Figura> figuras;

    public Imagem() {
        figuras = new ArrayList<>();
    }

    public void adicionarFigura(Figura f) {
        figuras.add(f);
    }

    public void exibirFiguras() {
        System.out.println("Figuras: \n" + figuras + "\n");
    }

    public void exibeSomaArea() {
        Double total = 0.0;

        for (Figura f : figuras) {
            total += f.calcularArea();
        }

        System.out.println("Total de area das figuras: " + total);
    }

    public void exibeFiguraAreaMaiorQue200() {
        System.out.println("Figuras com area maior que 200");
        for (Figura f : figuras) {
            if (f.calcularArea() > 200) {
                System.out.println(f);
            }
        }
    }

    public void exibeQuadrado() {
        System.out.println("Exibindo quadrados");
        for (Figura f : figuras) {
            if (f instanceof Quadrado) {
                System.out.println(f);
            }
        }
    }

}
