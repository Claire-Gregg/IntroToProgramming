//Write a program to determine simulate the toss of a coin.
//For 10,000 tosses determine how many heads and how
//many tails are tossed. Also indicate what the last toss was.

import java.util.Random;

public class CoinToss {
    public static int HEADS_NUMBER = 1;
    public static int TAILS_NUMBER = 2;
    public static int MAX_NUMBER = 2;
    public static void main(String[] args) {
        int headsCount = 0;
        int tailsCount = 0;
        int lastCoinFlip = 0;
        for (int count  = 0; count < 10000; count++){
            Random generator = new Random();
            lastCoinFlip = (generator.nextInt(MAX_NUMBER) + 1);
            if (lastCoinFlip == HEADS_NUMBER)
                headsCount++;
            if (lastCoinFlip == TAILS_NUMBER)
                tailsCount++;
        }
        System.out.printf("%d heads were tossed. %d tails were tossed. The most recent toss was a %s.", headsCount, tailsCount, ((lastCoinFlip == HEADS_NUMBER)? "heads" : "tails"));
    }
}
