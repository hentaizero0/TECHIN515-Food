package com.example.yue_proj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class food extends AppCompatActivity {
    private ListView obj;
    DBHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        mydb = new DBHelper(this);
        ArrayList array_list = mydb.getAllFood();
//        List<String> places = Arrays.asList("Pizza", "Ramen", "Vegan Chickpea Shakshuka", "Pesto Chicken Bake", "Salmon", "Tuna & Avocado Wrap",
//                "BBQ Meatloaf", "Lo Mein", "Instant Pot Cashew Chicken", "Hotpot", "Sichuan Pork", "Braised Pork Balls in Gravy", "Dumplings",
//                "Peking Roasted Duck", "Steamed Vermicelli Rolls", "Kung Pao Chicken", "Ma Po Tofu", "Wontons", "Spring Rolls", "Yangchow Fried Rice");
        //get Button
        TextView m_text = findViewById(R.id.text_result);
        m_text.setText((String) array_list.get(new Random().nextInt(array_list.size())));
    }
}