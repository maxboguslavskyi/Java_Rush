package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String s = "SSSSSSSSSS";
        int k = 0;
        while (k < 10) {
            System.out.println(s);
            k++;
        }


    }
}
