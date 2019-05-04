package com.codegym.task.task07.task0716;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
R or L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> rl = new ArrayList<>();
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).contains("r") && !list.get(i).contains("l")) {
                rl.add(list.get(i));
            }
            if (list.get(i).contains("r") && list.get(i).contains("l")) {
                /*l.add(list.get(i));
                list.remove(list.get(i));*/
            }
            else if (list.get(i).contains("l")) {
                al.add(list.get(i));
            }
        }

        for (String li: rl) {
            list.remove(li);
        }

        for (String li: al) {
            list.add(li);
        }
        return list;}
}