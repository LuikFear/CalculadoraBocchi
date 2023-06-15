package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainDatos extends AppCompatActivity {

    TextView Result;
    Float number1 = 0.0f;
    Float number2 = 0.0f;
    String op = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_datos);
        Result= findViewById(R.id.view);


    }
    public void drawzero(View view) {
        if (Result.getText().toString().equals("0")){

            Result.setText("0");
        }else{
            Result.setText(Result.getText()+"0");
        }
    }

    public void drawone(View view) {
        if (Result.getText().toString().equals("0")){

            Result.setText("1");
        }else{
            Result.setText(Result.getText()+"1");
        }
    }

    public void drawtwo(View view) {
        if (Result.getText().toString().equals("0")){

            Result.setText("2");
        }else{
            Result.setText(Result.getText()+"2");
        }
    }

    public void drawthree(View view) {
        if (Result.getText().toString().equals("0")){

            Result.setText("3");
        }else{
            Result.setText(Result.getText()+"3");
        }

    }

    public void drawfour(View view) {
        if (Result.getText().toString().equals("0")){

            Result.setText("4");
        }else{
            Result.setText(Result.getText()+"4");
        }
    }

    public void drawfive(View view) {
        if (Result.getText().toString().equals("0")){

            Result.setText("5");
        }else{
            Result.setText(Result.getText()+"5");
        }
    }

    public void drawsix(View view) {
        if (Result.getText().toString().equals("0")){

            Result.setText("6");
        }else{
            Result.setText(Result.getText()+"6");
        }
    }

    public void drawseven(View view) {
        if (Result.getText().toString().equals("0")){

            Result.setText("7");
        }else{
            Result.setText(Result.getText()+"7");
        }
    }

    public void draweight(View view) {
        if (Result.getText().toString().equals("0")){

            Result.setText("8");
        }else{
            Result.setText(Result.getText()+"8");
        }
    }

    public void drawnine(View view) {
        if (Result.getText().toString().equals("0")){

            Result.setText("9");
        }else{
            Result.setText(Result.getText()+"9");
        }
    }
























}