package co.edu.uniquindio;

public class VehiculoBlindado extends Vehiculo{
    public VehiculoBlindado(String id, String modelo, int anioFabricado, double kilometraje, int misionesCompletadas) {
        super(id, modelo, anioFabricado, kilometraje, misionesCompletadas);
    }
    public void despalazar() {
        System.out.println("el vehiculo de tropas se esta mviendo ");
    }
}
