package br.com.sample.prevayler;

import org.junit.Assert;
import org.junit.Test;
import org.prevayler.Prevayler;

public class EmpresaFacadeTest {

    @Test
    public void testSomeMethod() throws Exception {


        Prevayler prevayler = PrevaylerContext.getInstance();
        prevayler.execute(new CadastroDeFuncionario("José da Silva Jr"));

        Empresa empresa = (Empresa) prevayler.prevalentSystem();

        Assert.assertEquals(1, empresa.getFuncionarios().size());
    }
}
