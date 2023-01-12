package com.bridgelabz;

public class SnakeAndLadder {
    final static int source =0;
    final static int destination =100;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");

        int position1=0,diceRoll1=0,position2=0,diceRoll2=0;
        while(position1 < destination && position2 < destination)
        {
            diceRoll1++;
            int randomCheck = (int) Math.floor(Math.random ()* 10) % 6+1;
            int randomCheck2 = (int) (Math.random()* 10 )% 3;
            switch (randomCheck2) {
                case 0:
                    System.out.println("No Play");
                    position1 +=0;
                    break;
                case 1:
                    System.out.println("Ladder");
                    position1 +=randomCheck;
                    break;
                case 2:
                    System.out.println("Snake");
                    position1 -=randomCheck;
                    break;
            }
            if (position1 == 100) {
                break;
            } else if (position1 > 100) {
                position1 -= randomCheck;
                System.out.println("Invalid Dice Face. You are staying on same position.");
            } else if (position1 < 0) {
                position1 = source;
                System.out.println("You came back to start.");
            } else {
                System.out.println("New Position: " + position1);
            }

            diceRoll2++;
            int randomCheck1 = (int) Math.floor(Math.random() * 10) % 6+1;
            int randomPlay1 = (int) (Math.random() * 10) % 3;
            switch(randomPlay1) {
                case 0:
                    System.out.println("No play");
                    position2+=0;
                    break;
                case 1:
                    System.out.println("Ladder");
                    position2 += randomCheck1;
                    break;
                case 2:
                    System.out.println("Snake");
                    position2 -= randomCheck1;
                    break;
            }
            if (position2 == 100) {
                break;
            } else if (position2 > 100) {
                position2 -= randomCheck1;
                System.out.println("Not valid Dice Face. You are staying on same position.");
            } else if (position2< 0) {
                position2 = source;
                System.out.println("You came back to start.");
            } else {
                System.out.println("New Position of player2: " + position2);
            }
        }
        System.out.println("Player1's position is : "+position1);
        System.out.println("Number of times game played : "+diceRoll1);
        System.out.println("Player2's position is : "+position2);
        System.out.println("Number of times game played : "+diceRoll2);
        if (position1==100) {
            System.out.println("Player1 has Won");
        }else {
            System.out.println("Player2 has Won");
        }
    }}
