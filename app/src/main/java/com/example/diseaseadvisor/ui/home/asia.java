package com.example.diseaseadvisor.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.diseaseadvisor.R;

public class asia extends AppCompatActivity {

    TextView whoAsia, yf, df, malaria, chik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia);

        whoAsia = findViewById(R.id.textViewLink);
        whoAsia.setMovementMethod(LinkMovementMethod.getInstance());
        whoAsia.setTextColor(Color.parseColor("#04357A"));

        yf = findViewById(R.id.textView3);
        yf.setMovementMethod(LinkMovementMethod.getInstance());
        yf.setTextColor(Color.parseColor("#04357A"));

        malaria = findViewById(R.id.textView4);
        malaria.setMovementMethod(LinkMovementMethod.getInstance());
        malaria.setTextColor(Color.parseColor("#04357A"));

        df = findViewById(R.id.textView5);
        df.setMovementMethod(LinkMovementMethod.getInstance());
        df.setTextColor(Color.parseColor("#04357A"));

        chik = findViewById(R.id.textView6);
        chik.setMovementMethod(LinkMovementMethod.getInstance());
        chik.setTextColor(Color.parseColor("#04357A"));
    }
}