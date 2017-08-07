package exer11inttostring;
import java.security.Permission;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer11intToString{
    public static void main(String[] args){
        DoNotTerminate.forbidExit();
        try{
        Scanner reader=new Scanner(System.in);
        int num=reader.nextInt();
        reader.close();
        String message=String.valueOf(num);
            if(num==Integer.parseInt(message)){
                System.out.println("Good job");
            }else{
                System.out.println("Wrong answer.");
            };
        }catch(DoNotTerminate.ExitTrappedException e){
            System.out.println("Unsuccessful Termination!!");
        };
    };
};
class DoNotTerminate{
    public static class ExitTrappedException extends SecurityException{
        private static final long serialVersionUID = 1;
    };
    public static void forbidExit(){
        final SecurityManager securityManager=new SecurityManager(){
            @Override
            public void checkPermission(Permission permission){
                if(permission.getName().contains("exitVM")){
                    throw new ExitTrappedException();
                };
            };
        };
        System.setSecurityManager(securityManager);
    };
};

