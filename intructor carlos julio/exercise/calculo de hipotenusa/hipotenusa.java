public class hipotenusa {
    public static void main(String[] args) {
        double sideA = 30;
        double sideB = 45;
        
        double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);
        
        System.out.println("Hypotenuse: " + hypotenuse);
    }
}