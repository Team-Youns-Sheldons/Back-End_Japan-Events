package com.gulag.JapanEvents.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Table(name = "event")
@Builder
@AllArgsConstructor
public class Event {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_event")
    private Long id_event;

    private String name;

    private int capacity;

    private int price;

    private String description;

    private String ubication;

    private String time;

    private String date;
    
    @ManyToOne
    @JoinColumn(name = "types_id", referencedColumnName = "id_types")
    private TypesEvent typeEvent;

    private String imagePath;

    public Event() {
    }

    public Long getId_event() {
        return id_event;
    }

    public void setId_event(Long id_event) {
        this.id_event = id_event;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TypesEvent getTypeEvent() {
        return typeEvent;
    }

    public void setTypeEvent(TypesEvent typeEvent) {
        this.typeEvent = typeEvent;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    

}
