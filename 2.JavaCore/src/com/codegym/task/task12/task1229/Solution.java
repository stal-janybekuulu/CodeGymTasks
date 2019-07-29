package com.codegym.task.task12.task1229;

/* 
Parent of the CTO class

*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    static public class h{
        public void workHard() {

        }
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends h implements Businessman {

    }
}
