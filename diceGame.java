import java.util.*;

public class diceGame {
    public static void main(String [] args){
        int[] dice = {1, 2, 3, 4, 5, 6};
        Random r = new Random();
        int dice1 = dice[r.nextInt(5)];
        int dice2 = dice[r.nextInt(5)];

        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        scan.close();
        System.out.println("Hello," + name + "!");

        System.out.println("");

        System.out.println("Rolling the dice...");
        System.out.println("Die 1 : " + dice1 );
        System.out.println("Die 2 : " + dice2 );
        System.out.println("Total value : " + (dice1 + dice2));
        if((dice1 + dice2) > 7) {
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }
    }
}