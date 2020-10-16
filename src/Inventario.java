import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Vehiculo> vehiculolist = new ArrayList<>();
    private String title;

    public void agregar(Vehiculo vehiculo){

        vehiculolist.add(vehiculo);
    }
    public void eliminar(Vehiculo vehiculo){

        vehiculolist.remove(vehiculo);
    }

    public void notificarVehiculos(){

        for(Vehiculo vehiculo : vehiculolist){
            vehiculo.update();
        }
    }

    public void notificador(String title){
        this.title = title;
        notificarVehiculos();

    }

}
