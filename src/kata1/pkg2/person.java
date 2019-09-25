/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata1.pkg2;

import java.util.Date;

/**
 *
 * @author marco
 */
public class person {
    private final String name;
    private final Date cumple;
    private static final int ms_per_second = 1000;
    private static final int second_per_minutes = 60;
    private static final int minutes_per_hour = 60;
    private static final int hour_per_day = 24;
    private static final double day_per_year = 365.25;
    private static final double ms_per_year = ms_per_second*second_per_minutes*minutes_per_hour*hour_per_day*day_per_year;
    public person(String name,Date cumple){
        this.name=name;
        this.cumple=cumple;
    }
        
    public String getName(){
        return name;
    } 
    public Date getCumple(){
        return cumple;
    }
    public double getAge(){
        long ms = new Date().getTime() -cumple.getTime();
        return toYears(ms);
    }

    private double toYears(long ms) {
        return ms/ms_per_year;
    }

    @Override
    public String toString() {
        return "person{" + "name=" + name + ", cumple=" + cumple + '}';
    }
}
