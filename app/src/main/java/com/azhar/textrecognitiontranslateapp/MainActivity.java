package com.azhar.textrecognitiontranslateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button detectBtn,captureBtn,galleryBtn,saveBtn;
    private ImageView preview_imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        detectBtn=findViewById(R.id.detectBtn);
        captureBtn=findViewById(R.id.capture_Btn);
        galleryBtn=findViewById(R.id.galleryBtn);
        setContentView(R.layout.activity_main);
        captureBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //setContentView(R.layout.preview_ocr);

           }
        });

    }
}
