package br.com.karenaraujo.projetoloja.controller;

import br.com.karenaraujo.projetoloja.model.Produto;
import br.com.karenaraujo.projetoloja.model.Produto;
import br.com.karenaraujo.projetoloja.model.percistencia.ProdutoDAOImplements;
import br.com.karenaraujo.projetoloja.model.percistencia.ProdutoDAOImplements;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.ProdutoDAO;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.ProdutoDAO;
import java.util.List;

public class ProdutoController {

     
    public int salvar(Produto p){
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.save(p).getCodigo();
    }
    
    public List<Produto> listarTodos(){
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.listarTodos(Produto.class);
    }
    
    public boolean remover (int codigo){
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.remover(Produto.class,codigo);
    }
    
    public Produto listarId (int codigo){
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.buscarCodigo(Produto.class,codigo);
    }
    
}