package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Frase;

public interface FraseRepository extends JpaRepository<Frase, Long>{
    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase obterFrase();
}
