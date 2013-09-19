package br.com.sample.prevayler;

import java.io.Serializable;

public class EmpresaFacade implements Serializable {

    private static final long serialVersionUID = 1L;

    private Loja loja;

    private Funcionario funcionario;

    public EmpresaFacade(Loja loja, Funcionario funcionario) {
        this.loja = loja;
        this.funcionario = funcionario;
    }

    public void cadastrarFuncionario(Empresa empresa) {
        empresa.addFuncionario(funcionario);
    }

    public void cadastrarLoja(Empresa empresa) {
        empresa.addLoja(loja);
    }
}
