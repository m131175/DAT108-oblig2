package Oppg1;

import java.util.function.BiFunction;

public class Oppg1b {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> max = (a, b) -> Math.max(a, b);
        BiFunction<Integer, Integer, Integer> absDiff = (a, b) -> Math.abs(a - b);

        int sum = calculate(12, 13, add);
        int largestNum = calculate(24, 39, max);
        int absoluteDiff = calculate(65, 56, absDiff);

        System.out.println("Addition: " + sum + "\nHighest number: "
                + largestNum + "\nAbsolute difference: " + absoluteDiff);
    }

    public static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> calculate) {
        return calculate.apply(a, b);
    }
}

