package br.com.sample.prevayler;

import org.junit.Assert;
import org.junit.Test;
import org.prevayler.Prevayler;

public class EmpresaFacadeTest {

    @Test
    public void testSomeMethod() {

        Prevayler<Empresa> prevayler = PrevaylerContext.getInstance();
        prevayler.execute(new CadastroFuncionario("José da Silva Jr"));
        prevayler.execute(new CadastroLoja("Loja da maria"));

        Empresa empresa = prevayler.prevalentSystem();

        Assert.assertEquals(5, empresa.getFuncionarios().size());
        Assert.assertEquals(3, empresa.getLojas().size());
    }
}
