package org.fenixsoft.jvm.chapter10;

import java.util.List;

public class RemainedGram {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = 0;

        for(int i:list){
            sum += i;
        }

        System.out.println(sum);
    }
}
