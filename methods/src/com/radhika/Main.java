package com.radhika;

public class Main
{

    public static void main(String[] args)
    {
//        calculateScore(true, 5, 800,100);
//        calculateScore(true, 8,10000,200);

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Radhika", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Abhishek", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Rohit", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Pranav", highScorePosition);
    }
//    public static int calculateScore(boolean gameOver, int gameLevel, int score, int bonus)
//    {
//        if (gameOver) {
//            int finalScore = score + (gameLevel * bonus);
//            System.out.println("Your Final score is : " + finalScore);
//            return finalScore;
//        }
//
//        return -1;


    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >=1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore <= 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore <= 500) {
            return 3;
        } else {
            return 4;
        }
    }
}


