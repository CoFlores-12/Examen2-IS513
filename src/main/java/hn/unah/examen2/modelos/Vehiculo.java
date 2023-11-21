package hn.unah.examen2.modelos;

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
public class Vehiculo {
    @Id
    @Column(name = "idvehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVehiculo;

    private String marca;

    private int anio;

    private Boolean disponible;

    @ManyToOne
    @JoinColumn(name = "idtipovehiculo", referencedColumnName = "idtipovehiculo")
    private TipoVehiculo idTipoVehiculo;
}
