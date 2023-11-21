package hn.unah.examen2.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tipocliente")
public class TipoCliente {
    @Id
    @Column(name = "idtipocliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtipocliente;

    private String descripcion;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoCliente", cascade = CascadeType.ALL)
    private List<Cliente> clientes;
}
