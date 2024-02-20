package com.gulag.JapanEvents.Generic;

public interface IGenericGetService<T> {

    T getById(Long id) throws Exception;
    
}
