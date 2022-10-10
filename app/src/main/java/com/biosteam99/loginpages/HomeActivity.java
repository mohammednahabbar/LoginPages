package com.biosteam99.loginpages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

import com.biosteam99.loginpages.adapter.FoodAdapter;
import com.biosteam99.loginpages.model.FoodModel;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<FoodModel> foodModelArrayList;

   // ArrayList<String> foodNameArrayList;

    Boolean isUserLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        foodModelArrayList=new ArrayList<>();
      //  foodNameArrayList=new ArrayList<>();

        foodModelArrayList.add(new FoodModel("مشاوي","Desc 1",20.2,"https://images.unsplash.com/photo-1504754524776-8f4f37790ca0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                "Restaurant Name 1","Restaurant Location 1"));
        foodModelArrayList.add(new FoodModel("عربي","Desc 2",29.8,"https://images.unsplash.com/photo-1520756977789-ebed5554fb70?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                "Restaurant Name 2","Restaurant Location 2"));
        foodModelArrayList.add(new FoodModel("شاورما","Desc 3",50.8,"https://images.unsplash.com/photo-1520756977789-ebed5554fb70?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                "Restaurant Name 3","Restaurant Location 3"));
        foodModelArrayList.add(new FoodModel("بروستد","Desc 4",39.8,"https://images.unsplash.com/photo-1520756977789-ebed5554fb70?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                "Restaurant Name 4","Restaurant Location 4"));
        foodModelArrayList.add(new FoodModel("مندي","Desc 5",49.8,"https://images.unsplash.com/photo-1504754524776-8f4f37790ca0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                "Restaurant Name 5","Restaurant Location 5"));
        foodModelArrayList.add(new FoodModel("بروستد","Desc 4",39.8,"https://images.unsplash.com/photo-1520756977789-ebed5554fb70?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80",
                "Restaurant Name 4","Restaurant Location 4"));


     /*   for (int index =0;index<foodModelArrayList.size();index++){
            foodNameArrayList.add(foodModelArrayList.get(index).getName());
            System.out.println(foodModelArrayList.get(index).getName() + " - " + index);
        }*/



        FoodAdapter foodAdapter;
        foodAdapter=new FoodAdapter(foodModelArrayList,HomeActivity.this);

     /*   ArrayAdapter<String> arrayAdapter;
        arrayAdapter=new ArrayAdapter<String>(
                HomeActivity.this,
                android.R.layout.simple_spinner_dropdown_item,
                foodNameArrayList);*/


        ListView listViewFood;
        listViewFood=findViewById(R.id.listFood);

        listViewFood.setAdapter(foodAdapter);

        listViewFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                System.out.println(index);

                Intent intent;
                intent=new Intent(HomeActivity.this, FoodDetailsActivity.class);
                intent.putExtra("NAME",foodModelArrayList.get(index).getName());
                intent.putExtra("DESC",foodModelArrayList.get(index).getDesc());
                intent.putExtra("IMAGE",foodModelArrayList.get(index).getImage());
                intent.putExtra("PRICE",foodModelArrayList.get(index).getPrice());
                intent.putExtra("RNAME",foodModelArrayList.get(index).getrNAme());
                intent.putExtra("RLOCATION",foodModelArrayList.get(index).getrLocation());

                startActivity(intent);


            }
        });


//        Spinner spinner;
//        spinner=findViewById(R.id.spinnerFood);
//
//        spinner.setAdapter(foodAdapter);
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int index, long l) {
//                System.out.println(index);
//
//                if (index>0){
//                    Intent intent;
//                    intent=new Intent(HomeActivity.this, FoodDetailsActivity.class);
//                    intent.putExtra("NAME",foodModelArrayList.get(index).getName());
//                    intent.putExtra("DESC",foodModelArrayList.get(index).getDesc());
//                    intent.putExtra("IMAGE",foodModelArrayList.get(index).getImage());
//                    intent.putExtra("PRICE",foodModelArrayList.get(index).getPrice());
//                    intent.putExtra("RNAME",foodModelArrayList.get(index).getrNAme());
//                    intent.putExtra("RLOCATION",foodModelArrayList.get(index).getrLocation());
//
//                    startActivity(intent);
//                }
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });

        GridView gridView=findViewById(R.id.gridViewFood);
        gridView.setAdapter(foodAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                Intent intent;
                intent=new Intent(HomeActivity.this, FoodDetailsActivity.class);
                intent.putExtra("NAME",foodModelArrayList.get(index).getName());
                intent.putExtra("DESC",foodModelArrayList.get(index).getDesc());
                intent.putExtra("IMAGE",foodModelArrayList.get(index).getImage());
                intent.putExtra("PRICE",foodModelArrayList.get(index).getPrice());
                intent.putExtra("RNAME",foodModelArrayList.get(index).getrNAme());
                intent.putExtra("RLOCATION",foodModelArrayList.get(index).getrLocation());

                startActivity(intent);
            }
        });


    }
}