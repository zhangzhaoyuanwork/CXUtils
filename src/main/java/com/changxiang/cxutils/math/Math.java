package com.changxiang.cxutils.math;

import java.math.BigDecimal;

public class Math {

    //将Double以非科学计数法方式输出
    public String getDoubleValueToString(Double double1){
        return  new BigDecimal(double1).toString();

    }

}
