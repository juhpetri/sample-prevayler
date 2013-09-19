package br.com.sample.prevayler;

import com.google.common.base.Objects;
import java.io.Serializable;

public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cpf;

    private String nome;

    protected Funcionario() {
    }

    public static Funcionario newInstance() {
        return new Funcionario();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Funcionario) {
            Funcionario other = (Funcionario) obj;
            return Objects.equal(this.cpf, other.cpf);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.cpf);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("cpf", cpf).add("nome", nome).toString();
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
