package exer7loop2;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer7loop2 {
    public static void main(String []args){
        Scanner reader=new Scanner(System.in);
        int querys=reader.nextInt();
        for(int i=0;i<querys;i++){
            int a=reader.nextInt();
            int b=reader.nextInt();
            int n=reader.nextInt();
            for(int i1=0;i1<n;i1++){
                a=a+power(2,i1)*b;
                System.out.print(a+" ");  
            };
            System.out.println("");
        };
    };
    public static int power(int a, int b){
       int result=1;
       for(int i=0;i<b;i++){
           result=result*a;
       };
       return result;
    };
};
