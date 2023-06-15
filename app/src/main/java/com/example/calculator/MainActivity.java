package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView Result;
    Float number1 = 0.0f;
    Float number2 = 0.0f;
    String op = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Result= findViewById(R.id.Result);
       //Result.setText("Holis");

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

    public void dividir(View view) {
        op = "/";
        savenumber1(view);
    }

    public void mult(View view) {
        op    = "x";
        savenumber1(view);
    }

    public void plusultra(View view) {
        op = "+";
savenumber1(view);

    }

    public void minusultra(View view) {
        op ="-";
        savenumber1(view);
    }

    public void clean (View view) {
        Result.setText("0");
        number1 = 0.0f;
        number2 = 0.0f;
        op = "";

    }

    public void savenumber1 (View view) {
       number1 = Float.parseFloat(Result.getText().toString());
       Result.setText("0");
    }
    public void result(View view) {
        Float resultado = 0.0f;
        number2 = Float.parseFloat(Result.getText().toString());

        // plusultra
        if (op.equals("+")) {
            resultado = number1 + number2;
        }
        // minus
        else if (op.equals("-")) {
            resultado = number1 - number2;

            //times
        } else if (op.equals("x")) {
            resultado= number1 * number2;


        }
        // División
        else if (op.equals("/")) {
            if (number2 != 0) {
                resultado = number1 / number2;
            } else {
                // zero
                Toast.makeText(this, "No wey quieres explotar o q¿?", Toast.LENGTH_SHORT).show();
            }
        }



        // Establece el resultado en el TextView llamado Result
        Result.setText(String.valueOf(resultado));
    }

    public void borrar(View view) {

        String text = Result.getText().toString(); Result.setText(text.substring(0,text.length()-1));

    }

    public void comame(View view) {
        if (Result.getText().toString().equals("0")){

            Result.setText(".");
        }else{
            Result.setText(Result.getText()+".");
        }

    }

    public void switchd(View view) {
        Intent intent = new Intent(this, MainDatos.class);
        startActivity(intent);


    }
}

