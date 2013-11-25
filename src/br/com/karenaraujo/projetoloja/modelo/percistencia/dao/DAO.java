/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.karenaraujo.projetoloja.modelo.percistencia.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author ezio_joao
 */
public interface DAO <T, I extends Serializable> {
    
    T save (T entity);
    
    List<T> listarTodos(Class<T> classe);
    
    EntityManager getEntityManager();
    
    T buscarCodigo(Class<T> classe, I pk);
    
    boolean remover(Class<T> classe,I pk);
    
    
}
