package hn.unah.examen2.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.modelos.Cliente;
import hn.unah.examen2.modelos.Reserva;
import hn.unah.examen2.modelos.ReservaDTO;
import hn.unah.examen2.modelos.Vehiculo;
import hn.unah.examen2.repositorios.ClienteRepository;
import hn.unah.examen2.repositorios.ReservaRepository;
import hn.unah.examen2.repositorios.VehiculoRepository;
import hn.unah.examen2.servicios.ReservaService;

@Service
public class reservaServiceImpl implements ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public String reservar(ReservaDTO reserva) {
        Cliente cliente = this.clienteRepository.findById(reserva.getidCliente()).get();
        Vehiculo vehiculo = this.vehiculoRepository.findById(reserva.getidVehiculo()).get();
        if (cliente == null) {
            return "Cliente no existe";
        }
        if (vehiculo == null) {
            return "vehiculo no existe";
        }

        if (!vehiculo.getDisponible()) {
            return "Vehiculo no disponible";
        }

        vehiculo.setDisponible(false);

        Reserva reservaDB = new Reserva();
        reservaDB.setIdcliente(reserva.getidCliente());
        reservaDB.setIdvehiculo(reserva.getidVehiculo());
        reservaDB.setDias(reserva.getDias());
        reservaDB.setTotal((reserva.getDias() * vehiculo.getIdTipoVehiculo().getPrecioXHora()));
        this.reservaRepository.save(reservaDB);

        this.vehiculoRepository.save(vehiculo);

        return "Reserva Realizada";

    }

}
