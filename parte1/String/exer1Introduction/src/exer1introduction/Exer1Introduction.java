package exer1introduction;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer1Introduction{
    public static String toMayus(char arrayChar[]){
        String message="";
        if(arrayChar[0]>=97&&arrayChar[0]<=122){
            arrayChar[0]=(char)((int)arrayChar[0]-32);
        }else{
            arrayChar[0]=arrayChar[0];
        };
        for(int i=0;i<arrayChar.length;i++){
          message+=arrayChar[i];
        };
        return message;
    };
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        String message1=reader.next();
        String message2=reader.next();
        reader.close();
        
        char charMSM1[]=message1.toCharArray();
        char charMSM2[]=message2.toCharArray();
        message1=toMayus(charMSM1);
        message2=toMayus(charMSM2);
        charMSM1=message1.toCharArray();
        charMSM2=message2.toCharArray();
        
        String isGreater="no";
        for(int i=0,finish=0;finish==1;i++){
            if(charMSM1[i]<charMSM2[i]){
                finish=1;
                isGreater="yes";
            }else if(charMSM1[i]<charMSM2[i]){
                finish=1;
            }else if(finish==0&&charMSM1==null){
                finish=1;
            };
        };
        int totalLength=message1.length()+message2.length();
        message1=toMayus(charMSM1);
        message2=toMayus(charMSM2);
        System.out.print(totalLength+"\n"+isGreater+"\n"+message1+" "+message2);
    };
};
