// La interfaz UserView define el contrato para la Vista en el patrón MVVM.
// Permite al ViewModel notificar a la Vista sobre cambios en los datos.
// Cualquier clase que represente una vista debe implementar esta interfaz.
public interface UserView {
    // Método que la vista implementará para recibir actualizaciones del nombre del usuario
    // @param name El nuevo nombre del usuario
    void onUserNameUpdated(String name);
}