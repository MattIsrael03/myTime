/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myTime;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        
        
        myTime.MyTime time = new myTime.MyTime(9, 30, 0, false); 

      
        System.out.println("Initial 12-hour format:");
        time.displayTime12();
        System.out.println("Initial 24-hour format:");
        time.displayTime24();
        
        
        time.tickBySecond();
        System.out.println("Time after ticking by one second:");
        time.displayTime12();
        
        
        time.tickByMinute();
        System.out.println("Time after ticking by one minute:");
        time.displayTime24();
        
        
        time.tickByHour();
        System.out.println("Time after ticking by one hour:");
        time.displayTime12();
    }
}
