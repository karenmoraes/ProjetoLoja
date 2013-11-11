/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.modelo.percistencia.dao;

import br.com.karenaraujo.projetoloja.model.Produto;
import java.util.List;

/**
 *
 * @author ezio_joao
 */
public interface ProdutoDAO {

    int Salvar(Produto p);
    int inserir(Produto p);
    boolean remover(int codigo);
    List<Produto> listAll();
    Produto listById(int codigo);
    int update(Produto p);
    List<Produto> listByNome(String nome);
   
}
