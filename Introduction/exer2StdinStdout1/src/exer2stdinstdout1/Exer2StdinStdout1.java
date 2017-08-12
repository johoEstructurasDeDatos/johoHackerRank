package exer2stdinstdout1;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer2StdinStdout1 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num1=reader.nextInt();
        int num2=reader.nextInt();
        int num3=reader.nextInt();
        reader.close();
        System.out.print(num1+"\n"+num2+"\n"+num3);
    };
};
