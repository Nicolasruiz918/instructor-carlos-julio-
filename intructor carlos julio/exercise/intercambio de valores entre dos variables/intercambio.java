
public class intercambio  {
    public static void main(String[] args) {
        int num= 5;
        int num2 = 10;
        
        System.out.println("Before swap: num = " + num + ", num2= " + num2);
     
        num= num * num2;
        num2 = num / num2;
        num = num / num2;
        
        System.out.println("After swap: num = " + num+ ", num2 = " + num2);
    }
}