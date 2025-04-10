package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.LinkedList;

public class Mision {
    private String id;
    private LocalDate fecha;
    private String ubicacion;
    private LinkedList<String> personal;

    public Mision(String id, LocalDate fecha, String ubicacion) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        personal = new LinkedList<>();
    }


}
