package com.example.lantern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bFlash;
    private Button bBlink;
    private FlashClass mFlashClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        bFlash = findViewById(R.id.btnOnOff);
        bBlink = findViewById(R.id.btnFlash);
        mFlashClass = new FlashClass(this);
    }
    //включить выключить фонарик
    public void onClickFlash(View view){
        if(mFlashClass.isFlash_status()){
            mFlashClass.flashOff();
            bFlash.setText("On");
        }else{
            mFlashClass.flashOn();
            bFlash.setText("Off");
        }
    }
    //вспышка
    public void onClickBlink(View view){
            mFlashClass.blink();

    }
}