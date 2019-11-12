package com.db1.db1start;

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
}
