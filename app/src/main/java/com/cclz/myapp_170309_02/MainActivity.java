package com.cclz.myapp_170309_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb, pb2;
    SeekBar sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb=(ProgressBar) findViewById(R.id.progressBar);
        pb2=(ProgressBar) findViewById(R.id.progressBar2);
        sb=(SeekBar)findViewById(R.id.seekBar);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d("SB","" + progress); // 空字串 progress 自動轉為字串
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void click1(View v){
        pb.setVisibility(View.VISIBLE); //  Visibility 能見度，VISIBLE 有形
    }
    public void click2(View v){
        pb.setVisibility(View.INVISIBLE);   // INVISIBLE 無形
    }

    public void click3(View v){
        if(pb2.getProgress()>=100)
            pb2.setProgress(0);
        else
        pb2.setProgress(pb2.getProgress() + 10);    // Progress 前進
    }
}
