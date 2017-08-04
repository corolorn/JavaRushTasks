package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int max, mid, min = 0;
        max = Math.max(Math.max(a, b), c);
        min = Math.min(Math.min(a, b), c);
        mid = (a + b + c) - (max + min);

        System.out.println(max + " " + mid + " " + min);



    }
}
