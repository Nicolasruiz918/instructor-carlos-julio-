public class cantidaddebilletes {
    public static void main(String[] args) {
        int monto = 14555;
        
        System.out.println("Desglose para $" + monto + ":");
        
        System.out.println("$100: " + monto/100);
        monto = monto - (monto/100 * 100); 
        
        System.out.println("$50: " + monto/50);
        monto = monto - (monto/50 * 50); 
        
        System.out.println("$20: " + monto/20);
        monto = monto - (monto/20 * 20);
        
        System.out.println("$10: " + monto/10);
        monto = monto - (monto/10 * 10); 
        
        System.out.println("$5: " + monto/5);
        monto = monto - (monto/5 * 5); 
        
        System.out.println("$1: " + monto);
    }
}