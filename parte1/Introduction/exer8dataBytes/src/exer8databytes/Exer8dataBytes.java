package exer8databytes;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer8dataBytes {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        int rep=reader.nextInt();
        for(int i=0;i<rep;i++){
            try{
                long num=reader.nextLong();
                System.out.println(num+" can be fitted in:");
                if(num>=-128&&num<=127)System.out.println("* byte");
                if(num>=-32768&&num<=32767)System.out.println("* short");
                if(num>=-2147483648&&num<=2147483647)System.out.println("* int");
                System.out.println("* long");
            }catch(Exception e){
                System.out.println(reader.next()+" can't be fitted anywhere.");
            };
        };
    }; 
};
