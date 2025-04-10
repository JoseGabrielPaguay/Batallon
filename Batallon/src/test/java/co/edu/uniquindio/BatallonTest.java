package co.edu.uniquindio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
class BatallonTest {
    /**
     * CLase para probar agregar una nueva mision, kilometraje de vehiculos, obtener misiones por ubi y fecha, y obtener vehiculos con mas misiones
     * @author Jose
     * @since 2025-04
     * Licencia GNU/GPL V3.0
     */
    private static final Logger LOG = Logger.getLogger(BatallonTest.class.getName());

    @Test
    @DisplayName("prueba Funcionalidades test")
    public void testUno(){
        LOG.info("inicio del metodo testUoo");
        //comprueba que dos elementos sean iguales
        assertEquals(4,4);
        //comprueba que dos elementos no sean iguales
        assertNotEquals(1,"1");
        //comprueba que un elemento sea verdadedo
        assertTrue(1>0);
        //comprueba que un elemento sea falso
        assertFalse(1<0);
        //
        assertNull(null);
        LOG.info("Fin del metodo tstUno");
    }

    @Test
    @DisplayName("Prueba metodo para registrar una mision")
    public void testRegistrarMision() {
        LOG.info("inicio del metodo testRegistrarMision");
        Batallon batallon = new Batallon("Batallon 1", "B001");

        VehiculoApoyo vehiculo = new VehiculoApoyo("V001", "Modelo X", 2020, 1000.0, EstadoOperativo.DISPONIBLE, TipoFuncion.LOGISTICA);
        batallon.getListVehiculos().add(vehiculo);

        LinkedList<String> personal = new LinkedList<>();
        personal.add("Soldado 1");

        boolean resultado = batallon.registrarMision(LocalDate.now(), "Base Norte", personal, "V001");

        assertTrue(resultado);
        LOG.info("Fin del metodo testRegistrarMision");
    }

    @Test
    @DisplayName("Prueba metodo test kilometraje promedio por tipo de vehiculo")
    public void testKilometrajePromedioPorTipo() {
        LOG.info("inicio del metodo testKilometrajePromedioPorTipo");
        Batallon batallon = new Batallon("Batallon X", "BX01");

        batallon.getListVehiculosApoyo().add(new VehiculoApoyo("A1", "ApoyoX", 2018, 1000, EstadoOperativo.DISPONIBLE, TipoFuncion.LOGISTICA));
        batallon.getListVehiculosBlindados().add(new VehiculoBlindado("B1", "BlindadoX", 2017, 2000, EstadoOperativo.DISPONIBLE, 3));
        batallon.getListVehiculosTransporteTropa().add(new VehiculoTransporteTropa("T1", "TransporteX", 2019, 3000, EstadoOperativo.DISPONIBLE, 10));

        String resultado = batallon.calcularKilometrajePromedioPorTipo();

        assertTrue(resultado.contains("1000.0"));
        assertTrue(resultado.contains("2000.0"));
        assertTrue(resultado.contains("3000.0"));
        LOG.info("Fin del metodo testKilometrajePromedioPorTipo");
    }

    @Test
    @DisplayName("Prueba metodo obtener vehiculos por ubicacion y fecha")
    public void testObtenerMisionesPorUbicacionYFechas() {
        LOG.info("inicio del metodo testObtenerMisionesPorUbicacionYFechas");
        Batallon batallon = new Batallon("Batallon Z", "BZ01");

        Mision m1 = new Mision("1", LocalDate.of(2023, 1, 10), "Base Alfa");
        Mision m2 = new Mision("2", LocalDate.of(2023, 1, 15), "Base Alfa");
        Mision m3 = new Mision("3", LocalDate.of(2023, 2, 1), "Base Beta");

        batallon.getListMisiones().add(m1);
        batallon.getListMisiones().add(m2);
        batallon.getListMisiones().add(m3);

        LinkedList<Mision> resultado = batallon.obtenerMisionesPorUbicacionYFechas(
                "Base Alfa",
                LocalDate.of(2023, 1, 9),
                LocalDate.of(2023, 1, 20)
        );

        assertEquals(2, resultado.size());
        LOG.info("Fin del metodo testObtenerMisionesPorUbicacionYFechas");
    }

    @Test
    @DisplayName("prueba del metodo obtener vehiculos con mas misiones")
    public void testObtenerVehiculoConMasMisiones() {
        LOG.info("inicio del metodo testObtenerVehiculoConMasMisiones");
        Batallon batallon = new Batallon("Batallon Bravo", "BB01");

        VehiculoApoyo v1 = new VehiculoApoyo("V1", "ModeloA", 2020, 500, EstadoOperativo.DISPONIBLE, TipoFuncion.MEDICO);
        v1.setMisionesCompletadas(5);

        VehiculoBlindado v2 = new VehiculoBlindado("V2", "ModeloB", 2019, 800, EstadoOperativo.DISPONIBLE, 2);
        v2.setMisionesCompletadas(8);

        VehiculoTransporteTropa v3 = new VehiculoTransporteTropa("V3", "ModeloC", 2021, 1000, EstadoOperativo.DISPONIBLE, 15);
        v3.setMisionesCompletadas(3);

        batallon.getListVehiculosApoyo().add(v1);
        batallon.getListVehiculosBlindados().add(v2);
        batallon.getListVehiculosTransporteTropa().add(v3);

        Vehiculo resultado = batallon.obtenerVehiculoConMasMisiones();

        assertEquals("V2", resultado.getId());
        LOG.info("Fin del metodo testObtenerVehiculoConMasMisiones");
    }

    
}









