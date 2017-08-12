package exer3sumacadenatexto;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer3sumaCadenaTexto{
    public static void sumOfCharacters(){
        Scanner reader=new Scanner(System.in);
        String text=reader.next();
        char txt[]=text.toCharArray();
        int sumOfChars=0;
        for(int i=0;i<txt.length;i++){
            sumOfChars+=(int)txt[i]-96;
        };
        System.out.println(sumOfChars); 
    };
    public static void main(String[] args){
        sumOfCharacters();
    };
};
