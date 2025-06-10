public class calculoSalario{
        public static void main(String[] args) {
            double hoursWorked = 48;          
            double hourlyRate = 15000;      
            double salary;
            
            if (hoursWorked > 40) {
    
                salary = 40 * hourlyRate + (hoursWorked - 40) * hourlyRate * 1.5;
            } else {
               
                salary = hoursWorked * hourlyRate;
            }
            
            System.out.println("Total salary: $" + String.format("%,.0f", salary) + " COP");
        }
    }
    