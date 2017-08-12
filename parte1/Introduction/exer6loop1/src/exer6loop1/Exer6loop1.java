package exer6loop1;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer6loop1{
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num=reader.nextInt();
        for(int i=1;i!=11;i++){
            System.out.println(num+" x "+i+" = "+num*i);
        };
    }; 
};