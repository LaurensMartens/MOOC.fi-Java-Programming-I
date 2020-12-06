/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Timer {
    private int hunSec;
    private int sec;
    private int limit;
    
    public Timer(){
        this.limit = 100;
        this.sec = 0;
        this.hunSec = 0;
    }
    
    public void advance(){
        this.hunSec++;
        if (this.hunSec >= this.limit){
            this.hunSec = 0;
            this.sec++;
        }
        if (this.sec >= 60) {
            this.sec = 0;
        }
    }
    @Override
    public String toString(){
        if (this.sec < 10) {
            if (this.hunSec < 10){
                return "0" + this.sec + ":" + "0" + this.hunSec;
            } else {
                return "0" + this.sec + ":" + this.hunSec;
            }
        } else {
            if (this.hunSec < 10){
                return this.sec + ":" + "0" + this.hunSec;
            } else {
                return this.sec + ":" + this.hunSec;
            }
    }
}
}
