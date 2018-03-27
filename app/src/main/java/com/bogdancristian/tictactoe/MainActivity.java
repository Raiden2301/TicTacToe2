package com.bogdancristian.tictactoe;

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

    public void openGrid1(View view){
        Intent intent = new Intent (this , GridActivity.class);
        startActivity(intent);
    }

    public void openGrid2(View view){
        Intent intent = new Intent(this , Grid2Activity.class);
        startActivity(intent);
    }

    public void closeAplication(View view){
        finish();
        System.exit(0);
    }
}
