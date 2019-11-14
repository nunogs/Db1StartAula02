package com.db1.db1start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsandoListas {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Abacaxi");
        frutas.add("Tomate");
        frutas.add("Figo");
        frutas.add("Morango");

        frutas.addAll(Arrays.asList("Jaca", "Caju"));
        imprimir("Frutas iniciais: ", frutas);

        frutas.add("Banana");
        imprimir("Adicionando uma banana", frutas);

        System.out.println(frutas.indexOf("Banana"));
        frutas.remove("Banana");
        imprimir("Removendo uma banana", frutas);

        frutas.removeAll(Arrays.asList("Figo", "Caju"));
        imprimir("Removendo mais frutas ", frutas);

        frutas.removeIf(it -> it.equals("Banana"));

        frutas.removeIf(f -> f.startsWith("J"));
        imprimir("Removendo apartir de uma letra ,j", frutas);
        for (int i = 0 ; i < frutas.size(); i++ ){
            System.out.println(frutas.get(i));
        }
        System.out.println("Com for-each");
        for (String fruta : frutas ){
            System.out.println(fruta);
        }
        System.out.println("Com for-each, com lambda");
        frutas.forEach( f -> System.out.println(f);
        //frutas.forEach(System.out::println);

        for (String fruta : frutas ){
            System.out.println(fruta);
        }


    }

    private static void imprimir(String texto, List<String> frutas) {
        System.out.println(" ");
        System.out.println(texto + frutas);
        System.out.println( " ");
        System.out.println("---------------------------------------------------------------------------------");
    }


}
