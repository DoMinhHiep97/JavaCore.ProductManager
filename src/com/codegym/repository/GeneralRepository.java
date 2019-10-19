package com.codegym.repository;

import java.util.List;

public interface GeneralRepository<E> {
    List<E> findAll();
}
