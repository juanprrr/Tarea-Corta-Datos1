public class Vehiculo {

    private String name;
    private Inventario inventario = new Inventario();

    public Vehiculo(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Vehiculo Disponible");
    }

    public void suscribirVehiculo(Inventario inv){
        inventario = inv;

    }


}
