package com.example.yue_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    DBHelper mydb;
    private ListView obj;
    TextView foodName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydb = new DBHelper(this);
        //get Button
        Button btn = findViewById(R.id.button_start);
        Button add = findViewById(R.id.button_add);
        Button view = findViewById(R.id.button_view);
        //get Text
        foodName = (TextView) findViewById(R.id.foodName);

        //on click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydb.insertFood(foodName.getText().toString());
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFoodListActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, food.class);
        startActivity(intent);
    }

    public void showFoodListActivity(){
        Intent intent_show = new Intent(this, showFood.class);
        startActivity(intent_show);
    }
}