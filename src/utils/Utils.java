package utils;

import java.util.Random;

public class Utils {
    public static int generateRandomInt(int min, int max){
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static double generateRandomDouble(int min, int max){
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    public static boolean generateRandomBoolean(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
