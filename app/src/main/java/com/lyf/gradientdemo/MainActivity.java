package com.lyf.gradientdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Gradient mGradient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGradient = (Gradient) findViewById(R.id.gradient);
        //创建imageview
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.mipmap.image1);
        ImageView imageView2 = new ImageView(this);
        imageView2.setImageResource(R.mipmap.image2);
        ImageView imageView3 = new ImageView(this);
        imageView3.setImageResource(R.mipmap.image3);
        ImageView imageView4 = new ImageView(this);
        imageView4.setImageResource(R.mipmap.image4);
        List<ImageView> list = new ArrayList<>();
        list.add(imageView);
        list.add(imageView2);
        list.add(imageView3);
        list.add(imageView4);
        //设置图片即可
        mGradient.setImageViews(list);
    }
}
