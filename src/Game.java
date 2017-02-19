import java.util.Scanner;

/**
 * Created by johndavid on 2/12/17.
 */
public class Game {





    public static void main (String [] args) {


        System.out.println("Lets Play paer rock sicssors");



        Scanner input = new Scanner(System.in);

        String userChoice = "";
        String choice = "";

        System.out.println("So what will it be Paper Rock or Sicssors?");

        userChoice = input.nextLine();
        userChoice = userChoice.toUpperCase();
        char l1  = userChoice.charAt(0);

        if (l1 == 'R'||l1 == 'S'||l1 == 'P') {

            switch (l1) {

                case 'P':
                    return


            }

        }



        //if (userChoice.equalsIgnoreCase(""))












    }
}









