package exer1memorizame;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer1Memorizame{
    private static Scanner in=new Scanner(System.in);
    public static HashMap memorize(){
        HashMap memorizedNum=new HashMap();
        int readings=in.nextInt();
        for(int i=0;i<6;i++){
            int inputNum=in.nextInt();
            if(memorizedNum.containsKey(inputNum)){
                memorizedNum.put(inputNum,(int)memorizedNum.get(inputNum)+1);
            }else{
                memorizedNum.put(inputNum,1);
            };
        };
        return memorizedNum;
    };
    public static void remember(HashMap memorized){
        int readings=in.nextInt();
        for(int i=0;i<readings;i++){
            int existThisNum=in.nextInt();
            if(memorized.containsKey(existThisNum)){
                System.out.println(memorized.get(existThisNum));
            }else{
                System.out.println("NOT PRESENT");
            };
        };
    };
    public static void main(String[] args){
        remember(memorize());
        in.close();
    };    
};
/* 
6 
1 1 1 2 2 0 
6 
1 
2 
1 
0 
3 
4
*/