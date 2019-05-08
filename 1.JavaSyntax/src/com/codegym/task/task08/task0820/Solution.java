package com.codegym.task.task08.task0820;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //write your code here
        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            result.add(cat);
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        HashSet<Dog> dogs = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog();
            dogs.add(dog);
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        HashSet<Object> animals = new HashSet<>();
        animals.addAll(cats);
        animals.addAll(dogs);
        return animals;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        ArrayList<Object> list = new ArrayList<Object>(4);
        list.addAll(cats);
        Iterator<Object> itr = pets.iterator();
        while (itr.hasNext())
        {
            Object obj = itr.next();
            for (Object listObj : list)
            {
                if (obj.equals(listObj))
                {
                    itr.remove();
                }
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        for (Object b: pets) {
            System.out.println(b);
        }
    }

    //write your code here
    public static class Cat {}

    public static class Dog {}
}
