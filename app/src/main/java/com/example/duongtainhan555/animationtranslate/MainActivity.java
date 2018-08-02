package com.example.duongtainhan555.animationtranslate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgTranslate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Init()
        Init();
        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.custom_image_translate);
        imgTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animation);
            }
        });
    }

    private void Init()
    {
        imgTranslate = findViewById(R.id.imgTranslate);
    }
}
