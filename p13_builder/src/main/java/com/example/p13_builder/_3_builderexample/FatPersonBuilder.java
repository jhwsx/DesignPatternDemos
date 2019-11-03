package com.example.p13_builder._3_builderexample;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * @author wangzhichao
 * @date 2019/11/03
 */
public class FatPersonBuilder extends PersonBuilder {
    public FatPersonBuilder(Canvas canvas, Paint paint, int width, int height) {
        super(canvas, paint, width, height);
    }

    @Override
    public void buildHead() {
        canvas.drawCircle(w / 2, h / 5, h / 6, paint); // 画头
    }

    @Override
    public void buildBody() {
        float y = (float) (h / 6 * Math.sqrt(2) / 2 + h / 5);
        float halfBodyWidth = (float) (h / 6 * Math.sqrt(2) / 2);
        float bodyHeight = h / 3;
        path.moveTo(w / 2 - halfBodyWidth, y);
        path.rLineTo(0, bodyHeight);
        path.rLineTo(2 * halfBodyWidth, 0);
        path.rLineTo(0, -bodyHeight);
        canvas.drawPath(path, paint); // 画身体

    }

    @Override
    public void buildLeftArm() {
        float y = (float) (h / 6 * Math.sqrt(2) / 2 + h / 5);
        float halfBodyWidth = (float) (h / 6 * Math.sqrt(2) / 2);
        path.reset();
        path.moveTo(w / 2 - halfBodyWidth, y);
        path.rLineTo(-w / 4, y / 4);
        canvas.drawPath(path, paint); // 画左手

    }

    @Override
    public void buildRightArm() {
        float y = (float) (h / 6 * Math.sqrt(2) / 2 + h / 5);
        float halfBodyWidth = (float) (h / 6 * Math.sqrt(2) / 2);
        path.reset();
        path.moveTo(w / 2 + halfBodyWidth, y);
        path.rLineTo(w / 4, y / 4);
        canvas.drawPath(path, paint); // 画右手

    }

    @Override
    public void buildLeftLeg() {
        float y = (float) (h / 6 * Math.sqrt(2) / 2 + h / 5);
        float halfBodyWidth = (float) (h / 6 * Math.sqrt(2) / 2);
        float bodyHeight = h / 3;
        path.moveTo(w / 2 - halfBodyWidth, y + bodyHeight);
        path.rLineTo(-w/5, h / 4);
        canvas.drawPath(path, paint); // 画左脚

    }

    @Override
    public void buildRightLeg() {
        float y = (float) (h / 6 * Math.sqrt(2) / 2 + h / 5);
        float halfBodyWidth = (float) (h / 6 * Math.sqrt(2) / 2);
        float bodyHeight = h / 3;
        path.moveTo(w / 2 + halfBodyWidth, y + bodyHeight);
        path.rLineTo(w / 5, h / 4);
        canvas.drawPath(path, paint); // 画右脚
    }
}
