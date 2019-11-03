package com.example.p13_builder._3_builderexample;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * 抽象的建造人的类，可以把建造人的过程稳定住。
 * @author wangzhichao
 * @date 2019/11/03
 */
public abstract class PersonBuilder {
    protected Canvas canvas;
    protected Paint paint;
    protected Path path = new Path();
    protected int w;
    protected int h;
    public PersonBuilder(Canvas canvas, Paint paint, int width, int height) {
        this.canvas = canvas;
        this.paint = paint;
        this.w = width;
        this.h = height;
    }

    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildLeftArm();

    public abstract void buildRightArm();

    public abstract void buildLeftLeg();

    public abstract void buildRightLeg();
}
