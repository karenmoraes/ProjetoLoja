package br.com.karenaraujo.projetoloja.model.percistencia;

import br.com.karenaraujo.projetoloja.modelo.percistencia.dao.DAO;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public abstract class DAOImplemente<T, I extends Serializable> implements DAO<T, I> {

    private ConnectionFactory conexao;

    public T save(T entity) {
        T saved = null;
        getEntityManager().getTransaction().begin();
        saved = getEntityManager().merge(entity);
        getEntityManager().getTransaction().commit();
        return saved;
    }

    public EntityManager getEntityManager() {
        if (conexao == null) {
            conexao = new ConnectionFactory();
        }
        return conexao.getEntityManager();
    }

    public List<T> listarTodos(Class<T> classe) {
        return getEntityManager().createQuery("select x from "
                + classe.getSimpleName()
                + " x").getResultList();
    }

    public T buscarCodigo(Class<T> classe, I pk) {
        try {
            return getEntityManager().find(classe, pk);
        } catch (NoResultException e) {
            return null;
        }
    }

    public boolean remover(Class<T> classe,
            I pk) {
        T entity = getEntityManager().find(classe, pk);
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(entity);
        getEntityManager().getTransaction().commit();
        return true;

    }
      public List<T> procurarNome(String nome, Class<T> classe) {
        Query q = getEntityManager().createQuery("select f from " + classe.getSimpleName()+"f where f.nome like"
                + nome, classe);
       
       
     return q.getResultList();
}
}
