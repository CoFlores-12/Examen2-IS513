package hn.unah.examen2.modelos;

public class ReservaDTO {
    private int idCliente;
    private int idVehiculo;
    private int dias;

    public int getidCliente() {
        return this.idCliente;
    }

    public int getidVehiculo() {
        return this.idVehiculo;
    }

    public int getDias() {
        return this.dias;
    }

    public void setidCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setidVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}
