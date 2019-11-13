package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class Teste {

    @Test
    public void deveRetornar10(){
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.soma(4,6);
        Assert.assertEquals(expected,response);

    }

    @Test
    public void deveRetornar9(){
        Application application = new Application();
        Integer expected = 9;
        Integer response = application.subtracao(20,11);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar8(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.multiplicacao(4,2);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornar7(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.divisao(14,2);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void parOuImpar(){
        Application application = new Application();
        String expected = "par";
        String response = application.par(2);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornar6(){
        Application application = new Application();
        Integer expected = 6;
        Integer response = application.maior(1,6);
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornarImpares(){
        Application application = new Application();
        Integer expected = 11;
        Integer response = application.impares(22);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarImparesDesafio(){
        Application application = new Application();
        Integer expected = 11;
        Integer response = application.impardesafio(22);
        Assert.assertEquals(expected, response);
    }

    // --------------- exercicios texto ---------------
    @Test
    public void deveRetornarLetrasMaiusculas(){
        Application application = new Application();
        String expected = "ABC";
        String response = application.maiusculas("abc");
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornarLetrasMinusculas(){
        Application application = new Application();
        String expected = "abc";
        String response = application.minusculas("ABC");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveContarLetrasDoTexto(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.contatexto("DB1START");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveContarLetrasSemEspaco(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.contatextosemespaco(" DB1START ");
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornarTextoSemEspaco(){
        Application application = new Application();
        String expected = "DB1START";
        String response = application.retornatexto(" DB1START ");
        Assert.assertEquals(expected, response);
    }


    @Test
    public void deveRetornar4PrimeirasLetras(){
        Application application = new Application();
        String expected = "Brun";
        String response = application.primeirasletras("Bruno Gobo Soares");
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveSepararOTexto(){
        Application application = new Application();
        String expected = "banana maçã melancia";
        String response = application.separartexto("banana, maçã, melancia");
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveSepararOTexto2(){
        Application application = new Application();
        String [] expected = new String [] {"banana maçã melancia"};
        String response = application.separartexto("banana, maçã, melancia");
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornarApartirDaTerceiraLetra(){
        Application application = new Application();
        String expected = "no Gobo Soares";
        String response = application.terceiraemdiante("Bruno Gobo Soares");
        Assert.assertEquals(expected, response);
    }
    @Test
    public void deveRetornarUltimas4Letras(){
        Application application = new Application();
        String expected = "ares";
        String response = application.ultimas4("Bruno Gobo Soares");
        Assert.assertEquals(expected, response);
     }
    @Test
    public void deveSubstituirPrimeiroNome(){
        Application application = new Application();
        String expected = "ALUNO Gobo Soares";
        String response = application.primeironome("Bruno Gobo Soares");
        Assert.assertEquals(expected, response);
     }

    @Test
    public void deveContarVogais(){
        Application application = new Application();
        Integer expected = 2;
        Integer response = application.contarvogais("Atack");
        Assert.assertEquals(expected, response);
     }
    @Test
    public void deveInverterTexto(){
        Application application = new Application();
        String expected = "CBA";
        String response = application.invertertexto("ABC");
        Assert.assertEquals(expected, response);
     }

    // --------------- exercicios Double---------------
    @Test
    public void deveRetornarMenorDouble(){
        Application application = new Application();
        Double expected = 10.0;
        Double response = application.menorduble(10.0, 11.0);
        Assert.assertEquals(expected, response);
     }
    @Test
    public void deveRetornarMenorDouble3(){
        Application application = new Application();
        Double expected = 11.0;
        Double response = application.menorduble3(15.0, 11.0, 100.0);
        Assert.assertEquals(expected, response);
     }
    @Test
    public void deveRetornarMediaDe3(){
        Application application = new Application();
        Double expected = 30.0;
        Double response = application.mediade3(30.0, 30.0, 30.0);
        Assert.assertEquals(expected, response);
     }
    @Test
    public void deveRetornarAreaTrianguloPorBaseAltura(){
        Application application = new Application();
        Double expected = 187.5;
        Double response = application.areatriangulo(25.0, 15.0);
        Assert.assertEquals(expected, response);
     }



}
