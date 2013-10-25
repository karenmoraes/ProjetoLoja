package br.com.karenaraujo.projetoloja.controller;

import br.com.karenaraujo.projetoloja.model.Funcionario;
import br.com.karenaraujo.projetoloja.model.percistencia.FuncionarioDAOImplements;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.FuncionarioDAO;
import java.util.List;

public class FuncionarioController {

    public int salvar(Funcionario f) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.Salvar(f);

    }
        public int update(Funcionario f) {
            FuncionarioDAO dao = new FuncionarioDAOImplements();
            return dao.update(f);
        }

    public int inserir(Funcionario f) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.inserir(f);
    }

    public boolean remover(int codigo) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.remover(codigo);
    }

    public List<Funcionario> listAll() {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listAll();
    }

    public Funcionario listById(int codigo) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listById(codigo);
    }

    public List<Funcionario> listByNome(String nome) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listByNome(nome);
    }

    public List<Funcionario> listTodos() {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listAll();
    }
    public boolean Login(String login, String senha){
        FuncionarioDAO f = new FuncionarioDAOImplements();
        return f.Login(login, senha);
    }
    
}