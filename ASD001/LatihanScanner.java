
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class LatihanScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Input var01: ");
        String var01 = input.nextLine();
        System.out.println("var01: " + var01);
        
        
        
        System.out.print("Input var02: ");
        int var02 = input.nextInt();
        System.out.println("var02: " + var02);
        
        
        
        System.out.print("Input var03: ");
        long var03 = input.nextLong();
        System.out.println("var03: " + var03);
        
        
        
        System.out.print("Input var04: ");
        BigInteger var04 = input.nextBigInteger();
        System.out.println("var04: " + var04);
        
        
        
        System.out.print("Input var05: ");
        BigDecimal var05 = input.nextBigDecimal();
        System.out.println("var05: " + var05);
        
        
        
        System.out.print("Input var06: ");
        double var06 = input.nextDouble();
        System.out.println("var06: " + var06);
        
        
        System.out.print("Input var07: ");
        String var07 = input.nextLine();
        System.out.println("var07: " + var07);
        //split to array
        String[]data = var07.split(";");
        for (int i = 0; i < data.length; i++) {
            System.out.println("data["+i+"]: "+data[i]);
        }
        
        input.close();
    }
}
