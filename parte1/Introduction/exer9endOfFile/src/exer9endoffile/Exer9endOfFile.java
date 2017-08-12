package exer9endoffile;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer9endOfFile{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        for(int i=1;reader.hasNext();i++){
            System.out.println(i+" "+reader.nextLine());
        };
    };
};
