package br.com.sample.prevayler;

import org.junit.Assert;
import org.junit.Test;
import org.prevayler.Prevayler;

public class EmpresaFacadeTest {

    @Test
    public void testSomeMethod() {

        Prevayler prevayler = PrevaylerContext.getInstance();
        prevayler.execute(new CadastroFuncionario("José da Silva Jr"));
        prevayler.execute(new CadastroLoja("Loja da maria"));

        Empresa empresa = (Empresa) prevayler.prevalentSystem();

        Assert.assertEquals(4, empresa.getFuncionarios().size());
        Assert.assertEquals(2, empresa.getLojas().size());
    }
}
