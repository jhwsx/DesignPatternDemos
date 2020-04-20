//package com.example.p13_builder._2_v2example;
//
//import android.content.Context;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.graphics.Path;
//import android.util.AttributeSet;
//import android.view.View;
//
///**
// * @author wangzhichao
// * @date 2019/11/03
// */
//public class ThinPersonView extends View {
//    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
//    private ThinPersonBuilder builder;
//
//    public ThinPersonView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        paint.setColor(Color.GREEN);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(5f);
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//        int w = getWidth();
//        int h = getHeight();
//        if (builder == null) {
//            builder = new ThinPersonBuilder(canvas, paint);
//        }
//        builder.build(w,h);
//    }
//}
