

public class temperaturaadecuada {
    public static void main(String[] args) {
        
        int temp = 40;

        if (temp < 15) {
            System.out.println("Hace frío");
        } else if (temp <= 29) {
            System.out.println("La temperatura es normal");
        } else {
            System.out.println("Hace calor");
        }

    }
}
