package com.upc.salud.negocio;

import com.upc.salud.entidades.CentroSalud;
import com.upc.salud.repositorio.IMinisterioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CentroSaludNegocio implements ICentroSaludNegocio{
    @Autowired
    IMinisterioRepositorio repositorio;

    @Override
    public Long calcularCalificacion(CentroSalud centroSalud) {
        return null;
    }

    @Override
    public Long obtenerResultadoFinal(CentroSalud centroSalud) {
        return null;
    }

    @Override
    public List<CentroSalud> listado() {
        return repositorio.findAll();
    }

    @Override
    public List<CentroSalud> listadoConCalificaciones() {

        return null;
    }

    @Override
    public List<CentroSalud> listadoPorTipoDeCentroSalud(String tipoCentroSalud) {
        return null;
    }
}
