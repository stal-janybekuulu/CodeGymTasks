package com.codegym.task.task13.task1313;

import java.awt.*;

/* 
A fox is an animal

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Fox fox = new Fox();
        fox.getName();

    }

    public interface Animal {
        Color getColor();

        default String getName() {
            return "Fox";
        }

    }

    public static class Fox implements Animal {

        @Override
        public Color getColor() {
            return null;
        }
    }
}