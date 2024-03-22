
package Rock_Paper;
import java.util.Scanner;
public class RockPaper {
 


        private static String PlayerName;
        private static int rounds;
        private static int PlayerScore=0,CompScore=0;
        private static Scanner ob = new Scanner(System.in);

        public static void RoundDetails() {

            System.out.println("Enter your name :");
            PlayerName = ob.nextLine();
            System.out.println("How many rounds you would like to play of rock paper scissors :");
            rounds = ob.nextInt();
        }
        public static void Game() {


            for (int round = 1 ; round <= rounds; round++) {
                int CompChoice = 1+(int)(Math.random()*3);
                System.out.println("\n Player Name : " + PlayerName);
                System.out.println("Round : "+ round +"/" + rounds);
                System.out.println("Choose your choice (Rock = 1/Paper = 2/Scissor = 3) : ");
                int PlayerChoice = ob.nextInt();
                if (PlayerChoice >=4){
                    System.out.println("Please enter the value 1 0r 2 0r 3");
                }
                else if ((PlayerChoice==1 && CompChoice==2) || (PlayerChoice==2 && CompChoice == 3) || (PlayerChoice==3&&CompChoice==1)) {
                    System.out.println("Computer Won the round");
                    CompScore++;
                }
                else if ((PlayerScore==1 && CompChoice == 3) || (PlayerChoice==2 && CompChoice==1) || (PlayerChoice == 3 && CompChoice==2)) {
                    System.out.println("Player won the round");
                    PlayerScore++;
                }
                else if (PlayerChoice ==CompChoice) {
                    System.out.println("Round is Draw");
                }
            }
        }
        public static void Result() {
            if (PlayerScore == CompScore) {
                System.out.println("Game is Draw.");
            }
            else if (PlayerScore < CompScore) {
                System.out.println("Computer won.");
            }
            else if (PlayerScore > CompScore) {
                System.out.println(PlayerName+" won the game.");
            }
        }
        public static void main(String[] args) {
            RoundDetails();
            Game();
            Result();
        }
    }




    

