package hn.unah.examen2.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.modelos.Cliente;
import hn.unah.examen2.modelos.TipoCliente;
import hn.unah.examen2.repositorios.ClienteRepository;
import hn.unah.examen2.repositorios.TipoClienteRepository;
import hn.unah.examen2.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public Cliente crear(Cliente cliente) {
        TipoCliente tipoCliente = this.tipoClienteRepository.findById(cliente.getTipoCliente().getIdtipocliente())
                .get();
        if (tipoCliente != null) {
            cliente.setTipoCliente(tipoCliente);
        }
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> todos() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente getCliente(int id) {
        return this.clienteRepository.findById(id).get();
    }

}
