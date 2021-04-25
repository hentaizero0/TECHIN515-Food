package com.example.yue_proj;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class showFood extends AppCompatActivity {
    private ListView obj;
    DBHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);
        mydb = new DBHelper(this);
        ArrayList array_list = mydb.getAllFood();

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array_list);
        obj = (ListView) findViewById(R.id.list_result);
        obj.setAdapter(arrayAdapter);
    }
}
