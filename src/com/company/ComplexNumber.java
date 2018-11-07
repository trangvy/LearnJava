package com.company;

public class ComplexNumber {
    int re;
    int im;

    static ComplexNumber plus(ComplexNumber a, ComplexNumber b) {

        ComplexNumber num = new ComplexNumber();
        num.re = a.re + b.re;
        num.im = a.im + b.im;

        return num;
    }

    static ComplexNumber brand(ComplexNumber a, ComplexNumber b) {
        ComplexNumber num = new ComplexNumber();
        num.re = a.re - b.re;
        num.im = a.im - b.im;

        return num;
    }

    static int dolon(ComplexNumber a) {
        int dolon;
        dolon  = Math.abs(a.re) + Math.abs(a.im);

        return dolon;
    }
}
