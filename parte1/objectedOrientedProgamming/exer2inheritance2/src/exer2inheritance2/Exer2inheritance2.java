package exer2inheritance2;
/**
 *
 * @author ElJoho
 */
class Arithmetic{
    int add(int num1,int num2){
        return num1+num2;
    };
};
class Adder extends Arithmetic{
};
public class Exer2inheritance2{
    public static void main(String[] args){
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    };  
};
