package hn.unah.examen2.servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.modelos.TipoCliente;
import hn.unah.examen2.repositorios.TipoClienteRepository;
import hn.unah.examen2.servicios.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crear(TipoCliente tipoCliente) {
        return this.tipoClienteRepository.save(tipoCliente);
    }

}
