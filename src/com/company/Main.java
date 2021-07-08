package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("This is main method!");
        studentResults(49,49);


    }

    public static void studentResults(int mk1, int mk2){

        int total = mk1 + mk2;
        System.out.println("Total "+total);
        studentAverage(total);

    }

    public static void studentAverage(int total){

        double avg = total / 2;
        System.out.println("Average "+avg);
        studentGrade(avg);
    }

    public static void studentGrade(double avg){
        String grade;

        if(avg >= 50){
            grade = "Pass";
        }else {
            grade = "Fail";
        }

        System.out.println("Grade "+grade);

    }
}
