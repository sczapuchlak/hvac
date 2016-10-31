package com.company;

import java.util.Date;

public class WaterHeater extends ServiceCall {
    private int ageOfHeater;
    static int waterHeaterFee = 20;
    public WaterHeater(String serviceAddress, String problemDescription, Date date, int ageOfHeater) {

        super(serviceAddress, problemDescription, date);

        this.ageOfHeater = ageOfHeater;

    }

    public int getAgeOfHeater() {
        return ageOfHeater;
    }

    public void setAgeOfHeater(int ageOfHeater) {
        this.ageOfHeater = ageOfHeater;
    }

    @Override
    public String toString() {

        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);


        return "Water Heater Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Heater age:"+ ageOfHeater+"\n"+
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString +"\n"+
                "Mandatory Water Heater Charge:"+waterHeaterFee+"\n"+
                "Total Costs:$"+(fee+waterHeaterFee);



}}
