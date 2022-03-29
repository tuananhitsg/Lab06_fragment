package com.example.lab06_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.lab06_fragment.adapter.ShoeAdapter;
import com.example.lab06_fragment.model.Shoe;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private ListView listView;
    private List<Shoe> shoeList;
    private ShoeAdapter shoeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.listView);
        shoeList = new ArrayList<>();
        shoeList.add(new Shoe(R.drawable.shoes_rm_preview_b,"Nike shoes-discount 50%"));
        shoeList.add(new Shoe(R.drawable.shoes_rm_preview_a,"Adidas shoes-discount 80%"));
        shoeList.add(new Shoe(R.drawable.shoes_rm_purple,"Nike Bicycle-discount 30%"));
        shoeList.add(new Shoe(R.drawable.shoes_rm_preview,"Yonex shoes-discount 50%"));
        shoeList.add(new Shoe(R.drawable.shoes_rm_yellow,"Victor shoes-discount 50%"));
        shoeList.add(new Shoe(R.drawable.shoes_white_removebg_preview,"Lining shoes-discount 50%"));
        shoeAdapter = new ShoeAdapter(this,R.layout.shoe_item,shoeList);
        listView.setAdapter(shoeAdapter);
    }
}