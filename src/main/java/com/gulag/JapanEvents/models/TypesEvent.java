package com.gulag.JapanEvents.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Table(name = "types")
@Builder
@AllArgsConstructor
public class TypesEvent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_types")
    private Long id;

    private String name;


    public TypesEvent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}
