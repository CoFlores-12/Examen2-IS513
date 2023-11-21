package hn.unah.examen2.servicios;

import java.util.List;

import hn.unah.examen2.modelos.Cliente;

public interface ClienteService {
    public Cliente crear(Cliente cliente);

    public List<Cliente> todos();

    public Cliente getCliente(int id);
}
