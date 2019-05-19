package com.codegym.task.task09.task0918;

/* 
We're all friends here, even the exceptions

*/

public class Solution {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception, MyException2, MyException3, MyException4 {
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new MyException();
        if (i == 1)
            throw new MyException2();
        if (i == 2)
            throw new MyException3();
        if (i == 3)
            throw new MyException4();
    }
    
    static class MyException extends Exception{
    }

    static class MyException2 extends MyException{
    }

    static class MyException3 extends RuntimeException{
    }

    static class MyException4 extends  MyException3{
    }
}

