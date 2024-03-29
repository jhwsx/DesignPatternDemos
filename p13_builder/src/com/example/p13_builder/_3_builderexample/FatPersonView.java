//package com.example.p13_builder._3_builderexample;
//
//import android.content.Context;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.util.AttributeSet;
//import android.view.View;
//
///**
// * @author wangzhichao
// * @date 2019/11/03
// */
//public class FatPersonView extends View {
//    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
//    private ThinPersonBuilder builder;
//    private PersonDirector personDirector;
//
//    public FatPersonView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        paint.setColor(Color.GREEN);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(5f);
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//        if (personDirector == null) {
//            FatPersonBuilder fatPersonBuilder = new FatPersonBuilder(canvas, paint, getWidth(), getHeight());
//            personDirector = new PersonDirector(fatPersonBuilder);
//        }
//        personDirector.createPerson();
//    }
//}
