/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.modelo.percistencia.dao;

import br.com.karenaraujo.projetoloja.model.CategoriaProduto;
import br.com.karenaraujo.projetoloja.model.Funcionario;
import java.util.List;

/**
 *
 * @author ezio_joao
 */
public interface FuncionarioDAO extends DAO
        <Funcionario, Integer>{
    boolean procurarLogin(String usuario, String senha);

    
}
