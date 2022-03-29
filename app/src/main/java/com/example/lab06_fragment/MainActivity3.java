package com.example.lab06_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.lab06_fragment.model.Shoe;

public class MainActivity3 extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        Shoe shoe = (Shoe) intent.getSerializableExtra("shoes");
        imageView = findViewById(R.id.img_item);
        imageView.setImageResource(shoe.getImage());
    }
}