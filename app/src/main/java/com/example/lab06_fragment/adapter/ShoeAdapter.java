package com.example.lab06_fragment.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lab06_fragment.MainActivity3;
import com.example.lab06_fragment.R;
import com.example.lab06_fragment.model.Shoe;

import java.util.List;

public class ShoeAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Shoe>  shoeList;
    private int positionSelect = -1;

    public ShoeAdapter(Context context, int idLayout, List<Shoe> shoeList) {
        this.context = context;
        this.idLayout = idLayout;
        this.shoeList = shoeList;
    }

    @Override
    public int getCount() {
            return shoeList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout,viewGroup,false);
        }
        TextView tvName = view.findViewById(R.id.tvName);
        ImageView img = view.findViewById(R.id.img_shoe_item);
        final Shoe shoes= shoeList.get(i);
        if (shoeList!= null && !shoeList.isEmpty()){
            tvName.setText(shoes.getName());
            img.setImageResource(shoes.getImage());
        }
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity3.class);
                intent.putExtra("shoes",shoes);
                context.startActivity(intent);
            }
        });
        return view;
    }
}
