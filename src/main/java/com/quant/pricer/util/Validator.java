package com.quant.pricer.util;

import java.util.List;

public class Validator {
    //List<?> wildcard(어떤 object도 List의 element로 올 수 있다.) List가 null이거나, element가 없을 시, true 반환
    public static boolean isEmpty(List<?> t) {
        return (t == null || t.size() == 0);
    }
}
