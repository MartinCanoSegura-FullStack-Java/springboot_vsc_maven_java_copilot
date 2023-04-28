package com.mx.mcs.springboot_vsc_maven_java_copilot.model;

import lombok.Data;

@Data
public class Paciente {
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
}
