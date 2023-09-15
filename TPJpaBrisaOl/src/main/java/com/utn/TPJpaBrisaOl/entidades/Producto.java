package com.utn.TPJpaBrisaOl.entidades;
import com.utn.TPJpaBrisaOl.enumeraciones.TipoProducto;
import com.utn.TPJpaBrisaOl.enumeraciones.TipoProducto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto extends BaseEntidad{
    private int tiempoEstimadoCocina;
    private String denominacion;
    private double precioVta;
    private double precioCompra;
    private int stockActual;
    private int stockMin;
    private String unidadMedida;
    private String receta;
    private TipoProducto tipo;



}
