package exer3substrings;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer3subStrings{
    public static String getSmallestAndLargest(String message,int num){
        String smallest="";
        String largest="";
        char MSM[]=message.toCharArray();
        
        for(int i=0;MSM.length-i>=num;i++){
            int position=i;
            int subStrings=(MSM.length-i)/num;
            for(int i1=0;i1<subStrings;i1++){
                String s="";
                for(int i2=0;i2<num;i2++){
                    s=s+MSM[position];
                    position++;
                };
                if(i==0&&i1==0){smallest=s;largest=s;};
                if(smallest.compareTo(s)<0){smallest=s;};
                if(largest.compareTo(s)>0){largest=s;};
            };
        };  
        return largest+"\n"+smallest;
    };

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String message=reader.next();
        int num=reader.nextInt();
        reader.close();
        System.out.println(getSmallestAndLargest(message,num));
     
    };
};
