package com.java.introoops;

import java.math.BigDecimal;

public class SICalc {
    BigDecimal P;
    BigDecimal I;
    public SICalc(String P,String I){
    this.P = new BigDecimal(P);
    this.I = new BigDecimal(I);
    }

    public BigDecimal calcTotalValue(int noOfYears) {
        BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);

        //totalValue = P+P*I*noOfYears
        BigDecimal totalValue = P.add(P.multiply(I).multiply(noOfYearsBigDecimal));
        return  totalValue;
    }
}
