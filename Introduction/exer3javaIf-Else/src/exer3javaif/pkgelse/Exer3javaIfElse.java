package exer3javaif.pkgelse;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer3javaIfElse {
public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num1;
        int num2=2;
    
        num1=reader.nextInt();
        float proveNum=num1%num2;
        if(proveNum==0){
            if(num1>=2&&num1<=5||num1>20){
                System.out.println("Not Weird");
            }else{
                System.out.println("Weird");
            };
        }else{
            System.out.println("Weird");
        };
/**     Un mejor codigo que vale la pena probar 
        
        Scanner reader=new Scanner(System.in);
        int num1;
        int num2=2;
        boolean rightNum=false;
        
        System.out.print("Type a number: ");
        num1=reader.nextInt();

        while(rightNum==false){
            if(num1<1||num1>100){
                System.out.print("Your number has to be between 1 and 100. \nType the number again: ");
                num1=reader.nextInt();
                rightNum=false;
            }else{
                rightNum=true;
                float proveNum=num1%num2;
                if(proveNum==0){
                    if(num1>=2&&num1<=5||num1>20){
                        System.out.println("Not Weird");
                    }else{
                        System.out.println("Weird");
                    };
                }else{
                    System.out.println("Weird");
                };
            };
        };
**/
    };  
};
