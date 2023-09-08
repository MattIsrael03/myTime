/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytime;

public class main {
    public static void main(String[] args) {
 
        MyTime myTime = new MyTime(18, 30, 0, true);

        System.out.println("Time in 12-hour format:");
        myTime.displayTime12();

        System.out.println("\nTime in 24-hour format:");
        myTime.displayTime24();

        myTime.advanceTime(3600);
        
        System.out.println("\nUpdated Time in 12-hour format:");
        myTime.displayTime12();

        System.out.println("\nUpdated Time in 24-hour format:");
        myTime.displayTime24();
        
        myTime.tickByMinute();

        System.out.println("\nUpdated Time in 12-hour format:");
        myTime.displayTime12();

        System.out.println("\nUpdated Time in 24-hour format:");
        myTime.displayTime24();
    }
}
