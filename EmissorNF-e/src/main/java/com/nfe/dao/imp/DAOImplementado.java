package com.nfe.dao.imp;



import com.nfe.interfaces.DAO;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


public abstract class DAOImplementado<T, I extends Serializable> implements DAO<T, I> {

    @PersistenceContext(unitName = "Persistence")
    public EntityManager entityManager;
    
    private final Class<I> type;

    public DAOImplementado(Class<I> type) {
        this.type = type;
    }
    

    @Override
    //@Transactional
    public void save(I entity) {
        entityManager.persist(entity);
    }

    @Override
    public void remove(I entity) {
        entityManager.remove(entityManager.merge(entity));
    }

    public void update(I entity) {
        entityManager.merge(entity);
    }

    @Override
    public I getById(T pk) {
        return (I) entityManager.find(type, pk);
    }

    @Override
    public List<I> getAll() {
        System.out.println("Getall");
        Query q = entityManager.createQuery("SELECT e FROM " + type.getSimpleName() + " e");
        return (List<I>) q.getResultList();
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
