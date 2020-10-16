import java.util.ArrayList;
import java.util.List;

/**
 * Inventario es la clase que permite agregar los vehículos a una lista
 * para notificar cada vez que haya información editada por parte de su propietario
 *
 */
public class Inventario {

    private List<Vehiculo> vehiculolist = new ArrayList<>();
    private String title;

    /**
     * este metodo agrega un elemento a la lista
     * @param vehiculo es el elemento agregado
     */
    public void agregar(Vehiculo vehiculo){

        vehiculolist.add(vehiculo);
    }

    /**
     * este metodo elimina un elemento de la lista cuando deja de estar disponible
     * @param vehiculo es el vehiculo no disponible
     */
    public void eliminar(Vehiculo vehiculo){

        vehiculolist.remove(vehiculo);
    }

    /**
     * Metodo que actualiza a los vehículos
     */
    public void notificarVehiculos(){

        for(Vehiculo vehiculo : vehiculolist){
            vehiculo.update();
        }
    }

    /**
     * Metodo que notifica que hay una nueva actualización en los vehiculos
     * @param title
     */
    public void notificador(String title){
        this.title = title;
        notificarVehiculos();

    }

}
