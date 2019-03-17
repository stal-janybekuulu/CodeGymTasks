package com.codegym.task.task07.task0712;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        //Чтение текста с консоли и добавление в массив
        for (int i=0; i<10; i++) {
            String text = scanner.nextLine();
            list.add(text);
        }

        //создание двух переменных для следующего цикла
        int max = 0;
        int min = Integer.MAX_VALUE;

        //циклы для присвоения значений переменным выше
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }

        //цикл для сравнения длины строк в массиве с макс и мин значениями
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).length() == min) {
                System.out.println(list.get(i));
                break;
            }
            else if (list.get(i).length() == max) {
                System.out.println(list.get(i));
                break;
            }
        }


    }

}
