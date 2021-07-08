package com.company;

public class Payment extends AssignmentStatus{

    String studentName;
    int initialPayment;
    int installmentPayment;
    int examFee;

    public void totalPayment(){
        int totalBill = initialPayment + installmentPayment + examFee;

        System.out.println("Total Payment structure 01");
        System.out.println("Student Name "+studentName);
        System.out.println("Initial Payment "+installmentPayment);
        System.out.println("Installment Payment "+installmentPayment);
        System.out.println("Exam fee "+examFee);
        System.out.println("Total Bill "+totalBill);
        System.out.println();
    }

    public void totalPayment(int pay1){

        System.out.println("Total Payment structure 02");

    }

    public void totalPayment(int pay1, int pay2){

        System.out.println("Total Payment structure 03");

    }

}
