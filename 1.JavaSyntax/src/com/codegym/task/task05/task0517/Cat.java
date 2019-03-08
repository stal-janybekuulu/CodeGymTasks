package com.codegym.task.task05.task0517;

/* 
Creating cats

Создайте класс Cat с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (стандартный вес)
- Вес, цвет (имя, адрес и возраст неизвестны; кошка бездомна)
- вес, цвет, адрес (чужой питомец)

Задача конструктора - сделать объект действительным.
Например, если вес неизвестен, то вам нужно указать средний вес.
Кошка не может ничего весить.
То же самое относится и к возрасту. Но может быть или не быть имя (то есть имя может быть нулевым).
То же самое относится и к адресу (он может быть нулевым).

*/

public class Cat {
    String name, address;
    int weight = 3;
    int age = 2;
    String color = "Black";


    public Cat(String name) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Cat(int weight, String color) {
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Cat(int weight, String color, String address) {
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
