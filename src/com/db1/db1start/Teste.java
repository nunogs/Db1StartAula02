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


}
