package com.example.a.eviatar4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eviatar4 extends AppCompatActivity {
    int x=0;
   Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eviatar4);
        btn = (Button) findViewById(R.id.btn);
    }

    public void boom(View view) {
        x++;
        btn.setText("this is click number" + x);
        if((x%7==0)||(x/10==7)||(x/100==7)||(x%10==7)) {
            btn.setText("boom");

        }
    }
    }
