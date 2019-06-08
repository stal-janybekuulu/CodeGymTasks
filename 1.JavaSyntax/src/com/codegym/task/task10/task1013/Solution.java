package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String name;
        private Integer age;
        private Long address;
        private String sex;
        private Float soc;
        private String work;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(Integer age) {
            this.age = age;
        }

        public Human(Long address) {
            this.address = address;
        }

        public Human(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, Integer age, Long address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Human(String name, Integer age, Long address, String sex) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.sex = sex;
        }

        public Human(String name, Integer age, Long address, String sex, Float soc) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.sex = sex;
            this.soc = soc;
        }

        public Human(String name, Integer age, Long address, String sex, Float soc, String work) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.sex = sex;
            this.soc = soc;
            this.work = work;
        }

        public Human(Float soc) {
            this.soc = soc;
        }
    }
}
