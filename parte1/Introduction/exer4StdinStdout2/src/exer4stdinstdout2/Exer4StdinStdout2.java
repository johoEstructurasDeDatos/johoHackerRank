package exer4stdinstdout2;
import java.util.Scanner;
/**
 *
 * @author ElJoho
 */
public class Exer4StdinStdout2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int num1=reader.nextInt();
        double num2=reader.nextDouble();
        reader.nextLine();
        String message=reader.nextLine();
        System.out.println("String: "+message);
        System.out.println("Double: "+num2);
        System.out.println("Int: "+num1);
    };
};

/* Explicación
    El comportamiento del nextInt() no es el que esperas. Cuándo le introduces de entrada 
    un numero:(por ejemlo)1714 ,en realidad estás introduciendo un 1714 y un salto de línea(\n) y el nextInt() no te consume el salto de línea (\n).
    Eso significa que el nextLine() está leyendo este salto de línea (que es vacío --> \n).
    Para solucionarlo, cuándo hagas un nextInt() pon siempre un nextLine() que no tendrá contenido.
*/
