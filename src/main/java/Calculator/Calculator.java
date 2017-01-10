package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alex on 10.01.2017.
 */
public class Calculator {

    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());

        int add = first + second;
        int sub = first - second;
        int mult = first * second;
        int div = first / second;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
    }
}