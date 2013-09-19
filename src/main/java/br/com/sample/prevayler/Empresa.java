package br.com.sample.prevayler;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;

    List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    List<Loja> lojas = new ArrayList<Loja>();

    protected Empresa() {
    }

    public static Empresa newInstance() {
        return new Empresa();
    }

    public List<Loja> getLojas() {
        return lojas;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void addLoja(Loja loja) {
        lojas.add(loja);
    }
}
