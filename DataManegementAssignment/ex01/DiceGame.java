import java.util.Random;
public class DiceGame {
    DiceGame(){
    }

    public static void main(String [] args){
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
                if(sum>=8)System.out.println("You won!");
        else System.out.println("You lost!");
    }
}