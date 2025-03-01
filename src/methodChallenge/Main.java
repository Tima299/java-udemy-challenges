package methodChallenge;

public class Main {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Temur", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("John", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Jane", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Tom", position);

        position = calculateHighScorePosition(25);
        displayHighScorePosition("James", position);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }
    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500 /*&& score < 1000*/) {
            position = 2;
        } else if (score >= 100 /*&& score < 500*/) {
            position = 3;
        }
        return position;
    }
}
