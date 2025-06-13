package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FraseDTO;
import com.example.demo.service.FraseService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/series")
public class FraseController {
    @Autowired
    private FraseService fraseService;

    @GetMapping("/frases")
    public FraseDTO obterFrase() {
        return fraseService.obterFrase();
    }
    
}
