package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        boolean m = ((a % 2) == 0);


        if (a == 0) {
            System.out.println("ноль");
        } else if (a < 0 && m) {
            System.out.println("отрицательное четное число");
        } else if (a > 0 && m) {
            System.out.println("положительное четное число");
        }else if (a < 0 && !m) {
            System.out.println("отрицательное нечетное число");
        } else  if(a > 0 && !m) {
            System.out.println("положительное нечетное число");
        }

    }
}