package com.biosteam99.loginpages;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    SharedPreferences sp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=getSharedPreferences("SHAREDPREFERENCELOGIN2023",MODE_PRIVATE);



        EditText editTextUserName;
        EditText editTextPassword;

        int studentNumbers;
        studentNumbers=0;

        editTextUserName=findViewById(R.id.editUserName);
        editTextPassword=findViewById(R.id.editPassword);

        System.out.println(editTextUserName.getText().toString());

    }

    public void onClickLogin(View view){
        Intent intent;
        SharedPreferences.Editor edit=sp.edit();
        edit.putBoolean("ISLOGIN",true);
        edit.commit();
        intent=new Intent(MainActivity.this,HomeActivity.class);
        intent.putExtra("USERNAME","ANDROID DEVELOPERS");
        intent.putExtra("PASSWORD",123456);
        startActivity(intent);
        finish();
    }
}