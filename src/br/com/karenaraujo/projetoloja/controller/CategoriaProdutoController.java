package br.com.karenaraujo.projetoloja.controller;

import br.com.karenaraujo.projetoloja.model.CategoriaProduto;
import br.com.karenaraujo.projetoloja.model.percistencia.CategoriaProdutoDAOImplements;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.CategoriaProdutoDAO;
import java.util.List;

public class CategoriaProdutoController {

    public int salvar(CategoriaProduto cp) {
        CategoriaProdutoDAO dao = new CategoriaProdutoDAOImplements();
        return dao.Salvar(cp);

    }      

    public boolean remover(int codigo) {
        CategoriaProdutoDAO dao = new CategoriaProdutoDAOImplements();
        return dao.remover(codigo);
    }

    public List<CategoriaProduto> listAll() {
        CategoriaProdutoDAO dao = new CategoriaProdutoDAOImplements();
        return dao.listAll();
    }

    public CategoriaProduto listById(int codigo) {
        CategoriaProdutoDAO dao = new CategoriaProdutoDAOImplements();
        return dao.listById(codigo);
    }

    public List<CategoriaProduto> listByNome(String nome) {
        CategoriaProdutoDAO dao = new CategoriaProdutoDAOImplements();
        return dao.listByNome(nome);
    }

   
    
}