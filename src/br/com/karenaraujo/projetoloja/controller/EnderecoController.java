package br.com.karenaraujo.projetoloja.controller;

import br.com.karenaraujo.projetoloja.model.Endereco;
import br.com.karenaraujo.projetoloja.model.percistencia.EnderecoDAOImplements;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.EnderecoDAO;

public class EnderecoController {

    public int salvar(Endereco e) {
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.salvar(e);
    }
}
