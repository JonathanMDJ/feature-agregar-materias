package com.materias.materias.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.materias.materias.entity.Materias;
import com.materias.materias.repository.MateriasRepository;
import com.materias.materias.dto.MateriasAddDto;
import com.materias.materias.dto.MateriasEditDto;
import com.materias.materias.dto.MateriasListDto;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MateriasService {
    @Autowired
    private MateriasRepository materiasRepository;

    // Historia de usuario Agregar Materias - Jonathan Molina De Jesús
    public Materias agregarMateria(MateriasAddDto materiaDto) {
        // Crear una nueva instancia de Materias
        Materias nuevaMateria = new Materias();
        nuevaMateria.setClave(materiaDto.getClave());
        nuevaMateria.setNombre(materiaDto.getNombre());
        nuevaMateria.setDescripcion(materiaDto.getDescripcion());
        nuevaMateria.setActivo(true);

        // Guardar y retornar la nueva materia
        return materiasRepository.save(nuevaMateria);
    }

}
