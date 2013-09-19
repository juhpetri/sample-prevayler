package br.com.sample.prevayler;

import org.junit.Assert;
import org.junit.Test;

public class EmpresaFacadeTest {

    Funcionario funcionario = Funcionario.newInstance();

    Loja loja = Loja.newInstance();

    @Test
    public void testSomeMethod() {
        Empresa empresa = Empresa.newInstance();

        funcionario.setCpf("cpf");
        funcionario.setNome("nome");

        loja.setCnpj("cnpj");
        loja.setNome("nome");

        EmpresaFacade empresaFacade = new EmpresaFacade(loja, funcionario);
        empresaFacade.cadastrarFuncionario(empresa);
        empresaFacade.cadastrarLoja(empresa);

        Assert.assertEquals(1, empresa.getFuncionarios().size());
        Assert.assertEquals(1, empresa.getLojas().size());
    }
}
