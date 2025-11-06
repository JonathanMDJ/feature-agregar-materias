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
}
