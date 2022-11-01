package com.openBootcamp;

import com.openBootcamp.Model.Coche;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void findAll(Coche coche) {
        System.out.println("findAll()");
    }

    @Override
    public void save(Coche coche) {
        System.out.println("save()");
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("delete()");
    }
}
