package com.db1.db1start;

import java.util.*;

public class ExerciciosEstruturaDeDados {
    public static void main(String[] args) {

        //Método que retorne os nomes das cores que você mais gosta
        List<String> cores = criarlistadetres("Azul", "Amarelo", "Vermelho");
        imprimirLista("Imprimindo as cores: ", cores);
        separar();

        //Método que dado uma lista retorne a quantidade de itens
        tamanhodalista(cores);
        separar();

        //Método que receba 3 String, adicione todos em uma lista e remova a segunda posição
        List<String> listaqualquer = criarlistadetres("Item1", "Item2", "Item3");
        imprimirLista("Imprimindo a lista de itens completa: " , listaqualquer);
        imprimirLista("Imprimindo a lista de itens sem o segundo item: " , removersegundoitem(listaqualquer));
        separar();

        //Método que imprima a lista de cores do primeiro método
        imprimirLista("A primeira lista é: ", cores);
        separar();

        //Método que imprima as cores do primeiro método em ordem alfabética
        System.out.println("A primeira lista ordenada fica: " + ordenarlista(cores));
        separar();

        //Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida
        List<String> outrascores = criarlistadetres("Azul", "Verde", "Magenta");
        imprimirLista("A lista completa é: " , outrascores);
        removeritempornome(outrascores, "Magenta");
        imprimirLista("A lista sem a cor 'magenta' fica: ", outrascores);
        separar();

        //Método que receba a lista de cores que você gosta e imprima em ordem decrescente (alfabética)
        ordenardescrescentelistas(cores);
        imprimirLista("Lista em ordem decescente " , cores);
        separar();

        //Método que receba uma lista de números e retorne um mapa com listas de números pares e impares
        List<Integer> numeros = new ArrayList<>();
        numeros.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Map<Integer, String> mapanumeros = mapaparimpar(numeros);
        imprimirmapa("O mapa que mostra numeros e suas propriedades fica: ", mapanumeros);

    }

    private static Map<Integer, String> mapaparimpar(List<Integer> numeros) {
        Map<Integer, String> mapanumeros = new HashMap<>();
        for (int c = 0; c <= 10 ; c++){
            if (numeros.get(c) % 2 == 0){
                mapanumeros.put(c , "Par");
            }else{
                mapanumeros.put(c , "Impar");
            }
        }
        return mapanumeros;
    }

    private static void imprimirmapa(String texto, Map<Integer, String> mapa) {
        System.out.println(" ");
        System.out.println(texto);
        System.out.println(mapa);
        System.out.println(" ");
    }

    private static void listanumeros10() {
        List<Integer> numeros = new ArrayList<>();
        numeros.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }


    private static void tamanhodalista(List<String> cores) {
        System.out.println("A lista tem " + cores.size() +" itens.");
    }

    private static List<String> criarlistadetres(String item1, String item2, String item3) {
        List<String> lista = new ArrayList<>();
        lista.add(item1);
        lista.add(item2);
        lista.add(item3);
        return lista;
    }

    private static List<String> removersegundoitem(List<String> lista) {
        lista.remove(1);
        return lista;
    }

    private static void imprimirLista(String txt, List<String> lista) {
        System.out.println(" ");
        System.out.println(txt);
        System.out.println(lista);
    }
    private static List<String> ordenarlista(List<String> lista) {
        Collections.sort(lista);
        return (lista);
    }
    private static void removeritempornome(List<String> lista, String itempararemover) {
        lista.remove(itempararemover);
    }

    private static void ordenardescrescentelistas(List<String> cores) {
        Collections.reverse(ordenarlista(cores));
    }
    private static void separar(){
        System.out.println(" ");
        System.out.println("--------------------------------------------");
    }
}
