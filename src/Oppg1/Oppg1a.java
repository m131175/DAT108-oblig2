package Oppg1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Oppg1a {

    public static void main(String[] args) {
        List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");

        listen.sort(Comparator.comparing(item -> new BigInteger(item)));
        //Collections.sort(listen, (a, b) -> Integer.parseInt(a)-Integer.valueOf(b)); // Alternative

        for(String item : listen) {
            System.out.println(item);
        }
    }
}
