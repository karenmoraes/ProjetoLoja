/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.model.percistencia;

import br.com.karenaraujo.projetoloja.model.Funcionario;
import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.FuncionarioDAO;
import java.util.List;
import javax.persistence.Query;

public class FuncionarioDAOImplements extends DAOImplemente<Funcionario, Integer>
        implements FuncionarioDAO {

  
    public boolean procurarLogin(String login, String senha) {
        Query q = getEntityManager().createQuery("select f from Funcionario f where f.login = "
                + login + " and f.senha = " + senha, Funcionario.class);
        List<Funcionario> funcionarios = q.getResultList();
        for(Funcionario f: funcionarios){
            return true;
        }
     return false;
}
}
