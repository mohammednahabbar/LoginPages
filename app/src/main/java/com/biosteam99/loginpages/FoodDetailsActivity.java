package com.biosteam99.loginpages;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class FoodDetailsActivity extends AppCompatActivity {

    TextView txtName,txtDesc,txtPrice,txtRName,txtRLocation;
    ImageView imgFood,imgProfile;

    String name,desc,image,rName,rLocation;
    Double price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

        txtName=findViewById(R.id.txtName);
        txtDesc=findViewById(R.id.txtDesc);
        txtPrice=findViewById(R.id.txtPrice);
        imgFood=findViewById(R.id.imgFood);
        txtRName=findViewById(R.id.txtRName);
        txtRLocation=findViewById(R.id.txtRLocation);
        imgProfile=findViewById(R.id.img);



        Bundle bundle= getIntent().getExtras();

       name=bundle.getString("NAME");
       desc=bundle.getString("DESC");
       image=bundle.getString("IMAGE");
        rLocation=bundle.getString("RLOCATION");
        rName=bundle.getString("RNAME");
        price=bundle.getDouble("PRICE");

        txtName.setText(name);
        txtPrice.setText(String.valueOf(price));
        txtDesc.setText(desc);
        txtRName.setText(rName);
        txtRLocation.setText(rLocation);

        Glide.with(FoodDetailsActivity.this)
                .load(image)
                .into(imgFood);


        Glide.with(FoodDetailsActivity.this)
                .load(image)
                .into(imgProfile);

        YoYo.with(Techniques.BounceIn)
                .duration(1000)
                .repeat(1)
                .playOn(txtName);

        YoYo.with(Techniques.FadeIn)
                .duration(3000)
                .repeat(1)
                .playOn(imgProfile);

    }
}