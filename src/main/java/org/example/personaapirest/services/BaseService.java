package org.example.personaapirest.services;

import org.example.personaapirest.entities.BaseEntidad;
import org.example.personaapirest.repositories.BaseRepository;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends BaseEntidad , ID extends Serializable>{
    public List<E> findAll() throws Exception;
    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}
