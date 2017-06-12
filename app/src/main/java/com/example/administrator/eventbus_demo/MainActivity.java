package com.example.administrator.eventbus_demo;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.testView);
        //1:注册
        EventBus.getDefault().register(this);

    }
    //2：解注册
    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
    //4:接收消息
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void getMessage(MyMessage message){
        textView.setText(message.name);
    }
    public void click2(View view){
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }

}
