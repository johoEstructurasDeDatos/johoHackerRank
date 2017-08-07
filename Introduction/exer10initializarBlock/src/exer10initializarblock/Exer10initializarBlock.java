package exer10initializarblock;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer10initializarBlock {
static int H;
static int B;
static boolean flag;
static{
    Scanner reader=new Scanner(System.in);
    H=reader.nextInt();
    B=reader.nextInt();
    flag=false;
    if(H<=0||B<=0){
        flag=false;
        System.out.print("java.lang.Exception: Breadth and height must be positive");
    }else{
        flag=true;
    };
};
    public static void main(String[] args){
        if(flag){
                int area=B*H;
                System.out.print(area);
        };
    };
};
