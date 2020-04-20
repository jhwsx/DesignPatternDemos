//package com.example.p13_builder._2_v2example;
//
//import android.graphics.Canvas;
//import android.graphics.Paint;
//import android.graphics.Path;
//
///**
// * @author wangzhichao
// * @date 2019/11/03
// */
//public class FatPersonBuilder {
//    private Canvas canvas;
//    private Paint paint;
//    private Path path = new Path();
//    public FatPersonBuilder(Canvas canvas, Paint paint) {
//        this.canvas = canvas;
//        this.paint = paint;
//    }
//
//    public void build(int w, int h) {
//        canvas.drawCircle(w / 2, h / 5, h / 6, paint); // 画头
//        float y = (float) (h / 6 * Math.sqrt(2) / 2 + h / 5);
//        float halfBodyWidth = (float) (h / 6 * Math.sqrt(2) / 2);
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
