package exer5joutputfomatting;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer5JOutputFomatting {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String message=reader.next();
            int num=reader.nextInt();
            System.out.printf("%-15s%03d\n", message, num);
        };  
        System.out.println("================================");
    }
    
}
