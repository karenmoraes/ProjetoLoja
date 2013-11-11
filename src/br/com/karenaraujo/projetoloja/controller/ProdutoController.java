package br.com.karenaraujo.projetoloja.controller;

import br.com.karenaraujo.projetoloja.model.Produto;
import br.com.karenaraujo.projetoloja.model.Produto;
import br.com.karenaraujo.projetoloja.model.percistencia.ProdutoDAOImplements;
import br.com.karenaraujo.projetoloja.model.percistencia.ProdutoDAOImplements;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.ProdutoDAO;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.ProdutoDAO;
import java.util.List;

public class ProdutoController {

    public int salvar(Produto p) {
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.Salvar(p);

    }

    public int update(Produto p) {
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.update(p);
    }

    public int inserir(Produto p) {
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.inserir(p);
    }

    public boolean remover(int codigo) {
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.remover(codigo);
    }

    public List<Produto> listAll() {
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.listAll();
    }

    public Produto listById(int codigo) {
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.listById(codigo);
    }

    public List<Produto> listByNome(String nome) {
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.listByNome(nome);
    }
}