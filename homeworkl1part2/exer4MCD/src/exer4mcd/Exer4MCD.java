package exer4mcd;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer4MCD {
    
    public static void process(){
        Scanner in=new Scanner(System.in);
        int numOfProcess=in.nextInt();
        for(int i=0;i<numOfProcess;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            makeNumBinary(a,b);
        };
        in.close();
    };
    public static void makeNumBinary(int a,int b){
        int aModB=a%b;
        //String binaryNum;
        int binaryNum;
        if(aModB==0){
            binaryNum=biniToInt(buildBinary(a,a));
            //binaryNum=buildBinary(a,a);
        }else{
            //binaryNum=buildBinary(a,b);
            binaryNum=biniToInt(buildBinary(a,b));
        };
        System.out.println(binaryNum);
    };
    public static String buildBinary(int size,int a){
        String binaryNum="";
        boolean zeroOr=true;
        for(int i=0;i<size;i++){
            if(zeroOr==true){
                binaryNum=binaryNum+"1";
                zeroOr=false;
            }else if(zeroOr==false){
                for(int i1=0;i1<a-1&&i<size;i1++,i++){
                    binaryNum=binaryNum+"0";
                };
                i--;
                zeroOr=true;
            };
        };
        return binaryNum;
    };
    public static int biniToInt(String bini){
        System.out.println(bini);
        char convertBini[]=bini.toCharArray();
        int biniInt=0;
        for(int i=convertBini.length-1,i1=0;i>=0;i--,i1++){
            int multiplicator=0;
            int pow=(int)Math.pow(2,i1);
            multiplicator=convertBini[i]-48;
            biniInt=biniInt+(multiplicator*pow);
            //System.out.println(multiplicator+" * "+pow+" = "+multiplicator*pow);
        };
        
        return biniInt;  
    };
    public static void main(String[] args){
        process();
       //1System.out.println(biniToInt("100"));
    };  
};
