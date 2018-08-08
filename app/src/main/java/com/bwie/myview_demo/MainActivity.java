package com.bwie.myview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTitle myTitle = findViewById(R.id.MyTitle);
        myTitle.setOnClickCallBack(new MyTitle.setOnClickCallBack() {
            @Override
            public void LeftText() {

            }

            @Override
            public void CenterText() {

            }

            @Override
            public void RightText() {

            }
        });
    }
}
