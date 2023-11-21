package hn.unah.examen2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.modelos.Cliente;
import hn.unah.examen2.servicios.Impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public Cliente crear(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.crear(cliente);
    }

    @GetMapping("/todos")
    public List<Cliente> todos() {
        return this.clienteServiceImpl.todos();
    }

    @GetMapping("/id/{id}")
    public Cliente getClienteById(@PathVariable int id) {
        return this.clienteServiceImpl.getCliente(id);
    }
}
