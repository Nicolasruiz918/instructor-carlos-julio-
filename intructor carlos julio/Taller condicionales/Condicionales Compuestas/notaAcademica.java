
public class notaAcademica {
    public static void main(String[] args) {
     
        int nota = 15;

        if (nota < 0 || nota > 20) {
            System.out.println("Nota inválida. Debe estar entre 0 y 20.");
        } else if (nota < 10) {
            System.out.println("Desaprobado");
        } else if (nota <= 13) {
            System.out.println("Regular");
        } else if (nota <= 17) {
            System.out.println("Bueno");
        } else {
            System.out.println("Excelente");
        }


    }
}

