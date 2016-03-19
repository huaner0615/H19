package com.example.huan0615.h19;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private TextView t;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /*  t = (TextView)findViewById(R.id.tv);
        handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                String info = msg.getData().getString("info");
                t.setText(info);

            }
        };*/
    }
/*    public void click(View v){
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Message mes = new Message();
                Bundle b = new Bundle();
                b.putString("info", "changing");
                mes.setData(b);
                handler.sendMessage(mes);
            }
        }.start();
    }*/

    public void start(View v){

    }
}
