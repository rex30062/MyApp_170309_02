package com.cclz.myapp_170309_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb, pb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb=(ProgressBar) findViewById(R.id.progressBar);
        pb2=(ProgressBar) findViewById(R.id.progressBar2);
    }
    public void click1(View v){
        pb.setVisibility(View.VISIBLE); // 顯示
    }
    public void click2(View v){
        pb.setVisibility(View.INVISIBLE);   // 隱藏
    }

    public void click3(View v){
        pb2.setProgress(pb2.getProgress() + 10);
    }
}
