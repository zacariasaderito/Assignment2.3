package com.testString.testString;

public class underGrad extends student  implements loanInterest {
    
    
    public underGrad(String nm, String num, double amt){
      
        super(nm, num, amt);
        
    }
    
    public double interest()
    {
        return super.getLoanAmount() * 0.12;
    }
    
    
}
