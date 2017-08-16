package exer4mcd;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author ElJoho
 */
public class Exer4MCD{
    public static void process(){
        Scanner in=new Scanner(System.in);
        int numOfProcess=in.nextInt();
        for(int i=0;i<numOfProcess;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            makeNumBinary(a,a,b);
        };
        in.close();
    };
    public static void makeNumBinary(int size,int a,int b){
        int aModB=a%b;
        BigInteger binaryNum=BigInteger.valueOf(0);
        if(aModB==0){
            binaryNum=biniToInt(buildBinary(size,a));
            System.out.println("This is the binary num: "+binaryNum);
        }else{
            makeNumBinary(size,b,aModB);
        };
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
        //System.out.print("binario: "+binaryNum+"\n");
        return binaryNum;
    };
    public static BigInteger biniToInt(String bini){
        BigInteger biniInt=new BigInteger(bini,2);
        BigInteger numerator=BigInteger.valueOf(7+(int)Math.pow(10,9));
        BigInteger result=biniInt.remainder(numerator);
        return result;  
    };
    public static void main(String[] args){
        process();
        //System.out.println(buildBinary(11,4));
    };  
};
/* sample output
5
3 1
3 2
5 2
10 4
100 3
*/