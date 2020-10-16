
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionRegistroNacional {
    private static ConexionRegistroNacional instance;
    private Connection conexion;
    private String url = "direccion del host";
    private String usuario = "usuario";
    private String password = "contrasena";

    private ConexionRegistroNacional(){
        System.out.println("...Tomando datos desde la base del Registro nacional de la propiedad");
    }

    public Connection getConexion() {
        return conexion;
    }

    public static ConexionRegistroNacional getInstance() throws SQLException {
        if (instance == null) {
            instance = new ConexionRegistroNacional();
        } else if (instance.getConexion().isClosed()) {
            instance = new ConexionRegistroNacional();
        }
        return instance;
    }
}

