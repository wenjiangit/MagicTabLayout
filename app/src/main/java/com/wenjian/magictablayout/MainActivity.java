package com.wenjian.magictablayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wenjian.library.MagicTabLayout;

public class MainActivity extends AppCompatActivity {


    private static final String[] TITLES = {
            "影音娱乐", "环境健康", "生活电器", "安防警戒", "运动健康", "厨卫电器", "网络设备"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MagicTabLayout tab1 = findViewById(R.id.tab1);
        for (String title : TITLES) {
            tab1.addTab(tab1.newTab().setText(title));
        }

        MagicTabLayout tab2 = findViewById(R.id.tab2);
        for (String title : TITLES) {
            tab2.addTab(tab2.newTab().setText(title));
        }

        MagicTabLayout tab3 = findViewById(R.id.tab3);
        for (String title : TITLES) {
            tab3.addTab(tab3.newTab().setText(title));
        }


    }
}
