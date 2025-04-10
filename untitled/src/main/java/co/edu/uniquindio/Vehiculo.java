package co.edu.uniquindio;

public abstract class Vehiculo {
    protected String id;
    protected String modelo;
    protected int anioFabricado;
    protected double kilometraje;
    protected int misionesCompletadas;

    public Vehiculo(String id, String modelo, int anioFabricado, double kilometraje, int misionesCompletadas) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricado = anioFabricado;
        this.kilometraje = kilometraje;
        this.misionesCompletadas = misionesCompletadas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricado() {
        return anioFabricado;
    }

    public void setAnioFabricado(int anioFabricado) {
        this.anioFabricado = anioFabricado;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getMisionesCompletadas() {
        return misionesCompletadas;
    }

    public void setMisionesCompletadas(int misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }

    public abstract void despalazar();

}
