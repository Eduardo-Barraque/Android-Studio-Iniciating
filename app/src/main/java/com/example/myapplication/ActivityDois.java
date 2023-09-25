package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ActivityDois extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tela2);
        TextView textViewNomeUsuario = findViewById(R.id.telinha2);
        textViewNomeUsuario.setText(getString(R.string.app_name));
    }
}
