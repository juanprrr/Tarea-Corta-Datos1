
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
        try{
            Class.forName("driver de la base");
            this.conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Creación de conexion Fallida: "+ e.getMessage());;
        }
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

