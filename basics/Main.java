import java.util.Random;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        pluralize("cat", 3);
        flipNHeads(2);
        clock();
    }

    public static void pluralize(String wordArg, Integer numberArg) {
        String word = wordArg;
        int num = numberArg;
        if (num >= 0) {
            String string = "I have " + num + " " + word + "s.";
            System.out.println(string);
            // return string;
        }
    }

    public static void flipNHeads(Integer numberArg) {
        int flipsCounter = 0;
        int headsCounter = 0;
        Random rand = new Random();
        while (headsCounter < numberArg) {
            float randNum = rand.nextFloat();
            if (randNum > .5) {
                headsCounter++;
                System.out.println("Heads!");
            } else {
                headsCounter = 0;
                System.out.println("Tails!");
            }
            flipsCounter++;
        }
        System.out.println("It took " + flipsCounter + " flips to get " + numberArg + " heads in a row.");
    }

    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        int prevSecond = now.getSecond();
        while (true) {
            now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            if (second - prevSecond >= 1) {
                prevSecond = second;
                String currentTime = hour + ":" + minute + ":" + second;
                System.out.println(currentTime);
            }
        }
    }

    public static void analyzeWeatherData(int[][] arrayofArraysArg) {
        Hashset<Integer> monthTemperatures = new HashSet<Integer>();
        monthTemperatures.add()
    }

}
