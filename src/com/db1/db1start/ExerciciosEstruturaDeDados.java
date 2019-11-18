package com.db1.db1start;

import java.util.*;

public class ExerciciosEstruturaDeDados {
    public static void main(String[] args) {
        //Método que retorne os nomes das cores que você mais gosta
        List<String> cores = criarListaDeTres("Azul", "Amarelo", "Vermelho");
        imprimirLista("Imprimindo as cores: ", cores);
        separar();

        //Método que dado uma lista retorne a quantidade de itens
        tamanhoDaLista(cores);
        separar();

        //Método que receba 3 String, adicione todos em uma lista e remova a segunda posição
        List<String> listaqualquer = criarListaDeTres("Item1", "Item2", "Item3");
        imprimirLista("Imprimindo a lista de itens completa: " , listaqualquer);
        imprimirLista("Imprimindo a lista de itens sem o segundo item: " , removerSegundoItem(listaqualquer));
        separar();

        //Método que imprima a lista de cores do primeiro método
        imprimirLista("A primeira lista é: ", cores);
        separar();

        //Método que imprima as cores do primeiro método em ordem alfabética
        System.out.println("A primeira lista ordenada fica: " + ordenarlista(cores));
        separar();

        //Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida
        List<String> outrascores = criarListaDeTres("Azul", "Verde", "Magenta");
        imprimirLista("A lista completa é: " , outrascores);
        removerItemPorNome(outrascores, "Magenta");
        imprimirLista("A lista sem a cor 'magenta' fica: ", outrascores);
        separar();

        //Método que receba a lista de cores que você gosta e imprima em ordem decrescente (alfabética)
        ordenarDescrescenteListas(cores);
        imprimirLista("Lista em ordem decescente " , cores);
        separar();

        //Método que receba uma lista de números e retorne um mapa com listas de números pares e impares
        List<Integer> numeros = new ArrayList<>();
        numeros.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Map<Integer, String> mapanumeros = mapaParImpar(numeros);
        imprimirMapa("O mapa que mostra numeros e suas propriedades fica: ", mapanumeros);

    }

    private static Map<Integer, String> mapaParImpar(List<Integer> numeros) {
        Map<Integer, String> mapaNumeros = new HashMap<>();
        for (int c = 0; c <= 10 ; c++){
            if (numeros.get(c) % 2 == 0){
                mapaNumeros.put(c , "Par");
            }else{
                mapaNumeros.put(c , "Impar");
            }
        }
        return mapaNumeros;
    }

    private static void imprimirMapa(String texto, Map<Integer, String> mapa) {
        System.out.println(" ");
        System.out.println(texto);
        System.out.println(mapa);
        System.out.println(" ");
    }

    private static void tamanhoDaLista(List<String> cores) {
        System.out.println("A lista tem " + cores.size() +" itens.");
    }

    private static List<String> criarListaDeTres(String item1, String item2, String item3) {
        List<String> lista = new ArrayList<>();
        lista.add(item1);
        lista.add(item2);
        lista.add(item3);
        return lista;
    }

    private static List<String> removerSegundoItem(List<String> lista) {
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
    private static void removerItemPorNome(List<String> lista, String itempararemover) {
        lista.remove(itempararemover);
    }

    private static void ordenarDescrescenteListas(List<String> cores) {
        Collections.reverse(ordenarlista(cores));
    }
    private static void separar(){
        System.out.println(" ");
        System.out.println("--------------------------------------------");
    }
}
