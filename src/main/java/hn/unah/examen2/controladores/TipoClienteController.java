package hn.unah.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.modelos.TipoCliente;
import hn.unah.examen2.servicios.Impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api/tipocliente")
public class TipoClienteController {
    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear")
    public TipoCliente crear(@RequestBody TipoCliente tipoCliente) {
        return this.tipoClienteServiceImpl.crear(tipoCliente);
    }
}
