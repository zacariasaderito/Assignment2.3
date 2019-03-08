package com.testString.testString;

public class student {
    
    // Variables 
    private String name;
    private String studNum;
    private double loanAmount;
    
    public student (String nn, String num, double amt){
    
        name = nn;
        studNum = num;
        loanAmount = amt;
                
    }
    
    public double getLoanAmount()
    {
        return loanAmount;
    }


    
    @Override
    public String toString() {
        return "STUDENT " + "\nname=" + name + "\nstudNum=" + studNum + "\nloanAmount=" + loanAmount + "\n";
    }
    
    
    
    
}
