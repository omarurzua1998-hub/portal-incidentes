package com.infratech.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidenteRepository extends JpaRepository<Incidente, Long> {
    // Solo con esta línea, Spring Boot ya sabe cómo hacer un CRUD completo de Incidentes
}