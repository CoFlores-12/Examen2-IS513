package hn.unah.examen2.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.modelos.TipoVehiculo;
import hn.unah.examen2.repositorios.TipoVehiculoRepository;
import hn.unah.examen2.servicios.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService {
    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crear(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

}
