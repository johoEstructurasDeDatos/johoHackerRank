package exer12datetime;
import java.util.Scanner;
import java.text.DateFormatSymbols;
import java.util.Calendar;
/**
 *
 * @author ElJoho
 */
public class Exer12dateTime {
    public static String getDay(String day,String month,String year){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Integer.parseInt(year),Integer.parseInt(month)-1,Integer.parseInt(day));
        String result=new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase();
        return result;
    };
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String month=reader.next();
        String day=reader.next();
        String year=reader.next();
        System.out.println(getDay(day, month, year));
    };  
};
