public class ValidacionVehiculo {
    private String textoBaseDatos;
    boolean flag = true;
    public ValidacionVehiculo(String textoBaseDatos){
        this.textoBaseDatos = textoBaseDatos;
    }
    public String getDocumentacionVehiculo() {
        return textoBaseDatos;
    }
    public void validar( Vehiculo vehiculo){
        System.out.println("voy a validar");
        if (vehiculo.getName().equals(textoBaseDatos)){
            System.out.println("Vehiculo es Válido");
        }

    }
}
