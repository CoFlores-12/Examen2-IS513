package hn.unah.examen2.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.modelos.TipoVehiculo;
import hn.unah.examen2.modelos.Vehiculo;
import hn.unah.examen2.repositorios.TipoVehiculoRepository;
import hn.unah.examen2.repositorios.VehiculoRepository;
import hn.unah.examen2.servicios.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {
    @Autowired
    private VehiculoRepository vehiculoRepository;
    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public Vehiculo crear(Vehiculo vehiculo) {
        TipoVehiculo tipoVehiculo = this.tipoVehiculoRepository
                .findById(vehiculo.getIdTipoVehiculo().getIdTipoVehiculo()).get();
        if (tipoVehiculo != null) {
            vehiculo.setIdTipoVehiculo(tipoVehiculo);
        }
        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> todos() {
        return this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo getVehiculo(int id) {
        return this.vehiculoRepository.findById(id).get();
    }

}
