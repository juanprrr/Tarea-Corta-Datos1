import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * ConexionRegistroNacional es la clase Singleton que simula el trafico de datos desde
 * el registro nacional
 * @Author Juan Peña
 */
public class ConexionRegistroNacional {
    private static ConexionRegistroNacional instance;
    private Connection conexion;
    private String url = "direccion del host";
    private String usuario = "usuario";
    private String password = "contrasena";

    private ConexionRegistroNacional()  {
        System.out.println("...Tomando datos desde la base del Registro nacional de la propiedad");

    }

    /**
     * Este método se encarga de hacer la lectura de los datos extraídos de la base de datos del Registro
     * desde un archivo .txt
     * @param miVehiculo es la hoja de datos para un vehículo agregado
     *
     */
    public void fileReader(File miVehiculo) {
        try{
            FileInputStream fis = new FileInputStream(miVehiculo);

            InputStreamReader isr = new InputStreamReader(fis);

            BufferedReader reader = new BufferedReader(isr);
            String contenido = reader.readLine();
            //ValidacionVehiculo validacionVehiculo = new ValidacionVehiculo(contenido);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Connection getConexion() {
        return conexion;
    }

    /**
     * getInstance() es el método que se encarga de retornar la instancia de base de datos
     * para obtener la informacion
     * @return instance
     * @throws SQLException
     * @throws FileNotFoundException
     */
    public static ConexionRegistroNacional getInstance() throws SQLException, FileNotFoundException {
        if (instance == null) {
            instance = new ConexionRegistroNacional();
        } else if (instance.getConexion().isClosed()) {
            instance = new ConexionRegistroNacional();
        }
        return instance;
    }
}

