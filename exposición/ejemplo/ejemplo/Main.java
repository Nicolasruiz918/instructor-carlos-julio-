// La clase Main demuestra el uso del patrón MVVM.
// Crea instancias del Modelo, ViewModel y Vista, y simula una interacción.
public class Main {
    public static void main(String[] args) {
        // Crea el modelo con un nombre inicial
        User user = new User("Juan");

        // Crea el ViewModel y le pasa el modelo
        UserViewModel viewModel = new UserViewModel(user);

        // Crea la vista
        UserViewImpl view = new UserViewImpl();

        // Registra la vista en el ViewModel para recibir notificaciones
        viewModel.setUserView(view);

        // Muestra el nombre inicial
        System.out.println("Nombre inicial: " + viewModel.getUserName());

        // Simula una interacción del usuario (cambiar el nombre)
        view.onUserInput("Ana");
    }
}