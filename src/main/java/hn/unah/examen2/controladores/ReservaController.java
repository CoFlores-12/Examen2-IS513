package hn.unah.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.modelos.ReservaDTO;
import hn.unah.examen2.servicios.Impl.reservaServiceImpl;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {
    @Autowired
    private reservaServiceImpl ReservaServiceImpl;

    @PostMapping("/crear")
    public String reservar(@RequestBody ReservaDTO reserva) {
        return this.ReservaServiceImpl.reservar(reserva);
    }
}
