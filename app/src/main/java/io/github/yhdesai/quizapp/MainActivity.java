package io.github.yhdesai.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Submit (View view) {
        Intent intent = new Intent(MainActivity.this, Result.class);
        startActivity(intent);}

     public void score (View view){


     }







}
