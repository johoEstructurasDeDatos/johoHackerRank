package exer13currenyformatter;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer13currenyFormatter{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        double payment=reader.nextDouble();
        reader.close();                
        System.out.println("US: "+NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment));
        System.out.println("India: "+NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment));
        System.out.println("China: "+NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment));
        System.out.println("France: "+NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment));
    };
};
