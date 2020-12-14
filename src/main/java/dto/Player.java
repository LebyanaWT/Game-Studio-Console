package dto;

public class Player {

    private String name;
    private String bet;
    private String outcome;
    private double winnings;
    private double betAmount;
    private int numberOfBets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBet() {
        return bet;
    }

    public void setBet(String bet) {
        this.bet = bet;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public double getWinnings() {
        return winnings;
    }

    public void setWinnings(double winnings) {
        this.winnings = winnings;
    }

    public double getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(double betAmount) {
        this.betAmount = betAmount;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", bet='" + bet + '\'' +
                ", outcome='" + outcome + '\'' +
                ", winnings='" + winnings + '\'' +
                ", betAmount='" + betAmount + '\'' +
                '}';
    }
}
