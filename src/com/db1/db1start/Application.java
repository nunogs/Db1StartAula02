package com.db1.db1start;

public class Application {
    // Ex 1  Método que some dois números
    public Integer soma(Integer num1, Integer num2){
        return (num1 + num2);
    }

    // Ex 2  Método que subtraia dois números
    public Integer subtracao(Integer num1, Integer num2){
        return (num1 - num2);
    }

    // Ex 3  Método que multiplique dois números
    public Integer multiplicacao(Integer num1, Integer num2){
        return (num1 * num2);
    }

    // Ex 4  Método que divida dois números
    public Integer divisao(Integer num1, Integer num2){
        return (num1 / num2);
    }

    // Ex 5  Método que diga se o número é par
    public String par(Integer num1){
        if (num1 % 2 == 0){
            return ("par");
        }
        return "impar";
    }

    // Ex 6  Método que receba dois números e diga qual é o maior
    public Integer maior(Integer num1, Integer num2){
        if (num1 > num2){
            return num1;
        }
        return (num2);
    }

    // Ex 7  Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ELE MESMO.
    public Integer impares(Integer num1){
        Integer simpar = 0;
        int c;
        for (c = 0; c <= num1; c++){
            if(c % 2 == 1){
                simpar++;
            }
        }
        return simpar;
    }

    // Ex 7 desafio  Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ELE MESMO.
    public Integer impardesafio(Integer num1){
        if (num1 % 2 ==0 ){
            return (num1/2);
        }
        return ((num1/2)+1);
    }


    // --------------- exercicio de texto ---------------
    // Ex 1  Método que receba um texto e devolva ele em LETRAS MAIUSCULAS
    public String maiusculas(String texto){
        return (texto.toUpperCase());
    }

    // Ex 2  Método que receba um texto e devolva ele em LETRAS MINUSCULAS
    public String minusculas(String texto){
        return (texto.toLowerCase());
    }

    // Ex 3  Método que receba DB1START e retorne a quantidade de letras que existe nesta palavra
    public Integer contatexto(String texto){
        String textosemenumero = removeNumeros(texto);
        return (textosemenumero.length());
    }
    private String removeNumeros(String texto) {
        return texto.replaceAll("[0-9]", "");
    }

    // Ex 4  Método que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe
    public Integer contatextosemespaco(String texto){
        String textosemespaco = removeEspaco(texto);
        return (removeNumeros(textosemespaco).length());
    }

    private String removeEspaco(String texto) {
        return texto.trim();
    }

    // Ex 5  Método que retorne o texto do item 4 com a mesma quantidade de letras do item 3.
    public String retornatexto(String texto){
        return (removeEspaco(removeNumeros(texto)));
    }

    // Ex 6  Método que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
    public String primeirasletras(String texto){
        return (texto.substring(0,4));
    }

    // Ex 7  Método que receba o seu nome completo e exiba a partir da terceira letra do seu nome
    public String terceiraemdiante(String texto){
        return (texto.substring(3));
    }

    // Ex 8  Método que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
    public String ultimas4(String texto){
        return (texto.substring(texto.length()-4));
    }

    // Ex 9  Método que receba o seu nome completo e substitua o seu primeiro nome por ALUNO/ALUNA
    public String primeironome(String texto){
        String[] a = texto.split(" ");
        return ("ALUNO " + a[1] + " " + a[2] );
    }

    // Ex 10 Método que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.
    public String separartexto(String texto){
        String[] textocortado = texto.split(", ");
        return (textocortado[0] + " " + textocortado[1] + " " + textocortado[2] );
    }

    // Ex 11 Método que receba um texto e exiba quantas vogais tem no texto
    public Integer contarvogais(String texto){
        int vogal=0;
        for(int cont1 = 0; cont1 < texto.length() ; cont1++){
            if (texto.charAt(cont1) == 'a'|texto.charAt(cont1) == 'A' |
                    texto.charAt(cont1) == 'e'|texto.charAt(cont1) == 'E' |
                    texto.charAt(cont1) == 'i'|texto.charAt(cont1) == 'I' |
                    texto.charAt(cont1) == 'o'|texto.charAt(cont1) == 'O' |
                    texto.charAt(cont1) == 'u'|texto.charAt(cont1) == 'U' ){
                vogal++;
            }
        }
        return (vogal);
    }

    // Ex 12 Método que receba um texto e devolva ele invertido
    public String invertertexto(String texto){
        String invertido = new StringBuilder(texto).reverse().toString();
        return (invertido);
    }


    // ---------------- Exercicios de Double -------------
    // Ex 1  Método que exiba qual é o menor valor entre dois doubles
    public Double menorduble(Double num1, Double num2){
        if (num1 < num2){
            return num1;
        }
        return (num2);
    }

    // Ex 2  Método que exiba qual é o menor valor entre três doubles
    public Double menorduble3(Double num1, Double num2, Double num3){

        if (num1 < num2 && num1 < num3){
            return num1;
        }else if(num2 < num3 && num2 < num1) {
            return num2;
        }
        return (num3);
    }

    // Ex 3  Método que exiba a média de três números
    public Double mediade3(Double num1, Double num2, Double num3){
        return ((num1 + num2 + num3)/3);
    }

    // Ex 4  Método que calcule a área de um triangulo
    public Double areatriangulo(Double num1, Double num2){
        return ((num1 * num2)/2);
    }
}