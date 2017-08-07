package exer4interface;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
interface AdvancedArithmetic{
    int divisorSum(int num);
};
class MyCalculator implements AdvancedArithmetic{
    public int divisorSum(int num){
        int divisorSum=0;
        for(int i=1;i<num+1;i++){
            int module=num%i;
            if(module==0){
                divisorSum=divisorSum+i;
            }else{
                divisorSum=divisorSum;
            };
        };
        return divisorSum;  
    };
};
public class Exer4Interface{
    public static void main(String []args){
        MyCalculator my_calculator=new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner reader=new Scanner(System.in);
        int num=reader.nextInt();
        System.out.print(my_calculator.divisorSum(num)+"\n");
      	reader.close();
    };
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces=o.getClass().getInterfaces();
        for (int i=0;i<theInterfaces.length; i++){
            String interfaceName=theInterfaces[i].getName();
            System.out.println(interfaceName);
        };
    };
};
