//package com.example.p13_builder._1_originalexample;
//
//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//
//import com.example.p13_builder.R;
//
///**
// * @author wangzhichao
// * @date 2019/11/03
// */
//public class DrawPersonActivity1 extends Activity {
//    public static void start(Context context) {
//        Intent starter = new Intent(context, DrawPersonActivity1.class);
//        context.startActivity(starter);
//    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_draw_person_1);
//    }
//}
//
///**
// * 总结：
// * 1，思考一下这个版本有什么问题？
// * 代码没有复用，画胖子和瘦子除了个别地方不同之外，大多数是一样的。
// * 另外，由于代码没有复用，在改动的过程中，也容易出错。
// */
