package com.biosteam99.loginpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class FoodDetailsActivity extends AppCompatActivity {

    String name,desc,image,restaurantName,restaurantLocation;
    double price;

    ImageView imageViewFood;
    TextView txtName,txtPrice,txtDesc,txtRName,txtLocation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

        imageViewFood=findViewById(R.id.imageFood);
        txtName=findViewById(R.id.txtName);
        txtPrice=findViewById(R.id.txtPrice);
        txtDesc=findViewById(R.id.txtDesc);
        txtRName=findViewById(R.id.txtRName);
        txtLocation=findViewById(R.id.txtLocation);



        Bundle intent=getIntent().getExtras();

        name=intent.getString("NAME");
        desc=intent.getString("DESC");
        image=intent.getString("IMAGE");
        restaurantName=intent.getString("RNAME");
        restaurantLocation=intent.getString("RLOCATION");

        price=intent.getDouble("PRICE");


        Glide.with(FoodDetailsActivity.this).load(image).into(imageViewFood);
        txtName.setText(name);
        txtDesc.setText(desc);
        txtPrice.setText(price+" $");

        YoYo.with(Techniques.FadeIn)
                .duration(1000)
                .repeat(1)
                .playOn(txtName);

        txtLocation.setText(restaurantLocation);
        txtRName.setText(restaurantName);


        System.out.println(name + " - " + desc + " - " + restaurantName + " - " + restaurantLocation + " - " + price);
    }
}