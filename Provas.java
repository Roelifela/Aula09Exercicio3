package br.com.digitalhouse;


import java.util.Set;

public class Provas {

    public void somaTotal(Set<Integer> valores) {

        double total = 0;

        for (Integer valor : valores) {
            total = total + valor;
        }

    }

}
