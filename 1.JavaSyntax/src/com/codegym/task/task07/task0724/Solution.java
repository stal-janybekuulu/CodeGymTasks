package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        Human oneHuman = new Human("Jack", true, 20);
        Human twoHuman = new Human("John", true, 21);
        Human threeHuman = new Human("Joe", true, 22);
        Human fourHuman = new Human("James", true, 23);

        Human fiveHuman = new Human("An", true, 10, oneHuman.father, oneHuman.mother);
        Human sixHuman = new Human("Lex", true, 9, twoHuman.father, twoHuman.mother);
        Human sevenHuman = new Human("Smith", true, 8, threeHuman.father, threeHuman.mother);
        Human eight = new Human("Alice", true, 7, fourHuman.father, fourHuman.mother);
        Human nineHuman = new Human("Nick", true, 6, fiveHuman.father, fiveHuman.mother);

        System.out.println(oneHuman.toString());
        System.out.println(twoHuman.toString());
        System.out.println(threeHuman.toString());
        System.out.println(fourHuman.toString());
        System.out.println(fiveHuman.toString());
        System.out.println(sixHuman.toString());
        System.out.println(sevenHuman.toString());
        System.out.println(eight.toString());
        System.out.println(nineHuman.toString());
    }

    public static class Human {
        // write your code here
        String name;
        boolean sex;
        int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}