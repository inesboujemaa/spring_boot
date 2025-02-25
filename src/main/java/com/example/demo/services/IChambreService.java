package com.example.demo.services;

import com.example.demo.entities.Chambre;

import java.util.List;

public interface IChambreService {
    public List<Chambre> findAll();
    public Chambre save(Chambre chambre);
    public void deleteById(Long id);
    public Chambre update(Chambre chambre);

}
