package com.example.mypet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MyPetActivity extends AppCompatActivity {

     TextView Edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_pet);
        Edit = findViewById(R.id.Cat);
        Edit.setText("У меня есть кот по кличке Мурзик , он появился 2 года назад ,когда его взяли у хозяйки которая отдавала котят " +
                "по началу он боялся и тихонько изучал дом ,но когда приспособился стал очень игривым .На данный момент он часто гуляет и иногда становиться игривым");
    }
}