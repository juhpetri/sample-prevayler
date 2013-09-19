package br.com.sample.prevayler;

import org.springframework.stereotype.Controller;

@Controller
public class FuncionarioController {

    private Funcionario funcionario = Funcionario.newInstance();

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
