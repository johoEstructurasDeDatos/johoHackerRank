package exer3abstractclass;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
            return title;
    };
};
class MyBook extends Book{
    String title;
    public void setTitle(String title){
        this.title=title;
    };
    String getTitle(){
     return this.title;  
    };
};
public class Exer3abstractClass{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        String title=reader.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
      	reader.close();
    };
};
