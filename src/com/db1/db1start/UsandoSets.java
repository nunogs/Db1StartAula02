package com.db1.db1start;

import java.util.HashSet;
import java.util.Set;

public class UsandoSets {
    public static void main(String[] args) {
        //Crie um set com uma lista de nomes com 5 nome sendo adicionados mais de uma vez
        Set<String> nomes = new HashSet<>();
        nomes.add("Bruno");
        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Ana");
        nomes.add("Ana");
        nomes.add("Suzete");
        nomes.add("Fabiana");
        nomes.add("Ronaldo");

        imprimirSet("A lista inteira fica: ", nomes);
        separar();
        //Remova os nomes "Suzete" OU começados com "F" ou terminados em "naldo"

        nomes.removeIf(n -> n.equals("Suzete"));
        nomes.removeIf(n -> n.startsWith("F"));
        nomes.removeIf(n ->n.endsWith("naldo"));

        imprimirSet("O set sem Suzete ou começados em F ou terminados em naldo fica: ",nomes);



        //Encontre no set "Suzana" (ou não...), Se existir exiba
        // com todas letras maiúsculas

        //Em um set com números inteiros encontre o menor, o maior,
        // a soma e a média


    }

    private static void imprimirSet(String txt ,Set<String> nomes) {
        System.out.println(" ");
        System.out.println(txt);
        System.out.println(nomes);
        System.out.println(" ");
    }
    private static void separar() {
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
    }
}
