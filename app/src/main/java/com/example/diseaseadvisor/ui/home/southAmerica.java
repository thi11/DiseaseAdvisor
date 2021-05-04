package com.example.diseaseadvisor.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.diseaseadvisor.R;

import org.w3c.dom.Text;

public class southAmerica extends AppCompatActivity {

    TextView whoAmericas, dengue, choler, lepto, HIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_america);

        whoAmericas = findViewById(R.id.textViewLink);
        whoAmericas.setMovementMethod(LinkMovementMethod.getInstance());
        whoAmericas.setTextColor(Color.parseColor("#04357A"));

        dengue = findViewById(R.id.textView3);
        dengue.setMovementMethod(LinkMovementMethod.getInstance());
        dengue.setTextColor(Color.parseColor("#04357A"));

        choler = findViewById(R.id.textView4);
        choler.setMovementMethod(LinkMovementMethod.getInstance());
        choler.setTextColor(Color.parseColor("#04357A"));

        lepto = findViewById(R.id.textView5);
        lepto.setMovementMethod(LinkMovementMethod.getInstance());
        lepto.setTextColor(Color.parseColor("#04357A"));

        HIV = findViewById(R.id.textView6);
        HIV.setMovementMethod(LinkMovementMethod.getInstance());
        HIV.setTextColor(Color.parseColor("#04357A"));
    }
}