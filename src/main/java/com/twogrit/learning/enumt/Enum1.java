package com.twogrit.learning.enumt;

/**
 * Created by kezhang on 17/1/11.
 */
public enum Enum1 implements IEnum {
    AA("aa","aa"),
    BB("bb","bb");
    String k;
    String v;

    Enum1(String k, String v) {
        this.k = k;
        this.v = v;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }
}
