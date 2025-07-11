// La clase User representa el Modelo en el patrón MVVM.
// Contiene los datos (en este caso, el nombre del usuario) y la lógica básica para acceder y modificar esos datos.
// No tiene ninguna dependencia con la Vista o el ViewModel, lo que asegura un desacoplamiento completo.
public class User {
    // Atributo privado para almacenar el nombre del usuario
    private String name;

    // Constructor que inicializa el modelo con un nombre
    // @param name El nombre inicial del usuario
    public User(String name) {
        this.name = name;
    }

    // Getter para obtener el nombre del usuario
    // @return El nombre actual del usuario
    public String getName() {
        return name;
    }

    // Setter para actualizar el nombre del usuario
    // @param name El nuevo nombre del usuario
    public void setName(String name) {
        this.name = name;
    }
}