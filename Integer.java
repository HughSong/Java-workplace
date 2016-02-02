/**
 * 
 */
import java.util.Scanner;
import java.lang.*;
/**
 * @author ֻ־׃כחס
 *
 */
public class Integer {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int integer;
        String binary;
        double octal;
        double hexadecimal;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a integer: ");
        integer = scan.nextInt();
        binary = Integer.toBinaryString(integer);

    }


}
