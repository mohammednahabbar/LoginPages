package com.biosteam99.loginpages.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.biosteam99.loginpages.R;
import com.biosteam99.loginpages.model.FoodModel;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class FoodAdapter extends BaseAdapter {

    ArrayList<FoodModel> foodModelArrayList;
    Context context;

    public FoodAdapter(ArrayList<FoodModel> foodModelArrayList,Context context) {
        this.foodModelArrayList = foodModelArrayList;
        this.context=context;
    }

    @Override
    public int getCount() {
        return foodModelArrayList.size();
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
    public View getView(int index, View view, ViewGroup viewGroup) {
        View viewMain;
            viewMain= LayoutInflater.from(context).inflate(R.layout.item_menu_food,null,false);

        TextView txtName,txtPrice;
        CircleImageView imgFood;

        txtName=viewMain.findViewById(R.id.txtName);
        txtPrice=viewMain.findViewById(R.id.txtPrice);
        imgFood=viewMain.findViewById(R.id.imgFood);

        txtName.setText(foodModelArrayList.get(index).getName());
        txtPrice.setText(foodModelArrayList.get(index).getPrice()+" TL ");

        Glide.with(context)
                .load(foodModelArrayList.get(index).getImage())
                .into(imgFood);

        return viewMain;

    }



}
