package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.FraseDTO;
import com.example.demo.model.Frase;
import com.example.demo.repository.FraseRepository;

@Service
public class FraseService {
    @Autowired
    private FraseRepository fraseRepository;

    public FraseDTO obterFrase(){
        return converte(fraseRepository.obterFrase());
    }
    static private FraseDTO converte(Frase frase){
        return new FraseDTO(
            frase.getFrase()
            , frase.getPersonagem()
            , frase.getTitulo()
            , frase.getPoster()
        );
    }

    static private List<FraseDTO> converte(List<Frase> series){
        return series.stream()
                .map(FraseService::converte)
                .collect(Collectors.toList());  
    }
}
