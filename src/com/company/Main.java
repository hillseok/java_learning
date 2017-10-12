package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        week2();
    }

    public static void week2(){
        int[] array = new int[1000];
        Random random = new Random();
        long begin = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            int j = i - 1;
            int previousInt = j == -1 ? 0 : array[j];
            // 当前元素的值=上一个元素的值+随机的0或1+2
            array[i] = previousInt + random.nextInt(2) + 2;
        }
        long end = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.print("耗时");
        System.out.print(end - begin);
        System.out.print("纳秒");
    }
}
