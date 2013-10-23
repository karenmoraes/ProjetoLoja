package br.com.karenaraujo.projetoloja.controller;

import br.com.karenaraujo.projetoloja.model.Funcionario;
import br.com.karenaraujo.projetoloja.model.percistencia.FuncionarioDAOImplement;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.FuncionarioDAO;
import java.util.List;

public class FuncionarioController {

    public int salvar(Funcionario f) {
        FuncionarioDAO dao = new FuncionarioDAOImplement();
        return dao.Salvar(f);

    }
        public int update(Funcionario f) {
            FuncionarioDAO dao = new FuncionarioDAOImplement();
            return dao.update(f);
        }

    public int inserir(Funcionario f) {
        FuncionarioDAO dao = new FuncionarioDAOImplement();
        return dao.inserir(f);
    }

    public boolean remover(int codigo) {
        FuncionarioDAO dao = new FuncionarioDAOImplement();
        return dao.remover(codigo);
    }

    public List<Funcionario> listAll() {
        FuncionarioDAO dao = new FuncionarioDAOImplement();
        return dao.listAll();
    }

    public Funcionario listById(int codigo) {
        FuncionarioDAO dao = new FuncionarioDAOImplement();
        return dao.listById(codigo);
    }

    public List<Funcionario> listByNome(String nome) {
        FuncionarioDAO dao = new FuncionarioDAOImplement();
        return dao.listByNome(nome);
    }

    public List<Funcionario> listTodos() {
        FuncionarioDAO dao = new FuncionarioDAOImplement();
        return dao.listAll();
    }
}