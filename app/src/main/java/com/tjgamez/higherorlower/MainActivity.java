package com.tjgamez.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int r;

    public void makeToast(String string){

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }



    public void higherLower(View view){

        EditText number = (EditText) findViewById(R.id.editText);

        int n = Integer.parseInt(number.getText().toString());

        if (n<r){

            makeToast("Higher!");

        } else if (n>r){

            makeToast("Lower!");

        } else {

            makeToast("Correct! Try again!");

            Random rand = new Random();

            r = rand.nextInt(20) + 1;

        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        r = rand.nextInt(20) + 1;
    }
}
