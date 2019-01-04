package com.hrf;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args){
        System.out.println("1222224638946");
        BigDecimal decimal=new BigDecimal(15600);
        BigDecimal x=decimal.divideAndRemainder(BigDecimal.valueOf(100))[1];
        System.out.println(x.intValue()==0);
    }
}
