import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        long principal = 0;
        while (true) {
            System.out.print("Enter the principal amount: ");
            principal = scanner.nextLong();
            if(principal >=1000 && principal<=1000000)
              break;
            System.out.println("Please enter a number between $1K to $1M");
        }
        
        double interest = 0.0;
        while (true) {
            System.out.print("Enter the annual interest rate: ");
            interest = (scanner.nextDouble()/100)/12;
            if (interest >0 && interest*12 <=0.3) {
                break;
            }
            System.out.println("Please enter a number more than 0 and less than or equal 30");
        }
        
        int period = 0;
        while (true) {
            System.out.print("Period (Years): ");
            period = scanner.nextInt()*12;
            if (period>0 && period/12<=40) {
                break;
            }
            System.out.println("Please enter a number between 1 to 40");
        }

        double mortgage = (principal*interest*Math.pow(interest+1, period))/(Math.pow(interest+1, period)-1);
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
  
        System.out.println("Your mortgage amount per month: "+result);

    }
}
