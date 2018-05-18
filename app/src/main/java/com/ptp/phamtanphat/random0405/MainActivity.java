package com.ptp.phamtanphat.random0405;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Random random = new Random();
        // random.nextInt(number) => 0 -> (number -1)
//        int songaunhien = random.nextInt(5);
//        Log.d("BBB",String.valueOf(songaunhien));
        String[] mangchuoi = {"Nguyen van a" , "Nguyen van b"};
        Random random = new Random();
        int index = random.nextInt(mangchuoi.length);
//        3 => 0 1 2
//        int a = random.nextInt();
//        int b = random.nextInt();
        Log.d("BBB", mangchuoi[index] );

    }
}
