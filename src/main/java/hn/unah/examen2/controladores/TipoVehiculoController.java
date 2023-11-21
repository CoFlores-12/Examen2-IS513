package hn.unah.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.modelos.TipoVehiculo;
import hn.unah.examen2.servicios.Impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api/tipovehiculo")
public class TipoVehiculoController {
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/crear")
    public TipoVehiculo crear(@RequestBody TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoServiceImpl.crear(tipoVehiculo);
    }
}
