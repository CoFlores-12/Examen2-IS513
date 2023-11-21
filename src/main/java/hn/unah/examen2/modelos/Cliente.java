package hn.unah.examen2.modelos;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {
    @Id
    @Column(name = "codigocliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoCliente;

    private String nombre;

    private String apellido;

    @Column(name = "fechaingreso")
    @JsonFormat(pattern = "YYYY-MM-DD")
    private Date fechaingreso;

    @ManyToOne
    @JoinColumn(name = "idtipocliente")
    private TipoCliente tipoCliente;
}
