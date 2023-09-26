package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ActivityDois extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tela2);
        TextView textViewNomeUsuario = findViewById(R.id.telinha2);
        textViewNomeUsuario.setText(getString(R.string.app_name));

    Button button = findViewById(R.id.botao2);
    button.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        Intent intent = new Intent(ActivityDois.this, MinhaActivity.class);
        startActivity(intent);
    }
    });
    }
}

