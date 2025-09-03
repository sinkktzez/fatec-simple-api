package com.example.fatec_simple_api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/disciplinas")
@Tag(name = "Disciplinas", description = "Endpoint para consulta de disciplinas")
public class DisciplinaController {

    @GetMapping
    @Operation(summary = "Lista todas as disciplinas", description = "Retorna uma lista fixa de nomes de disciplinas.")
    public List<String> getDisciplinas() {
        // Retornando um vetor (lista) simples de nomes
        return Arrays.asList("Gestão Ágil de Projetos de Software", "Algoritmo e Lógica de Programação", "Inglês I");
    }
}