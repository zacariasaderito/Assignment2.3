package com.testString.testString;

public class smallBusiness implements loanInterest{
    
    // Variables 
    
    private String name;
    private String registerNum;
    private double loanAmount;
    
    
    public smallBusiness(String nm, String regnum, double amt)
    {
        name = nm;
        registerNum = regnum;
        loanAmount = amt;
        
    }
    
    public String toString()
    {
        return "SMALL BUSINESS" + "\nName" + name + "\nRegister Number" + registerNum + "\nAmount" + loanAmount + "\n";
    }
    
    public double interest()
    {
        return loanAmount * 0.15;
    }
    
}
