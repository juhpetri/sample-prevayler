package br.com.sample.prevayler;

import br.com.sample.prevayler.Empresa;
import java.util.Date;
import org.prevayler.Transaction;

public class CadastroDeFuncionario implements Transaction {

    private static final long serialVersionUID = 1L;

    String nome;

    public CadastroDeFuncionario(String nome) {
        this.nome = nome;
    }

    @Override
    public void executeOn(Object prevalentSystem, Date date) {
        Empresa empresa = (Empresa) prevalentSystem;
        empresa.cadastraFuncionario(nome);
    }
}
