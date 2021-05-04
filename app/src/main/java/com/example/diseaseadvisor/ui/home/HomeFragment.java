package com.example.diseaseadvisor.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.diseaseadvisor.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    Button button, button2, button3, button4;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        final TextView textView = root.findViewById(R.id.text_home);

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        button4 = (Button) root.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAfrica();
            }
        });
        button = (Button) root.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSouthAmerica();
            }
        });
        button2 = (Button) root.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEurope();
            }
        });
        button3 = (Button) root.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAsia();
            }
        });
        return root;
    }
    public void openAfrica(){
        Intent intent = new Intent(getView().getContext(), africa.class);
        startActivity(intent);
    }
    public void openSouthAmerica(){
        Intent intent = new Intent(getView().getContext(), southAmerica.class);
        startActivity(intent);
    }
    public void openAsia(){
        Intent intent = new Intent(getView().getContext(), asia.class);
        startActivity(intent);
    }
    public void openEurope(){
        Intent intent = new Intent(getView().getContext(), europe.class);
        startActivity(intent);
    }
}