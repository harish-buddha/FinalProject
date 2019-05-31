package com.example.myandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Myandroidactivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myandroidactivity);
        textView=findViewById(R.id.chuck_tv);
        textView.setText(getIntent().getStringExtra("chuckjoke"));
    }
}
