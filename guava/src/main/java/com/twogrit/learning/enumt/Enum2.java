package com.twogrit.learning.enumt;

/**
 * Created by kezhang on 17/1/11.
 */
public enum Enum2 implements IEnum {
    CC("cc","cc"),
    DD("dd","dd");
    String k;
    String v;

    Enum2(String k, String v) {
        this.k = k;
        this.v = v;
    }

    @Override
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
