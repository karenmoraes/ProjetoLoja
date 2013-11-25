package br.com.karenaraujo.projetoloja.controller;

import br.com.karenaraujo.projetoloja.model.Funcionario;
import br.com.karenaraujo.projetoloja.model.percistencia.FuncionarioDAOImplements;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.FuncionarioDAO;
import java.util.List;

public class FuncionarioController {

    public int salvar(Funcionario f) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.save(f).getCodigo();
    }

    public List<Funcionario> listarTodos() {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listarTodos(Funcionario.class);
    }

    public boolean remover(int codigo) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.remover(Funcionario.class, codigo);
    }

    public Funcionario listarId(int codigo) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.buscarCodigo(Funcionario.class, codigo);
    }

    public boolean Login(String login, String senha) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.procurarLogin(login, senha);
    }
}
