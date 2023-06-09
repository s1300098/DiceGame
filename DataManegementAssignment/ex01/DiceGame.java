import java.util.Random;
import java.util.Scanner;
public class DiceGame {
    DiceGame(){
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
String name = sc.next();
System.out.println("Hello."+name+"!");
        System.out.println("Rolling dice...");
        Random r = new Random();
        int sum=0;
        int i=1;
        while(i<3){
        int n = r.nextInt(5);
        n = n%6+1;
        System.out.println("Die " +i+": "+n );
        sum+=n;
        i++;
        }
        System.out.println("Total value: " + sum);
                if(sum>=8)System.out.println(name+"won!");
        else System.out.println(name+"lost!");
    }
}