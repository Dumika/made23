package com.example.made23;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GUI extends AppCompatActivity {
    Button b1;
  //  @SuppressLint("WrongViewCast")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui);
//
//        b1=findViewById(R.id.btnHard);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(GUI.this,  MainActivity.class);
//                startActivity(i);
//            }
//        });
    }
}
