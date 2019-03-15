package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandFather, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        //private Cat parent;
        //private Cat grandfather;
        //private Cat grandmother;
        private Cat father;
        private Cat mother;
        //private Cat son;
        //private Cat daughter;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            //this.parent = parent;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (father == null && mother == null)
                return "The cat's name is " + name + ", no mother " + ", no father";
            else if (father != null && mother == null)
                return "The cat's name is " + name + ", no mother " + ", " + father.name + " is the father";
            else if (father == null && mother != null)
                return "The cat's name is " + name + ", " + mother.name + " is the mother, no father";
            else if (father != null && mother != null)
                return "The cat's name is " + name + ", " + mother.name + "  is the mother," + father.name + "  is the father";
            else return "The cat's name is " + name + ", " + mother.name + "  is the mother," + father.name + "  is the father";
        }
    }

}
