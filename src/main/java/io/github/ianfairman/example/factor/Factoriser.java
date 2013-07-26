package io.github.ianfairman.example.factor;

import java.util.ArrayList;
import java.util.List;

public class Factoriser {

    public List<Integer> factorise(int value) {
        List<Integer> result = new ArrayList<Integer>();
        int divisor = 2;
        while (value != 1) {
            while (value % divisor == 0) {
                result.add(divisor);
                value /= divisor;
            }
            divisor++;
        }
        return result;
    }
}
