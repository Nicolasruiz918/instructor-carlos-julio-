
import java.util.Scanner;

public class AccesoAlSistema {

    private static final String USUARIO_CORRECTO = "Nicolas";
    private static final String CONTRASENA_CORRECTA = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese el nombre de usuario: ");
            String usuarioIngresado = scanner.nextLine();

            System.out.print("Ingrese la contraseña: ");
            String contrasenaIngresada = scanner.nextLine();

            if (USUARIO_CORRECTO.equals(usuarioIngresado) && CONTRASENA_CORRECTA.equals(contrasenaIngresada)) {
                System.out.println("Acceso concedido.");
            } else {
                System.out.println("Acceso denegado.");
            }
        } finally {
            scanner.close(); 
        }
    }
}
