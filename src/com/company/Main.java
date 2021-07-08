package com.company;

public class Main {

    public static void main(String[] args) {

        Payment student1 = new Payment();
        Payment student2 = new Payment();

        student1.studentName = "Dhayan";
        student1.initialPayment = 1500;
        student1.installmentPayment = 15000;
        student1.examFee = 3500;
        student1.totalPayment();
        student1.firstSemester();
        student1.secondSemester();
        student1.thirdSemester();
        student1.certificateStatus();


        student2.studentName = "Arun";
        student2.installmentPayment = 8500;
        student2.installmentPayment = 9500;
        student2.examFee = 3500;
        student2.totalPayment();
        student2.firstSemester();
        student2.secondSemester();
        student2.thirdSemester();
        student2.certificateStatus();

    }
}
