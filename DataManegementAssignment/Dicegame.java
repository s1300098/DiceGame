package DataManegementAssignment;
import java.util.Random;
public class Dicegame {
    Dicegame(){
    }

    public static void main(String [] args){
        System.out.println("Rolling dice...");
        Random r = new Random();
        int sum=0;
        int i=1;
        while(i<3){
        int n = r.nextInt(6);
        n = n%6+1;
        System.out.println("Die " +i+": "+n );
        sum+=n;
        i++;
        }
        System.out.println("Total value: " + sum);
    }
}
