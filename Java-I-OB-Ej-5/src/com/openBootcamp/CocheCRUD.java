package com.openBootcamp;

import com.openBootcamp.Model.Coche;

import java.util.List;

public interface CocheCRUD {

    // GET de Coches
    void findAll(Coche coche);

    // POST de Coches
    void save(Coche coche);

    // DELETE de Coches
    void delete(Coche coche);
}
