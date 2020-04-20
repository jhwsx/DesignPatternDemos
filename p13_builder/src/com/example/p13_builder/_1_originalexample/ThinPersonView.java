//package com.example.p13_builder._1_originalexample;
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
//    private final Path path;
//
//    public ThinPersonView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        paint.setColor(Color.GREEN);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(5f);
//        path = new Path();
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//        int w = getWidth();
//        int h = getHeight();
//        canvas.drawCircle(w / 2, h / 5, h / 6, paint); // 画头
//        float y = (float) (h / 6 * Math.sqrt(3) / 2 + h / 5);
//        float halfBodyWidth = h / 6 / 2;
//        float bodyHeight = h / 3;
//        path.moveTo(w / 2 - halfBodyWidth, y);
//        path.rLineTo(0, bodyHeight);
//        path.rLineTo(2 * halfBodyWidth, 0);
//        path.rLineTo(0, -bodyHeight);
//        canvas.drawPath(path, paint); // 画身体
//        path.reset();
//        path.moveTo(w / 2 - halfBodyWidth, y);
//        path.rLineTo(-w / 4, y / 4);
//        canvas.drawPath(path, paint); // 画左手
//        path.reset();
//        path.moveTo(w / 2 + halfBodyWidth, y);
//        path.rLineTo(w / 4, y / 4);
//        canvas.drawPath(path, paint); // 画右手
//        path.moveTo(w / 2 - halfBodyWidth, y + bodyHeight);
//        path.rLineTo(-w/5, h / 4);
//        canvas.drawPath(path, paint); // 画左脚
//        path.moveTo(w / 2 + halfBodyWidth, y + bodyHeight);
//        path.rLineTo(w / 5, h / 4);
//        canvas.drawPath(path, paint); // 画右脚
//    }
//}
