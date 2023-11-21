package hn.unah.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen2.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
