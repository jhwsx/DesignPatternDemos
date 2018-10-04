package com.example.p2_strategy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.p2_strategy.originalexample.MarketCashSystemActivity1;
import com.example.p2_strategy.simplefactory_example.MarketCashSystemActivity2;
import com.example.p2_strategy.strategy_example.MarketCashSystemActivity3;
import com.example.p2_strategy.strategy_simplefactory_example.MarketCashSystemActivity4;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         findViewById(R.id.btn_marketcashsystem_1).setOnClickListener(
                 new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 MarketCashSystemActivity1.start(MainActivity.this);
             }
         });
         findViewById(R.id.btn_marketcashsystem_2).setOnClickListener(
                 new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 MarketCashSystemActivity2.start(MainActivity.this);
             }
         });
         findViewById(R.id.btn_marketcashsystem_3).setOnClickListener(
                 new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 MarketCashSystemActivity3.start(MainActivity.this);
             }
         });
         findViewById(R.id.btn_marketcashsystem_4).setOnClickListener(
                 new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 MarketCashSystemActivity4.start(MainActivity.this);
             }
         });
    }
}
