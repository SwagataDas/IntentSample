package com.example.sayan.intentsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        TextView textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        String textString = intent.getStringExtra("text");
        textView.append(textString);
    }
}
