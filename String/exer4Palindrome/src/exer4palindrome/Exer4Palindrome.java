package exer4palindrome;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer4Palindrome {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String message=reader.next();
        char MSM[]=message.toCharArray();
        String reverseMSM="";
        for(int i=MSM.length-1,i1=0;i>=0;i--,i1++){
            reverseMSM=reverseMSM+MSM[i];
        };
        if(reverseMSM.compareTo(message)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    };
};
