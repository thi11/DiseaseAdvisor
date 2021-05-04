package com.example.diseaseadvisor.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.diseaseadvisor.R;

public class europe extends AppCompatActivity {

    TextView whoEurope, HIV, malaria, tb, measles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europe);

        whoEurope = findViewById(R.id.textViewLink);
        whoEurope.setMovementMethod(LinkMovementMethod.getInstance());
        whoEurope.setTextColor(Color.parseColor("#04357A"));

        HIV = findViewById(R.id.textView3);
        HIV.setMovementMethod(LinkMovementMethod.getInstance());
        HIV.setTextColor(Color.parseColor("#04357A"));

        malaria = findViewById(R.id.textView4);
        malaria.setMovementMethod(LinkMovementMethod.getInstance());
        malaria.setTextColor(Color.parseColor("#04357A"));

        tb = findViewById(R.id.textView5);
        tb.setMovementMethod(LinkMovementMethod.getInstance());
        tb.setTextColor(Color.parseColor("#04357A"));

        measles = findViewById(R.id.textView6);
        measles.setMovementMethod(LinkMovementMethod.getInstance());
        measles.setTextColor(Color.parseColor("#04357A"));
    }
}