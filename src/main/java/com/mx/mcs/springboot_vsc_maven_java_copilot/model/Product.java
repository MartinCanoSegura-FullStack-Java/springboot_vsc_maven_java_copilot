package com.mx.mcs.springboot_vsc_maven_java_copilot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    
}
