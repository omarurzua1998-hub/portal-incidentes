package com.infratech.backend; 

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "incidentes")
@Data // Magia de Lombok: genera los Getters, Setters y Constructores automáticamente
public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String area;
    
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    
    private String estado;
    private String prioridad;
    private String responsable;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_resolucion")
    private LocalDateTime fechaResolucion;

    // Esta función se ejecuta automáticamente justo antes de guardar un incidente nuevo en la base de datos
    @PrePersist
    protected void onCreate() {
        this.fechaCreacion = LocalDateTime.now();
        if (this.estado == null) {
            this.estado = "Nuevo"; // Si no le mandamos estado, por defecto será "Nuevo"
        }
    }
}