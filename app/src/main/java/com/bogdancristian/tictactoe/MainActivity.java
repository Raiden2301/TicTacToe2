package com.bogdancristian.tictactoe;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openGrid1(View view) {
        Intent intent = new Intent(this, GridActivity.class);
        startActivity(intent);
    }

    public void openGrid2(View view) {
        Intent intent = new Intent(this, Grid2Activity.class);
        startActivity(intent);
    }

    public void closeAplication(View view) {
        finish();
        System.exit(0);
    }


//    boolean sound = true;
//    final ImageButton btn = (ImageButton)findViewById(R.id.btnSound);
//
//    private View.OnClickListener biscuit = new View.OnClickListener() {
//         public void onClick(View v) {
//        if(sound){
//            btn.setBackgroundResource(R.drawable.off);
//
//        }else{
//            btn.setBackgroundResource(R.drawable.on);
//        }
//        sound =! sound;
//        }
//    };



}

