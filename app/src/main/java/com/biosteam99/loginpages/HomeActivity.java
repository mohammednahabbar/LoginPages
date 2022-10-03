package com.biosteam99.loginpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.biosteam99.loginpages.model.FoodModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {


    ArrayList<FoodModel> foodModelArrayList;

    ArrayList<String> foodArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        foodModelArrayList=new ArrayList<>();
        foodArray=new ArrayList<>();


        foodModelArrayList.add(new FoodModel("September recipes","Desc 1",20.2,"https://images.unsplash.com/photo-1504754524776-8f4f37790ca0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                "Restaurant Name 1","Restaurant Location 1"));
        foodModelArrayList.add(new FoodModel("Air fryer recipes","Desc 2",29.8,"https://images.unsplash.com/photo-1520756977789-ebed5554fb70?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                "Restaurant Name 2","Restaurant Location 2"));
        foodModelArrayList.add(new FoodModel("Air fryer recipes","Desc 3",50.8,"https://images.unsplash.com/photo-1520756977789-ebed5554fb70?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                "Restaurant Name 3","Restaurant Location 3"));
        foodModelArrayList.add(new FoodModel("Air fryer recipes","Desc 4",39.8,"https://images.unsplash.com/photo-1520756977789-ebed5554fb70?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                "Restaurant Name 4","Restaurant Location 4"));
        foodModelArrayList.add(new FoodModel("Air fryer recipes","Desc 5",49.8,"https://images.unsplash.com/photo-1504754524776-8f4f37790ca0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                "Restaurant Name 5","Restaurant Location 5"));


        for (int i =0 ;i<foodModelArrayList.size();i++){
            foodArray.add(foodModelArrayList.get(i).getName());
            System.out.println(foodModelArrayList.get(i).getName());
        }

        ArrayAdapter<String> arrayAdapter;
        arrayAdapter=new ArrayAdapter<String>(
                HomeActivity.this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                foodArray);


        ListView listViewFood;
        listViewFood=findViewById(R.id.listFood);

        listViewFood.setAdapter(arrayAdapter);

        listViewFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {

                System.out.println(index);

                Toast.makeText(HomeActivity.this,foodArray.get(index),Toast.LENGTH_SHORT).show();

                Intent intent;
                intent=new Intent(HomeActivity.this,FoodDetailsActivity.class);
                intent.putExtra("NAME",foodModelArrayList.get(index).getName());
                intent.putExtra("DESC",foodModelArrayList.get(index).getDesc());
                intent.putExtra("PRICE",foodModelArrayList.get(index).getPrice());
                intent.putExtra("IMAGE",foodModelArrayList.get(index).getImage());
                intent.putExtra("RNAME",foodModelArrayList.get(index).getRestaurantName());
                intent.putExtra("RLOCATION",foodModelArrayList.get(index).getRestaurantLocation());
                startActivity(intent);


              /*  view.setBackgroundResource(R.color.black);
                TextView textView;
                textView=view.findViewById(android.R.id.text1);
                textView.setTextColor(getResources().getColor(R.color.white));
                textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);*/

            }
        });



    }
}