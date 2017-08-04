package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int countP = 0;
        int countN = 0;
        for (int i = 0; i < 3; i++) {arr[i] = Integer.parseInt(reader.readLine());}
        for (int i : arr) {if (i > 0) {countP++;}}
        for (int i : arr) {if (i < 0) {countN++;}}
        System.out.println("количество положительных чисел: " + countP);
        System.out.println("количество отрицательных чисел: " + countN);


    }
}
