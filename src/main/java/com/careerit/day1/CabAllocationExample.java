package com.careerit.day1;

import java.util.Scanner;

public class CabAllocationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of people:");
        int count = sc.nextInt();
        System.out.println("Enter the cab capacity:");
        int capacity = sc.nextInt();

        int requiredCabs = 0;
        if(count % capacity == 0){
            requiredCabs = count/capacity;
        }
        else{
            requiredCabs = (count/capacity)+1;
        }
        System.out.println("Total "+ requiredCabs+" Cabs are required to accommodate "+count+" With cab capacity "+capacity);
    }
}
