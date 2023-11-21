package hn.unah.examen2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.modelos.Vehiculo;
import hn.unah.examen2.servicios.Impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/vehiculo")
public class VehiculosController {
    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("crear")
    public Vehiculo crear(@RequestBody Vehiculo vehiculo) {
        return this.vehiculoServiceImpl.crear(vehiculo);
    }

    @GetMapping("/todos")
    public List<Vehiculo> todos() {
        return this.vehiculoServiceImpl.todos();
    }

    @GetMapping("/id/{id}")
    public Vehiculo getById(@PathVariable int id) {
        return this.vehiculoServiceImpl.getVehiculo(id);
    }
}
