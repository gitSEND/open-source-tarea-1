package com.upc.salud.negocio;

import com.upc.salud.entidades.CentroSalud;

import java.util.List;

public interface ICentroSaludNegocio {
    public Long calcularCalificacion(CentroSalud centroSalud);
    public Long obtenerResultadoFinal(CentroSalud centroSalud);
    public List<CentroSalud> listado();
    public List<CentroSalud> listadoConCalificaciones();
    public List<CentroSalud> listadoPorTipoDeCentroSalud(String tipoCentroSalud);

}
