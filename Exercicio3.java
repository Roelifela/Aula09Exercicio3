package br.com.digitalhouse;

import java.util.HashSet;
import java.util.Set;


public class Exercicio3 {

    public static void main(String[] args) {

        Set<Integer> elementos = new HashSet<>();
        elementos.add(1);
        elementos.add(5);
        elementos.add(6);
        elementos.add(7);

        Provas prova = new Provas();
        prova.somaTotal(elementos);

        //HOW TO PRINT VALUES FROM Provas CLASS?????

        System.out.println(prova.toString());

    }

}
