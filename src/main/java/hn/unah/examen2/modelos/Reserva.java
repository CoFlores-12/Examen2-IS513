package hn.unah.examen2.modelos;

import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reserva {
    @Id
    @Column(name = "idreserva")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;

    @Column(name = "idcliente")
    private int idcliente;

    @Column(name = "idvehiculo")
    private int idvehiculo;

    @CreatedDate
    private Date fecha;

    private int dias;

    private Double total;
}
