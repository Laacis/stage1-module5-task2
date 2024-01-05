package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return  numbers -> {
            List<Integer> result = new ArrayList<>();

            if (divider != 0) {
                for(Integer number : numbers){
                    int x = number / divider;
                    result.add(x);
                }
            } else {
                throw new ArithmeticException("Cannot divide by 0.");
            }

            return result;
        };
    }
}
