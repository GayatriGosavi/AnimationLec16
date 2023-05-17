package com.example.animationlec16;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    boolean isbroom=true;
    public void change(View view)
    {
        ImageView imageView=findViewById(R.id.imageView);
        ImageView imageView2=findViewById(R.id.imageView2);
        if(isbroom)
        {
            imageView.animate().alpha(1).setDuration(3000);
            imageView2.animate().alpha(0).setDuration(3000);
            isbroom=false;
        }
        else
        {
            imageView.animate().alpha(0).setDuration(5000);
            imageView2.animate().alpha(1).setDuration(5000);
            isbroom=true;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.imageView);
        imageView.animate().setDuration(3000).alpha(0);
    }
}