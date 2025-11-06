package com.materias.materias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.materias.materias.dto.MateriasAddDto;
import com.materias.materias.entity.Materias;
import com.materias.materias.service.MateriasService;

/**
 * Controlador REST para la gestión de materias.
 * Historia de usuario: Agregar Materias - Jonathan Molina De Jesús
 */
@RestController
@RequestMapping("/api/materias")
public class MateriasController {

    @Autowired
    private MateriasService materiasService;

    /**
     * Endpoint para agregar una nueva materia al sistema
     * param materiaDto DTO con los datos de la materia a crear
     * return La materia creada
     */
    @PostMapping("/agregar-materia")
    public ResponseEntity<Materias> agregarMateria(@RequestBody MateriasAddDto materiaDto) {
        Materias newMateria = materiasService.agregarMateria(materiaDto);
        return ResponseEntity.ok(newMateria);
    }
}
