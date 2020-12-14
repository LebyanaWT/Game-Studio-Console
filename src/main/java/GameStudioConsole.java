import dto.Player;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GameStudioConsole {

    public static FileProcessor fileProcessor;
    public static File file = new File("PlayersNames.txt");
    private static String playerInput;
    public static Player player;

    public static void main(String [] args) throws IOException {

        fileProcessor = new FileProcessor();
        fileProcessor.loadPlayersNamesFile(file);
        Scanner sc = new Scanner(System.in);
        playerInput = sc.nextLine();
        player = fileProcessor.processPlayerInput(playerInput);
        fileProcessor.processBet(player);
        displayBetResults(player);
    }

    public static void displayBetResults(Player player){
        System.out.println("Number : "  + " " + fileProcessor.number);
        System.out.println("Player    " + " "  + "Bet " +  " " + "Outcome " + " " + " Winnings" );
        System.out.println("-------------------------------");
        System.out.printf( player.getName() + " " +   player.getBet()  + "  " +  player.getOutcome() + " " + player.getWinnings());
    }
}
