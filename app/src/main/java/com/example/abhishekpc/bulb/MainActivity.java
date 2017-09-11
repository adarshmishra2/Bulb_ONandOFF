package com.example.abhishekpc.bulb;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void ontapped(View view){
        ImageView bulbon=(ImageView) findViewById(R.id.bulbon);
        ImageView bulboff=(ImageView) findViewById(R.id.bulboff);
        bulbon.animate().alpha(1).setDuration(100);
        bulboff.animate().alpha(0).setDuration(100);
    }

    public void offtapped(View view){
        ImageView bulboff=(ImageView) findViewById(R.id.bulboff);
        ImageView bulbon=(ImageView) findViewById(R.id.bulbon);
        bulbon.animate().alpha(0).setDuration(100);
        bulboff.animate().alpha(1).setDuration(100);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
