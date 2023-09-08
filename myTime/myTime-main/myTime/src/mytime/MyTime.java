/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytime;

public class MyTime {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian;

    public MyTime(int hours, int minutes, int seconds, boolean meridian) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.meridian = meridian;
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

    public boolean getMeridian() {
        return meridian;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 11) {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        }
    }

    public void setMeridian(boolean meridian) {
        this.meridian = meridian;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        }
    }

    public void advanceTime(int seconds) {
        int totalSeconds = this.seconds + seconds;
        this.seconds = totalSeconds % 60;

        int totalMinutes = this.minutes + totalSeconds / 60;
        this.minutes = totalMinutes % 60;

        int totalHours = this.hours + totalMinutes / 60;
        this.hours = totalHours % 12;

        if (totalHours < 0) {
            totalHours += 12;
        }

        if (totalHours >= 12) {
            this.meridian = !this.meridian;
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
        String meridianStr = meridian ? "PM" : "AM";
        System.out.printf("%02d:%02d:%02d %s%n", hours, minutes, seconds, meridianStr);
    }

    public void displayTime24() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}

