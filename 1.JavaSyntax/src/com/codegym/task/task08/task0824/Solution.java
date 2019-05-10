package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Human grandFather1 = new Human("John", true, 60);
        Human grandFather2 = new Human("Jack", true, 65);

        Human grandMother1 = new Human("Nina", false, 50);
        Human grandMother2 = new Human("Elis", false, 55);

        Human father = new Human("Scot", true, 30);
        Human mother = new Human("Stef", false, 27);

        Human child1 = new Human("Niff", true, 5);
        Human child2 = new Human("Nuff", true, 6);
        Human child3 = new Human("Naff", true, 7);

        grandFather1.children.add(father);
        grandMother1.children.add(father);

        grandFather2.children.add(mother);
        grandMother2.children.add(mother);

        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());

        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        //write your code here
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
