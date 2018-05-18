package com.ptp.phamtanphat.random0405;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
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
//        String[] mangchuoi = {"Nguyen van a" , "Nguyen van b"};
//        Random random = new Random();
//        int index = random.nextInt(mangchuoi.length);
//        3 => 0 1 2
//        int a = random.nextInt();
//        int b = random.nextInt();
//        Log.d("BBB", mangchuoi[index] );
//        String[] mangchuoi = {"Nguyen van C" , "Nguyen van D"};
//        ArrayList<String> mangten = new ArrayList<>();
//        mangten.add("Nguyen Van A");
//        mangten.add("Nguyen Van B");

//         Class vo danh
//         new Random().nextInt(5);
         ArrayList<String> mangquan = new ArrayList<>();
         mangquan.add("Quan 1");
         mangquan.add("Quan 2");
//        mangten.remove(0);
//        mangten.set(0 , "Nguyen Van C");
//        mangten.addAll(mangquan);
//        Log.d("BBB",a + "");
//         5 - 10
//        Random trong khoang (max - min + 1) + min
         int index = new Random().nextInt( 10 - 5 + 1) + 5;
         Log.d("BBB", index + "");
    }
}
