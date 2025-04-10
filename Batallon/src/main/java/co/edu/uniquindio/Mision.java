package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.LinkedList;

public class Mision {

    private String id;
    private LocalDate fecha;
    private String ubicacion;
    private LinkedList<Soldado> ListPersonal;


    private Vehiculo theVehiculo;

    public Mision(String id, LocalDate fecha, String ubicacion) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        ListPersonal = new LinkedList<>();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LinkedList<Soldado> getListPersonal() {
        return ListPersonal;
    }

    public void setListPersonal(LinkedList<Soldado> listPersonal) {
        this.ListPersonal = listPersonal;
    }

    public Vehiculo getTheVehiculo() {
        return theVehiculo;
    }

    public void setTheVehiculo(Vehiculo theVehiculo) {
        this.theVehiculo = theVehiculo;
    }

}
