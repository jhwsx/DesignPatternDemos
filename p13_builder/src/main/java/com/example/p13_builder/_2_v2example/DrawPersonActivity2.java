package com.example.p13_builder._2_v2example;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.p13_builder.R;

/**
 * @author wangzhichao
 * @date 2019/11/03
 */
public class DrawPersonActivity2 extends Activity {
    public static void start(Context context) {
        Intent starter = new Intent(context, DrawPersonActivity2.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_person_2);
    }
}

/*
 * 总结：
 * 1，思考一下：这个版本的优点以及缺点？
 * 优点：实现了瘦子和胖子代码的复用，因为把它们抽取出来了；
 * 缺点：还是存在不少代码重复的，比如绘制人的组成部分，只有细节的不同，大多数是相同的。
 */
