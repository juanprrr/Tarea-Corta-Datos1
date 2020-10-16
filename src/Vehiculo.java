/**
 * Clase que describe el objeto vehiculo e implementa la interface Observer
 * para ser notificado por el Inventario
 */
public class Vehiculo implements Observer {

    private String name;
    private Inventario inventario = new Inventario();

    public Vehiculo(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("Vehiculo Disponible");
    }

    @Override
    public void suscribirVehiculo(Inventario inv){
        inventario = inv;

    }
    public String getName() {
        return name;
    }


}
