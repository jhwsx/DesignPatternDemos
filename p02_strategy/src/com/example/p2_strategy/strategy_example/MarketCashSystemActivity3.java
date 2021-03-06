package com.example.p2_strategy.strategy_example;//package com.example.p2_strategy.strategy_example;
//
//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ListView;
//import android.widget.Spinner;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.example.p2_strategy.R;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author wzc
// * @date 2018/10/2
// */
//public class MarketCashSystemActivity3 extends Activity {
//
//    private EditText mEtPrice;
//    private EditText mEtQuantity;
//    private Button mBtnConfirm;
//    private Button mBtnReset;
//    private ListView mListView;
//    private TextView mTvTotal;
//    private List<String> mData = new ArrayList<>();
//    private ArrayAdapter<String> mAdapter;
//    private double mTotal;
//    private Spinner mSpinner;
//
//    public static void start(Context context) {
//        Intent starter = new Intent(context, MarketCashSystemActivity3.class);
//        context.startActivity(starter);
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_market_cash_system_2);
//        initViews();
//        initData();
//    }
//
//    private double mDiscount = 1;
//    private String mCalculatedWay = "正常收费";
//    private CashContext mCashContext;
//    private void initData() {
//        mAdapter = new ArrayAdapter<>(MarketCashSystemActivity3.this,
//                android.R.layout.simple_list_item_1, mData);
//        mListView.setAdapter(mAdapter);
//        ArrayAdapter<CharSequence> spinnerAdapter
//                = ArrayAdapter.createFromResource(this, R.array.calculate_ways_2, android.R.layout.simple_spinner_item);
//        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        mSpinner.setAdapter(spinnerAdapter);
//        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                mCalculatedWay = (String) parent.getItemAtPosition(position);
//                switch (mCalculatedWay) {
//                    case "正常收费":
//                        mCashContext = new CashContext(new CashNormal());
//                        break;
//                    case "满300返100":
//                        mCashContext = new CashContext(new CashReturn(300,100));
//                        break;
//                    case "满200返50":
//                        mCashContext = new CashContext(new CashReturn(200,50));
//                        break;
//                    case "打八折":
//                        mCashContext= new CashContext(new CashRebate(0.8));
//                        break;
//                    case "打七折":
//                        mCashContext= new CashContext(new CashRebate(0.7));
//                        break;
//                    case "打五折":
//                        mCashContext= new CashContext(new CashRebate(0.5));
//                        break;
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//        mBtnConfirm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String price = mEtPrice.getText().toString();
//                String quantity = mEtQuantity.getText().toString();
//                if (TextUtils.isEmpty(price) || TextUtils.isEmpty(quantity)) {
//                    Toast.makeText(MarketCashSystemActivity3.this, "单价或数量不可以为空", Toast.LENGTH_LONG).show();
//                    return;
//                }
//
//                double result = mCashContext.getResult(Double.valueOf(price) * Integer.valueOf(quantity));
//                mData.add("单价: " + price + ", 数量: " + quantity + " " + mCalculatedWay + " 合计:" + result);
//                mAdapter.notifyDataSetChanged();
//                mTotal += result;
//                mTvTotal.setText("总计: " + mTotal + "");
//                mEtPrice.setText("");
//                mEtQuantity.setText("");
//                mEtPrice.requestFocus();
//            }
//        });
//
//        mBtnReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mData.clear();
//                mAdapter.notifyDataSetChanged();
//                mTotal = 0;
//                mTvTotal.setText("总计: " + mTotal + "");
//
//            }
//        });
//    }
//
//    private void initViews() {
//        mEtPrice = (EditText) findViewById(R.id.et_price);
//        mEtQuantity = (EditText) findViewById(R.id.et_quantity);
//        mBtnConfirm = (Button) findViewById(R.id.btn_confirm);
//        mBtnReset = (Button) findViewById(R.id.btn_reset);
//        mListView = (ListView) findViewById(R.id.listview);
//        mTvTotal = (TextView) findViewById(R.id.tv_total);
//        mSpinner = (Spinner) findViewById(R.id.spinner);
//    }
//}
