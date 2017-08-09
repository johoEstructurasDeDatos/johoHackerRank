package exer1memorizame;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ElJoho
 */
public class Exer1Memorizame{
    public static ArrayList<Integer> setIntArray(){
        Scanner reader=new Scanner(System.in);
        int numGiven=reader.nextInt();
        ArrayList<Integer> nums=new ArrayList<Integer>();
        for(int i=0;i<numGiven;i++){
          nums.add(reader.nextInt());
        };
        return nums;
    };
    public static void judmentOfNums(ArrayList<Integer> nums){
        Scanner reader=new Scanner(System.in);
        int numGiven=reader.nextInt();
        for(int i=0;i<numGiven;i++){
            int numNow=reader.nextInt();
            int repetitions=0;
            for(int i1=0;i1<nums.size();i1++){
                if(nums.get(i1)==numNow)repetitions++;
            };
            if(repetitions!=0)System.out.println(repetitions);
            else System.out.println("NOT PRESENT");
        };
    };
    public static void main(String[] args) {
        ArrayList<Integer> numsToMemorarize=setIntArray();
        judmentOfNums(numsToMemorarize);
    };    
};
