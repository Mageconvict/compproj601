package org.finalproj.musictheoryapp;

public class StaffModel {
    private Cleff cleff;
    private int timeSig;
    private Bar bar;

    public StaffModel(Cleff cleff, int timeSig, Bar arrBars) {
        this.cleff = cleff;
        this.timeSig = timeSig;
        this.bar = arrBars;
    }
}
