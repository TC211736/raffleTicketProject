package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static ArrayList tickets = new ArrayList();

    Random r = new Random();

    public static void buyTicket() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        boolean endWhile = false;
        while (!endWhile) {
            int raffleNumber = r.nextInt(1000);
            if (tickets.contains(r)) {
                endWhile = false;
            } else {
                System.out.println("What is your name?");
                tickets.add(raffleNumber);

                System.out.println("Your ticket number is " + raffleNumber);
                endWhile = true;
            }
        }
    }

    public static void checkTicket() {

    }

    public static void main(String[] args) {

        try {
            System.out.println("Would you like to check a raffle ticket or purchase one?");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = bufferedReader.readLine();
            switch (userInput) {
                case "purchase":
                    buyTicket();
                    break;
                case "check":
                    checkTicket();
                    break;
            }
        } catch (IOException e) {
            System.out.println("Error in main method");
        }

    }
}
