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

public class MyTime {

private int hours;
private int minutes;
private int seconds;
private boolean meridean;


public MyTime(int hours, int minutes, int seconds, boolean meridean){

    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
    this.meridean = meridean;
}


public int getHours() {
    return hours;
}

public int getMinutes() {
    return minutes;
}
 
public int getSeconds() {
    return seconds;
}
 
public int getMeridean() {
    return minutes;
}

public void setHours(int hours) {
    this.hours = hours;
}

public void setMintues(int minutes){
    this.minutes = minutes;
}

public void setMeridean(boolean meridean){
    this.meridean = meridean;
}

public void setSeconds(int seconds){
    this.seconds = seconds;
}

// Public Classes
public void advanceTime(int seconds) {
    int totalSeconds = this.seconds + seconds;
    this.seconds = totalSeconds % 60;

int totalMinutes = this.minutes + totalSeconds / 60;
    this.minutes = totalMinutes % 60;

int totalHours = this.hours + totalMinutes / 60;
    this.hours = totalHours % 12; 

if (totalHours >= 12) {
    this.meridean = !this.meridean;
    }
}

public void tickBySecond() {
    advanceTime(1);
}

public void tickByMinute() {
    advanceTime(60);
}

public void tickByHour() {
    advanceTime(3600);
}

public void displayTime12() {
    String meridianStr = meridean ? "PM" : "AM";
    System.out.printf("%02d:%02d:%02d %s%n", hours, minutes, seconds, meridianStr);
}

public void displayTime24() {
    System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
