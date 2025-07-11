// La clase UserViewModel es el ViewModel en el patrón MVVM.
// Sirve como intermediario entre el Modelo (User) y la Vista (UserView).
// Contiene la lógica de presentación y notifica a la Vista sobre cambios en los datos.
public class UserViewModel {
    // Referencia al modelo (User) que contiene los datos
    private User user;
    // Referencia a la interfaz de la vista para notificar cambios
    private UserView userView;

    // Constructor que inicializa el ViewModel con un modelo
    // @param user El objeto User que contiene los datos
    public UserViewModel(User user) {
        this.user = user;
    }

    // Método para registrar la vista que recibirá notificaciones
    // @param userView La implementación de la interfaz UserView
    public void setUserView(UserView userView) {
        this.userView = userView;
    }

    // Método para obtener el nombre del usuario desde el modelo
    // @return El nombre actual del usuario
    public String getUserName() {
        return user.getName();
    }

    // Método para actualizar el nombre del usuario
    // Actualiza el modelo y notifica a la vista del cambio
    // @param newName El nuevo nombre del usuario
    public void updateUserName(String newName) {
        // Actualiza el modelo
        user.setName(newName);
        // Notifica a la vista si está registrada
        if (userView != null) {
            userView.onUserNameUpdated(newName);
        }
    }
}