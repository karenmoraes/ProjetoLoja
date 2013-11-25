package br.com.karenaraujo.projetoloja.controller;

import br.com.karenaraujo.projetoloja.model.CategoriaProduto;
import br.com.karenaraujo.projetoloja.model.percistencia.CategoriaProdutoDAOImplements;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.CategoriaProdutoDAO;
import java.util.List;

public class CategoriaProdutoController {

    public int salvar(CategoriaProduto cp) {
      
        CategoriaProdutoDAO dao = new CategoriaProdutoDAOImplements();
        return dao.save(cp).getCodigo();
    }
    
    public List<CategoriaProduto> listarTodos(){
        CategoriaProdutoDAO dao = new CategoriaProdutoDAOImplements();
        return dao.listarTodos(CategoriaProduto.class);
    }
    
    public boolean remover (int codigo){
        CategoriaProdutoDAO dao = new CategoriaProdutoDAOImplements();
        return dao.remover(CategoriaProduto.class,codigo);
    }
    
    public CategoriaProduto listarId (int codigo){
        CategoriaProdutoDAO dao = new CategoriaProdutoDAOImplements();
        return dao.buscarCodigo(CategoriaProduto.class,codigo);
    }
    

   
    
}