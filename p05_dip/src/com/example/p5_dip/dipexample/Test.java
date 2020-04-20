package com.example.p5_dip.dipexample;

/**
 * @author wzc
 * @date 2018/10/15
 */
public class Test {
    public static void main(String[] args) {
        Xiaoming xiaoming = new Xiaoming();

        LiteraryClassic literaryClassic = new LiteraryClassic();

        xiaoming.read(literaryClassic);

        Novel novel = new Novel();

        xiaoming.read(novel);
    }
}
