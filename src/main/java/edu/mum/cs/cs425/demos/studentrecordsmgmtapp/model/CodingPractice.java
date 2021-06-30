package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.util.Arrays;

public class CodingPractice {

    static void printHelloWorld(int[] nums){

        Arrays.stream(nums)
                .mapToObj(x -> x%5 == 0 && x%7 == 0? "HelloWorld": x%5 == 0? "Hello": x%7 == 0? "World": "Neither")
                .forEach(System.out::println);
    }

    static void findSecondBiggest(int[] nums){

        Arrays.stream(nums)
                .filter(x -> x != Arrays.stream(nums).max().getAsInt())
                .max()
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {

        System.out.println("Question 5.5.1 with input {25,35,70,21,3}");

        int[] nums = new int[] {25,35,70,21,3};

        printHelloWorld(nums);
        System.out.println("Question 5.5.2 with input {25,35,70,21,3}");
        findSecondBiggest(nums);

    }

}
