package com.db1.db1start;

import org.hamcrest.core.StringEndsWith;

public class Application {

    public Integer soma(Integer num1, Integer num2){
        return (num1 + num2);
    }

    public Integer subtracao(Integer num1, Integer num2){
        return (num1 - num2);
    }

    public Integer multiplicacao(Integer num1, Integer num2){
        return (num1 * num2);
    }
    public Integer divisao(Integer num1, Integer num2){
        return (num1 / num2);
    }
    public String par(Integer num1){
        if (num1 % 2 == 0){
            return ("par");
        }
        return "impar";
    }
    public Integer maior(Integer num1, Integer num2){
        if (num1 > num2){
            return num1;
        }
        return (num2);
    }
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

    // --------------- exercicio de texto ---------------
    public String maiusculas(String texto){
        return (texto.toUpperCase());
    }
    public String minusculas(String texto){
        return (texto.toLowerCase());
    }

    public Integer contatexto(String texto){
        return (texto.length());
    }
    public Integer contatextosemespaco(String texto){
        String textosemespaco = texto.replaceAll(" ","");
        return (textosemespaco.length());
    }
    public String primeirasletras(String texto){
        return (texto.substring(0,4));
    }
    public String terceiraemdiante(String texto){
        return (texto.substring(3));
    }
    public String ultimas4(String texto){
        return (texto.substring(texto.length()-4));
    }
    public String primeironome(String texto){
        String[] a = texto.split(" ",3);
        return ("ALUNO " + a[1] + " " + a[2] );
    }
    public String separartexto(String texto){
        String[] textocortado = texto.split(", ",3);
        return (textocortado[0] + " " + textocortado[1] + " " + textocortado[2] );
    }
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
    public String invertertexto(String texto){
        String invertido = new StringBuilder(texto).reverse().toString();
        return (invertido);
    }
    public Double menorduble(Double num1, Double num2){
        if (num1 < num2){
            return num1;
        }
        return (num2);
    }
    public Double menorduble3(Double num1, Double num2, Double num3){

        if (num1 < num2 && num1 < num3){
            return num1;
        }else if(num2 < num3 && num2 < num1) {
            return num2;
        }
        return (num3);
    }

    public Double mediade3(Double num1, Double num2, Double num3){
        return ((num1 + num2 + num3)/3);
    }
    public Double areatriangulo(Double num1, Double num2){
        return ((num1 * num2)/2);
    }
}
