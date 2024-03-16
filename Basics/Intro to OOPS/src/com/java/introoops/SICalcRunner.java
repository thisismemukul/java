package com.java.introoops;

import java.math.BigDecimal;

public class SICalcRunner {
    public static void main(String[] arg){
    SICalc calc = new SICalc("4500.00","7.5");
        BigDecimal totalValue = calc.calcTotalValue(5);
        System.out.println(totalValue);
    }
}
