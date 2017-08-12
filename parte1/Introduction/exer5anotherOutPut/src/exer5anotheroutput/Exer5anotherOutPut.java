package exer5anotheroutput;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer5anotherOutPut {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String message1=reader.next();
        int num1=reader.nextInt();
        String message2=reader.next();
        int num2=reader.nextInt();
        String message3=reader.next();
        int num3=reader.nextInt();        
        System.out.println("================================");
        System.out.printf("%-15s%03d\n", message1, num1);
        System.out.printf("%-15s%03d\n", message2, num2);
        System.out.printf("%-15s%03d\n", message3, num3);
        System.out.println("================================");
    };  
};
