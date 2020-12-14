import dto.Player;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FileProcessor {

    private BufferedWriter bw;
    private List<String> players = new ArrayList<>();
    private BufferedReader br ;
    private String [] data;
    private Random rndNumber = new Random();
    int number = rndNumber.nextInt(35);
    private int countBets = 0;
    private Player player = new Player();

    public void loadPlayersNamesFile(File file) throws IOException {
        if(!file.exists()) {
            System.out.printf("File Not Found ... Creating a new one");
            file.createNewFile();
        }
    }

    public Player processPlayerInput(String playerInput) {
        data = playerInput.split("\\s+");
        countBets++;
        player.setName(data[0]);
        player.setBet(data[1]);
        player.setBetAmount(Double.parseDouble(data[2]));
        return player;
    }

    public void processBet(Player player) {
        for(int i = 0 ; i < 30000 ;i++){
            number+=1;
        }

        double amount = 0;
        if(player.getBet().equalsIgnoreCase("EVEN")){
            if(number % 2 == 0) {
                player.setOutcome("WIN");
                amount = player.getBetAmount() * 2;
                player.setWinnings(amount);
            }
        } else if(player.getBet().equalsIgnoreCase("ODD")) {
            if(number % 2 != 0){
                player.setOutcome("WIN");
                amount = player.getBetAmount() * 2;
                player.setWinnings(amount);
            }

        } else {
            if(number >= 1 || number <= 36 ){
                player.setOutcome("WIN");
                amount = player.getBetAmount() * 36;
                player.setWinnings(amount);
            } else {
                player.setOutcome("LOSE");
                amount = player.getBetAmount() * 0.00;
                player.setWinnings(amount);
            }
        }
    }
}
