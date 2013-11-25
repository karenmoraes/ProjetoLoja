package br.com.karenaraujo.projetoloja.controller;

import br.com.karenaraujo.projetoloja.model.Endereco;
import br.com.karenaraujo.projetoloja.model.percistencia.EnderecoDAOImplements;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.EnderecoDAO;
import java.util.List;

public class EnderecoController {

     
     
    public int salvar(Endereco e){
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.save(e).getCodigo();
    }
    
    public List<Endereco> listarTodos(){
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.listarTodos(Endereco.class);
    }
    
    public boolean remover (int codigo){
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.remover(Endereco.class,codigo);
    }
    
    public Endereco listarId (int codigo){
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.buscarCodigo(Endereco.class,codigo);
    }
    
}

