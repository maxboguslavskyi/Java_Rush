package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i <array.size(); i++)
        {
            if (array.get(i) < minimum) minimum = array.get(i);
        }
        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++)
        {
            list.add(Integer.parseInt(br.readLine()));

        }
        return list;
    }
}