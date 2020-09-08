package com.liyuan.convert;

public enum  AEnum {
    A(1),B(2),C(3),D(4),E(5),F(6),G(7);
    private int value;

    AEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
