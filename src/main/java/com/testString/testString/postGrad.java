package com.testString.testString;

public class postGrad extends student  implements loanInterest {
    
    public postGrad(String nm, String num, double amt){
      
        super(nm, num, amt);
        
    }
    
    public double interest()
    {
        return super.getLoanAmount() * 0.10;
    }
    
    
}
