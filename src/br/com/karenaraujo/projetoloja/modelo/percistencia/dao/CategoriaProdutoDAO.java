/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.modelo.percistencia.dao;


import br.com.karenaraujo.projetoloja.model.CategoriaProduto;
import java.util.List;

/**
 *
 * @author ezio_joao
 */
public interface CategoriaProdutoDAO {

    int Salvar(CategoriaProduto cp);
    int inserir(CategoriaProduto cp);
    boolean remover(int codigo);
    List<CategoriaProduto> listAll();
    CategoriaProduto listById(int codigo);
    int update(CategoriaProduto f);
    List<CategoriaProduto> listByNome(String nome);
    
}
