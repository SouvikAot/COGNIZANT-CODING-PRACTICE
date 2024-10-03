/*Ass1*/
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        String str=" Technologies ";
        System.out.println("ENTER  FIRST AND SECOND STRING ");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String fstr=str1+str+str2;
        System.out.println(fstr);
        }
    }
