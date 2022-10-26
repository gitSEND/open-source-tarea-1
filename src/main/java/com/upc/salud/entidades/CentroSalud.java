package com.upc.salud.entidades;

import javax.persistence.*;

@Entity
public class CentroSalud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nombre;

    private String tipo;

    private int calificacionInfraestructura;

    private int calificacionServicios;

    private boolean ambulancias;

    public CentroSalud() {
    }


    public CentroSalud(Long codigo, String nombre, String tipo, int calificacionInfraestructura, int calificacionServicios, boolean ambulancias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.calificacionInfraestructura = calificacionInfraestructura;
        this.calificacionServicios = calificacionServicios;
        this.ambulancias = ambulancias;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCalificacionInfraestructura() {
        return calificacionInfraestructura;
    }

    public void setCalificacionInfraestructura(int calificacionInfraestructura) {
        this.calificacionInfraestructura = calificacionInfraestructura;
    }

    public int getCalificacionServicios() {
        return calificacionServicios;
    }

    public void setCalificacionServicios(int calificacionServicios) {
        this.calificacionServicios = calificacionServicios;
    }

    public boolean isAmbulancias() {
        return ambulancias;
    }

    public void setAmbulancias(boolean ambulancias) {
        this.ambulancias = ambulancias;
    }
}
