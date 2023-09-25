package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MinhaActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.layout_inicial);
    Button button = findViewById(R.id.botao1);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MinhaActivity.this, ActivityDois.class);
            startActivity(intent);
        }
    });
    }
}
