package exer2substring;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer2subString {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String message=reader.next();
        int start=reader.nextInt();
        int end=reader.nextInt();
        
        char charMSM[]=message.toCharArray();
        String output="";
        for(int i=start;i<end;i++){
            output+=charMSM[i];
        };
        System.out.println(output);
    };
};
