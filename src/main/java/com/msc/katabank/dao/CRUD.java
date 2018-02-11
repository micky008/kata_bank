package com.msc.katabank.dao;

import java.util.List;

/**
 *
 * @author micky
 */
public interface CRUD<T> {
    
    boolean insert(T t);
    boolean insert(List<T> ts);
    boolean update(T t);
    boolean update(List<T> ts);
    boolean delete(T t);
    boolean delete(List<T> ts);
    List<T> selectAll();
}
