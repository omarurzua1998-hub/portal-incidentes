package com.infratech.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/incidentes")
@CrossOrigin(origins = "http://localhost:4200") // Permite que Angular se conecte
public class IncidenteController {

    @Autowired
    private IncidenteRepository repositorio;

    // GET /incidentes -> Listar todos
    @GetMapping
    public List<Incidente> listar() {
        return repositorio.findAll();
    }

    // POST /incidentes -> Crear nuevo
    @PostMapping
    public Incidente crear(@RequestBody Incidente incidente) {
        return repositorio.save(incidente);
    }

    // PUT /incidentes/{id} -> Actualizar existente
    @PutMapping("/{id}")
    public Incidente actualizar(@PathVariable Long id, @RequestBody Incidente detalles) {
        Incidente incidente = repositorio.findById(id).orElseThrow();
        
        incidente.setTipo(detalles.getTipo());
        incidente.setArea(detalles.getArea());
        incidente.setDescripcion(detalles.getDescripcion());
        incidente.setEstado(detalles.getEstado());
        incidente.setPrioridad(detalles.getPrioridad());
        incidente.setResponsable(detalles.getResponsable());
        incidente.setFechaResolucion(detalles.getFechaResolucion());
        
        return repositorio.save(incidente);
    }

    // DELETE /incidentes/{id} -> Eliminar
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repositorio.deleteById(id);
    }
}