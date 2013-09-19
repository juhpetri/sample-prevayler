package br.com.sample.prevayler;

import com.google.common.base.Objects;
import java.io.Serializable;

public class Loja implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;

    private String cnpj;

    protected Loja() {
    }

    public static Loja newInstance() {
        return new Loja();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.equals(this)) {
            return true;
        }
        if (obj instanceof Loja) {
            Loja other = (Loja) obj;
            return Objects.equal(this.cnpj, other.cnpj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.cnpj);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("nome", nome).add("cnpj", cnpj).toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
