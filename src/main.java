

import java.sql.SQLException;

public class main {

    public static void main(String[] args) throws SQLException {
        Inventario inventarioVehiculos = new Inventario();

        Vehiculo v1 = new Vehiculo("Toyota");
        Vehiculo v2 = new Vehiculo("Nissan");
        Vehiculo v3 = new Vehiculo("BMW");
        Vehiculo v4 = new Vehiculo("Ford");
        Vehiculo v5 = new Vehiculo("Kia");
        Vehiculo v6 = new Vehiculo("Honda");
        Vehiculo v7 = new Vehiculo("Hyundai");
        Vehiculo v8 = new Vehiculo("Mercedes-Benz");

        inventarioVehiculos.agregar(v1);
        inventarioVehiculos.agregar(v2);
        inventarioVehiculos.agregar(v3);
        inventarioVehiculos.agregar(v4);
        inventarioVehiculos.agregar(v5);
        inventarioVehiculos.agregar(v6);
        inventarioVehiculos.agregar(v7);
        inventarioVehiculos.agregar(v8);

        v1.suscribirVehiculo(inventarioVehiculos);
        v2.suscribirVehiculo(inventarioVehiculos);
        v3.suscribirVehiculo(inventarioVehiculos);
        v4.suscribirVehiculo(inventarioVehiculos);
        v5.suscribirVehiculo(inventarioVehiculos);
        v6.suscribirVehiculo(inventarioVehiculos);
        v7.suscribirVehiculo(inventarioVehiculos);
        v8.suscribirVehiculo(inventarioVehiculos);

        inventarioVehiculos.notificador("Notificar vehiculos");

        ConexionRegistroNacional DB = ConexionRegistroNacional.getInstance();
        DB.getConexion();


    }
}
