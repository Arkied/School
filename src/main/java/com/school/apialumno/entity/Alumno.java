package com.school.apialumno.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "alumno")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_alumno")
    private Long id;
    @Column(name = "alu_codigo", length = 30)
    private String codigo;
    @Column(name = "alu_paterno", length = 50)
    private String paterno;
    @Column(name = "alu_materno", length = 50)
    private String materno;
    @Column(name = "alu_nombres", length = 50)
    private String nombres;
    @Column(name = "alu_password", length = 255)
    private String password;
    @Column(name = "alu_sexo", length = 1)
    private String sexo;
    @Column(name = "alu_dni", length = 8)
    private String dni;
    @Column(name = "alu_nacimiento")
    private String nacimiento;
    @Column(name = "alu_correo", length = 50, nullable = false, unique = true)
    private String correo;
    @Column(name = "alu_telefono", length = 9)
    private String telefono;
    @Column(name = "alu_imagen", length = 50)
    private String imagen;
    @Column(name = "alu_creacion")
    private String creacion;
    @Column(name = "alu_estado")
    private Boolean estado;
//    private String id_roles;
//    private String id_apoderado;

}
