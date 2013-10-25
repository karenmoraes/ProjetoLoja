/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.modelo.percistencia.dao;

import br.com.karenaraujo.projetoloja.model.Funcionario;
import java.util.List;

/**
 *
 * @author ezio_joao
 */
public interface FuncionarioDAO {

    int Salvar(Funcionario f);
    int inserir(Funcionario f);
    boolean remover(int codigo);
    List<Funcionario> listAll();
    Funcionario listById(int codigo);
    int update(Funcionario f);
    List<Funcionario> listByNome(String nome);
    boolean Login (String login, String senha);
}
