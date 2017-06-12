package com.example.administrator.eventbus_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void click(View view){
        //5：发送消息
        EventBus.getDefault().post(new MyMessage("send message"));
        finish();
    }
}
