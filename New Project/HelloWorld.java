public class HelloWorld{

    public static void printPay(double basePay,double hoursWorked){
        double totalPay;
        
        if (basePay < 8) {
            System.out.println("You suck");
        } else {
            if (hoursWorked < 40) {
                totalPay = hoursWorked * basePay;
            
            } else {
                totalPay = 40 * basePay + (hoursWorked - 40) * basePay * 1.5;
            
            }
            System.out.println("Your total pay is" + totalPay);
         
        
        } else {
            if (hoursWorked > 60) {
                System.out.println ("Maximum of 60 hours worked only");
            
    }
    
    public static void main(String[] arguments){
        printPay(8, 40);
        
        
    }

}
    
