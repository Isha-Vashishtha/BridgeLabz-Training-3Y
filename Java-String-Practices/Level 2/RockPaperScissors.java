import java.util.*;

public class RockPaperScissors {

    public static String getComputerChoice() {
        String[] options = {"rock","paper","scissors"};
        int index = (int)(Math.random()*3);
        return options[index];
    }

    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";
        if (player.equals("rock") && computer.equals("scissors") ||
            player.equals("scissors") && computer.equals("paper") ||
            player.equals("paper") && computer.equals("rock"))
            return "Player";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many games? ");
        int games = sc.nextInt();

        int playerWins=0, compWins=0, draws=0;

        for (int i=0;i<games;i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String player = sc.next().toLowerCase();
            String computer = getComputerChoice();

            String winner = findWinner(player, computer);
            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;

            System.out.println("Game " + (i+1) + ": Player=" + player + ", Computer=" + computer + " => " + winner);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);

        System.out.printf("Player Win %%: %.2f\n", (playerWins*100.0/games));
        System.out.printf("Computer Win %%: %.2f\n", (compWins*100.0/games));
    }
}
