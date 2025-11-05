package com.materias.materias.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.materias.materias.dto.MateriasEditDto;
import com.materias.materias.dto.MateriasListDto;
import com.materias.materias.entity.Materias;
import com.materias.materias.service.MateriasService;
import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriasController {
}
