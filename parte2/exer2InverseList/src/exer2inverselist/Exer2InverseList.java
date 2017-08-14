package exer2inverselist;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
/**
 *
 * @author ElJoho
 */
public class Exer2InverseList{
    public static void process(){
        Scanner in=new Scanner(System.in);
        int numOfTests=in.nextInt();
        for(int i=0;i<numOfTests;i++){
            System.out.print(readBuildAndCompare());
        };
    };
    public static String readBuildAndCompare(){
        Scanner in=new Scanner(System.in);
        HashMap list=new HashMap();
        HashMap inverse=new HashMap();
        int size=in.nextInt();
        System.out.print(size);
        for(int i=0;i<size;i++){
            int pos=in.nextInt();
            System.out.print(pos);
            list.put(i+1,pos);
            inverse.put(pos,i+1);
        };
        //print(list);print(inverse);
        return compare(list,inverse,size);
    };
    public static String compare(HashMap list,HashMap inverse,int size){
        String isInverse="inverse";
        for(int i=0;i<size&&isInverse=="inverse";i++){
            if(list.get(i)!=inverse.get(i))isInverse="not inverse";
            else isInverse="inverse";
        };
        return isInverse;
    };
    public static void print(HashMap hash){
    Iterator iterator = hash.keySet().iterator();
    while (iterator.hasNext()) {
       String key = iterator.next().toString();
       String value =hash.get(key).toString();
       System.out.println(key + " " + value);
    }
    };
    public static void main(String[] args){
        process();
    };
};
 
/*Sample input
2
3
3 1 2
3
1 2 3
*/