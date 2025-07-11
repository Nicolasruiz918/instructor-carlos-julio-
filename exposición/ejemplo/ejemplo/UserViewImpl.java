// La clase UserViewImpl es una implementación de la Vista en el patrón MVVM.
// Implementa la interfaz UserView para recibir notificaciones del ViewModel.
// Simula una interfaz de usuario que muestra datos y maneja interacciones del usuario.
public class UserViewImpl implements UserView {
    // Método requerido por la interfaz UserView
    // Se ejecuta cuando el ViewModel notifica un cambio en el nombre del usuario
    // @param name El nuevo nombre del usuario
    @Override
    public void onUserNameUpdated(String name) {
        // En una aplicación real, esto podría actualizar una UI gráfica.
        // Aquí, simplemente imprimimos en consola para simular la vista.
        System.out.println("Nombre actualizado en la vista: " + name);
    }

    // Método que simula una interacción del usuario, como escribir un nuevo nombre
    // @param newName El nombre ingresado por el usuario
    public void onUserInput(String newName) {
        // Crea un nuevo modelo y ViewModel para esta interacción
        // Nota: En una aplicación real, el ViewModel podría ser inyectado o reutilizado
        UserViewModel viewModel = new UserViewModel(new User("Inicial"));
        // Registra esta vista en el ViewModel para recibir notificaciones
        viewModel.setUserView(this);
        // Envía la acción del usuario al ViewModel
        viewModel.updateUserName(newName);
    }
}