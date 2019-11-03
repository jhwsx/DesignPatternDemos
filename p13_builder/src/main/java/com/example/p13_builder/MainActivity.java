package com.example.p13_builder;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.p13_builder._1_originalexample.DrawPersonActivity1;
import com.example.p13_builder._2_v2example.DrawPersonActivity2;
import com.example.p13_builder._3_builderexample.DrawPersonActivity3;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_originalexample).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawPersonActivity1.start(MainActivity.this);
            }
        });
        findViewById(R.id.btn_v2example).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawPersonActivity2.start(MainActivity.this);
            }
        });
        findViewById(R.id.btn_builderexample).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawPersonActivity3.start(MainActivity.this);
            }
        });
    }
}
