package com.db1.db1start;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciciosEstruturaDeDados {
    public static void main(String[] args) {

        //Método que retorne os nomes das cores que você mais gosta
        List<String> cores = criarlistadetres("Azul", "Amarelo", "Vermelho");
        imprimirLista("Imprimindo as cores: ", cores);

        //Método que dado uma lista retorne a quantidade de itens
        tamanhodalista(cores);

        //Método que receba 3 String, adicione todos em uma lista e remova a segunda posição
        List<String> listaqualquer = criarlistadetres("Item1", "Item2", "Item3");

        imprimirLista("Imprimindo a lista completa: " , listaqualquer);
        removersegundoitem(listaqualquer);
        imprimirLista("Imprimindo a lista sem o segundo item: " , listaqualquer);

        //Método que imprima a lista de cores do primeiro método
        imprimirLista("Primeira lista é: ",cores);

        //Método que imprima as cores do primeiro método em ordem alfabética
        ordenarlista(cores);

        //Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida
        List<String> cores2 = criarlistadetres("Azul", "Verde", "Magenta");
        removeritempornome(cores2, "Magenta");
        imprimirLista("A lista sem a cor 'magenta' fica: ", cores2);

        //Método que receba a lista de cores que você gosta e imprima em ordem decrescente (alfabética)


        //Método que receba uma lista de números e retorne um mapa com listas de números pares e impares
    }


    private static void tamanhodalista(List<String> cores) {
        System.out.print("Tamanho da lista é: ");
        System.out.println(cores.size());
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
    private static void imprimirLista(String txt, List<String> cores) {
        System.out.println(" ");
        System.out.println(txt);
        System.out.println(cores);
        System.out.println(" ");
        System.out.println("--------------------------------------------");
    }
    private static void ordenarlista(List<String> lista) {
        Collections.sort(lista);
        imprimirLista("A primeira lista ordenada fica: ",lista);
    }

    private static void removeritempornome(List<String> lista, String itempararemover) {
        lista.remove(itempararemover);
    }
}
