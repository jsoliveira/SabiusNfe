package com.nfe.interfaces;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jsoliveira
 * @param <T> Tipo da PK
 * @param <I> Classe
 */
public interface DAO<T, I extends Serializable> {

    public void save(I entity);

    public void remove(I entity);

    public I getById(T pk);

    public List<I> getAll();
    
}