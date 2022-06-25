package com.example.homework3.Usr.Sevice;

import com.example.homework3.Usr.Entity.BaseEntity;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public abstract class BaseEntityService<E extends BaseEntity,D extends JpaRepository> {

    private D dao;

    public List<E> findAll(){
        return dao.findAll();
    }

    public Optional<E> findById(Long id){
        return dao.findById(id);
    }

    public E save(E e){
        return (E) dao.save(e);
    }

    public void delete(E e){
        dao.delete(e);
    }

    public D getDao() {
        return dao;
    }

    public E getById(Long id) {
        E entity;
        Optional<E> optionalEntity = findById(id);
        if (optionalEntity.isPresent()){
            entity = optionalEntity.get();
        } else {
            throw new RuntimeException("Item not found!");
        }
        return entity;
    }
}