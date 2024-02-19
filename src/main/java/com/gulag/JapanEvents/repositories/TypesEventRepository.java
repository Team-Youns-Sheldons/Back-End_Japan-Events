package com.gulag.JapanEvents.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gulag.JapanEvents.models.TypesEvent;

public interface TypesEventRepository extends JpaRepository<TypesEvent, Long> {

    public TypesEvent findByName(String name);
    
}
