package com.radhika;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the total score : ");
        boolean gameOver = true;
        int gameLevel = 5;
        int score = 800;
        int bonus = 100;
//		score = scan.nextInt();
//
//		if (score <= 5000 && score>=1000) {
//			System.out.println("Score is 5000!");
//		} else if(score <1000){
//			System.out.println("Score is very less");
//		} else if(score>5000){
//			System.out.println("Score is too high");
//		}
        if (gameOver) {
            int finalScore = score + (gameLevel * bonus);
            System.out.println("Your Final score is : " + finalScore);
        }
//
//		int levelCompleted =8;
//		int mySecondBonus =200;
//		int mySecondScore=10000;
//
//		if(gameOver){
//			int secondScore = mySecondScore + (levelCompleted * mySecondBonus);
//			System.out.println("My Second Score is : " + secondScore );
//		}

        gameOver = true;
        gameLevel = 8;
        score = 10000;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (gameLevel * bonus);
            System.out.println("My Second Score is : " + finalScore);
        }
//
    }
}